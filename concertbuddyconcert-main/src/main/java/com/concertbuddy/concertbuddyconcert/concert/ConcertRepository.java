package com.concertbuddy.concertbuddyconcert.concert;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ConcertRepository extends JpaRepository<Concert, UUID> {

    List<Concert> findAllByName(String name);

    @Query("SELECT c FROM Concert c WHERE c.genre = ?1 OR c.genre = ?2 OR c.genre = ?3 OR c.genre = ?4")
    List<Concert> findConcertByGenre(String genre1, String genre2, String genre3, String genre4);

}
