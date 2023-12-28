package com.concertbuddy.concertbuddyconcert.concert;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.databind.DeserializationFeature;

import org.javatuples.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ConcertService {

    private final ConcertRepository concertRepository;

    @Autowired
    public ConcertService(ConcertRepository concertRepository) {
        this.concertRepository = concertRepository;
    }

    public List<Concert> getConcerts() {
        return concertRepository.findConcertByGenre("Rock", "Country", "R&B", "Pop");
    }

    public List<Concert> getConcertsPage(int page, int size) {
        List<Concert> AllConcerts = concertRepository.findConcertByGenre("Rock", "Country", "R&B", "Pop");
        return AllConcerts.subList(page*size, page*size+size);
    }

    public Concert getConcertById(UUID concertId) {
        Optional<Concert> optionalConcertById = concertRepository.findById(concertId);
        if (optionalConcertById.isEmpty()) {
            throw new IllegalStateException(
                    "Concert with id " + concertId + " does not exist"
            );
        }
        return optionalConcertById.get();
    }

    public void addNewConcert(Concert concert) {
        List<Concert> concertsByName = concertRepository.findAllByName(concert.getName());
        if (concertsByName.stream().anyMatch(e -> e.getPerformingArtist().equals(concert.getPerformingArtist()))) {
            throw new IllegalStateException("This concert already exists");
        }
        concertRepository.save(concert);
    }

    public void deleteConcert(UUID concertId) {
        boolean exists = concertRepository.existsById(concertId);
        if (!exists) {
            throw new IllegalStateException(
                    "Concert with id " + concertId + " does not exist"
            );
        }
        concertRepository.deleteById(concertId);
    }

    public void TicketmasterSync() {
        final String uri = "https://app.ticketmaster.com/discovery/v2/events.json?size=200&apikey=V3mzdMS0MfPMG5g7EaueEw7QuGHV4RB9&classificationName=music";

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(uri, String.class);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            EventResponse eventResponse = objectMapper.readValue(response, EventResponse.class);

            if (eventResponse != null && eventResponse.get_embedded() != null) {
                List<Event> events = eventResponse.get_embedded().getEvents();

                for (Event event : events) {
                    String eventName = event.getName();
                    String venue = "";
                    String joinedArtists = "";
                    LocalDate eventDates;
                    String genre = "";
                    String subGenre = "";

                    List<EventImage> eventImages = event.getImages();
                    List<Venue> venues = event.get_embedded().getVenues();
                    List<Attraction> attractions = event.get_embedded().getAttractions();
                    if (!venues.isEmpty()) {
                        venue = venues.get(0).getName() + ',' + venues.get(0).getAddress().getLine1();
                    }
                    if (!attractions.isEmpty()) {
                        ArrayList<String> performingArtists = new ArrayList<>();
                        for (Attraction attraction : attractions) {
                            performingArtists.add(attraction.getName());
                        }
                        joinedArtists = String.join(", ", performingArtists);
                    }
                    eventDates = event.getDates().getStart().getLocalDate();
                    List<Classification> eventClassifications = event.getClassifications();
                    if (!eventClassifications.isEmpty()) {
                        genre = eventClassifications.get(0).getGenre().getName();
                        subGenre = eventClassifications.get(0).getSubGenre().getName();
                    }

                    Concert concert = new Concert(eventName, venue, joinedArtists, eventDates, genre, subGenre);
                    concertRepository.save(concert);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void addNewUserInfo(UUID concertId, UUID userId, Status status) {
        Optional<Concert> optionalConcertById = concertRepository.findById(concertId);
        if (optionalConcertById.isEmpty()) {
            throw new IllegalStateException(
                    "Concert with id " + concertId + " does not exist"
            );
        }
        Concert concertById =  optionalConcertById.get();

        Pair<UUID, Status> userInfoToAdd = Pair.with(userId, status);
        List<Pair<UUID, Status>> UsersInfo = concertById.getUsersInfo();

        int index = 0;
        boolean userInfoToAddIsNew = true;
        for (Pair<UUID, Status> UserInfo : UsersInfo) {
            if (UserInfo.getValue0().equals(userId)) {
                UsersInfo.set(index, userInfoToAdd);
                userInfoToAddIsNew = false;
                break;
            }
            index ++;
        }
        if (userInfoToAddIsNew) {
            UsersInfo.add(userInfoToAdd);
        }

        concertById.setUsersInfo(UsersInfo);
        concertRepository.save(concertById);
    }

    public void deleteUserInfo(UUID concertId, UUID userId, Status status) {
        Optional<Concert> optionalConcertById = concertRepository.findById(concertId);
        if (optionalConcertById.isEmpty()) {
            throw new IllegalStateException(
                    "Concert with id " + concertId + " does not exist"
            );
        }
        Concert concertById =  optionalConcertById.get();

        List<Pair<UUID, Status>> UsersInfo = concertById.getUsersInfo();

        int index = 0;
        for (Pair<UUID, Status> UserInfo : UsersInfo) {
            if (UserInfo.getValue0().equals(userId)) {
                UsersInfo.remove(index);
                break;
            }
            index ++;
        }

        concertById.setUsersInfo(UsersInfo);
        concertRepository.save(concertById);
    }

    public String cicdTest() {
        return "This endpoint is reserved for CI/CD demo. Changed for CI/CD demo.";
    }
}
