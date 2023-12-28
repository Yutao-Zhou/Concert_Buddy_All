package com.concertbuddy.concertbuddyconcert.concert;

import org.javatuples.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(path = "api/v1/concerts")
@CrossOrigin(origins = "*")
public class ConcertController {

    private final ConcertService concertService;

    @Autowired
    public ConcertController(ConcertService concertService) {
        this.concertService = concertService;
    }

    @GetMapping()
    public List<Concert> getConcerts(@RequestParam("page") Optional<Integer> page, @RequestParam("size") Optional<Integer> size) {
        if (page.isEmpty() && size.isEmpty()){
            return concertService.getConcerts();
        } else if (page.isEmpty() || size.isEmpty()) {
            throw new IllegalStateException(
                    "page and size must be both empty or both not empty"
            );
        } else {
            return concertService.getConcertsPage(page.get(), size.get());
        }
    }

    @GetMapping(path="{concertId}")
    public Concert getConcertById(@PathVariable("concertId") UUID concertId) {
        return concertService.getConcertById(concertId);
    }

    @PostMapping
    public void registerNewConcert(@RequestBody Concert concert) {
        concertService.addNewConcert(concert);
    }

    @PutMapping
    public void updateConcert(@RequestBody Concert concert) {
        concertService.addNewConcert(concert);
    }

    @DeleteMapping(path="{concertId}")
    public void deleteConcert(@PathVariable("concertId") UUID concertId) {
        concertService.deleteConcert(concertId);
    }

    @GetMapping(path="{concertId}/usersInfo")
    public List<Pair<UUID, Status>> getUsersInfo(@PathVariable("concertId") UUID concertId) {
        return concertService.getConcertById(concertId).getUsersInfo();
    }

    @PutMapping(path="{concertId}/usersInfo/{userId}")
    public void updateUserInfo(@PathVariable("concertId") UUID concertId, @PathVariable("userId") UUID userId, @RequestBody Status status) {
        concertService.addNewUserInfo(concertId, userId, status);
    }

    @DeleteMapping(path="{concertId}/usersInfo/{userId}")
    public void deleteUserInfo(@PathVariable("concertId") UUID concertId,@PathVariable("userId") UUID userId, @RequestBody Status status) {
        concertService.deleteUserInfo(concertId, userId, status);
    }

    @PutMapping(path="TicketmasterSync")
    public void TicketmasterSync() {
        concertService.TicketmasterSync();
    }

    @GetMapping(path="CICD")
    public String cicdTest() { return concertService.cicdTest(); }
}
