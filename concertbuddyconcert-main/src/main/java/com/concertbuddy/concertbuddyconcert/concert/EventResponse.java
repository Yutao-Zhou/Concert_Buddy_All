package com.concertbuddy.concertbuddyconcert.concert;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.net.URL;
import java.time.LocalDate;
import java.util.List;

public class EventResponse {
    public EmbeddedOutter _embedded;
    public Links _links;
    public Page page;
    public EmbeddedOutter get_embedded() {
        return _embedded;
    }
}

class EmbeddedOutter {
    public List<Event> events;
    public List<Venue> venues;
    public List<Attraction> attractions;

    public List<Event> getEvents() {
        return events;
    }
}

class Event {
    public String name;
    public String type;
    public String id;
    public boolean test;
    public String url;
    public String locale;
    public List<EventImage> images;
    @JsonIgnore
    public Sales sales;
    public Dates dates;
    public List<Classification> classifications;
    public List<Outlet> outlets;
    public Seatmap seatmap;
    public Ticketing ticketing;
    @JsonIgnore
    public Links _links;
    public EmbeddedInner _embedded;

    public String getName() {
        return name;
    }

    public List<EventImage> getImages() {
        return images;
    }

    public Dates getDates() {
        return dates;
    }

    public List<Classification> getClassifications() {
        return classifications;
    }

    public EmbeddedInner get_embedded() {
        return _embedded;
    }
}

class EmbeddedInner {
    public List<Venue> venues;
    public List<Attraction> attractions;

    public List<Venue> getVenues() {
        return venues;
    }

    public List<Attraction> getAttractions() {
        return attractions;
    }
}

class EventImage {
    public String ratio;
    public String url;
    public int width;
    public int height;
    public boolean fallback;

    public String getUrl() {
        return url;
    }
}


class Sales {
    
}

class Public {
    public String startDateTime;
    public boolean startTBD;
    public boolean startTBA;
    public String endDateTime;
}

class Dates {
    public Start start;
    @JsonIgnore
    public Status status;
    public boolean spanMultipleDays;
    public String timezone;
    public Start getStart() {
        return start;
    }
}

class Start {
    public LocalDate localDate;
    public String localTime;
    public String dateTime;
    public boolean dateTBD;
    public boolean dateTBA;
    public boolean timeTBA;
    public boolean noSpecificTime;

    public LocalDate getLocalDate() {
        return localDate;
    }
}

class Classification {
    public boolean primary;
    public Segment segment;
    public Genre genre;
    public SubGenre subGenre;
    public boolean family;

    public Genre getGenre() {
        return genre;
    }

    public SubGenre getSubGenre() {
        return subGenre;
    }
}

class Segment {
    public String id;
    public String name;
}

class Genre {
    public String id;
    public String name;

    public String getName() {
        return name;
    }
}

class SubGenre {
    public String id;
    public String name;

    public String getName() {
        return name;
    }
}

class Outlet {
    public String url;
    public String type;
}

class Seatmap {
    public String staticUrl;
}

class Ticketing {
    public AllInclusivePricing allInclusivePricing;
}

class AllInclusivePricing {
    public boolean enabled;
}

class Links {
    public Link first;
    public Link self;
    public Link next;
    public Link last;
}

class Link {
    public String href;
    public String url;
}

class Page {
    public int size;
    public int totalElements;
    public int totalPages;
    public int number;
}

class Venue {
    public String name;
    public String type;
    public String id;
    public boolean test;
    public String locale;
    public String postalCode;
    public String timezone;
    public City city;
    public State state;
    public Country country;
    public Address address;
    public Location location;
    public List<Dma> dmas;
    public UpcomingEvents upcomingEvents;
    public Links _links;

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}

class City {
    public String name;
}

class State {
    public String name;
    public String stateCode;
}

class Country {
    public String name;
    public String countryCode;
}

class Address {
    public String line1;

    public String getLine1() {
        return line1;
    }
}

class Location {
    public String longitude;
    public String latitude;
}

class Dma {
    public int id;
}

class UpcomingEvents {
    public int tmr;
    public int ticketmaster;
    public int _total;
    public int _filtered;
}

class Attraction {
    public String name;
    public String type;
    public String id;
    public boolean test;
    public String url;
    public String locale;
    public ExternalLinks externalLinks;
    public List<String> aliases;
    public List<EventImage> images;
    public List<AttractionClassification> classifications;
    public UpcomingEvents upcomingEvents;
    public Links _links;

    public String getName() {
        return name;
    }
}

class AttractionClassification {
    public boolean primary;
    public Segment segment;
    public Genre genre;
    public SubGenre subGenre;
    public Type type;
    public Type subType;
    public boolean family;
}

class Type {
    public String id;
    public String name;
}

class ExternalLinks {
    public List<Link> twitter;
    public List<Link> wiki;
    public List<Link> facebook;
    public List<Link> instagram;
    public List<Link> homepage;
}
