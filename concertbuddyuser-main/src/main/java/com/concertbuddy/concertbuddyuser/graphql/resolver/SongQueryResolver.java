package com.concertbuddy.concertbuddyuser.graphql.resolver;

import com.concertbuddy.concertbuddyuser.song.Song;
import com.concertbuddy.concertbuddyuser.song.SongService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;


@Component
public class SongQueryResolver implements GraphQLQueryResolver {

    private final SongService songService;

    @Autowired
    public SongQueryResolver(SongService songService) {
        this.songService = songService;
    }

    public Song getSong(UUID id) {
        return songService.getSongById(id);
    }

    public List<Song> getAllSongs() {
        return songService.getSongs();
    }
}
