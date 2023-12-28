package com.concertbuddy.concertbuddyuser.graphql.resolver;

import com.concertbuddy.concertbuddyuser.song.Song;
import com.concertbuddy.concertbuddyuser.song.SongService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class SongMutationResolver implements GraphQLMutationResolver {

    private final SongService songService;

    @Autowired
    public SongMutationResolver(SongService songService) {
        this.songService = songService;
    }

    public Song createSong(String name, String artist, List<String> genre) {
        Song song = new Song(UUID.randomUUID(), name, artist, genre);
        UUID songId = songService.addNewSong(song);
        return songService.getSongById(songId); // Fetching the song after save to return the complete entity
    }

    public Boolean deleteSong(UUID id) {
        songService.deleteSong(id);
        return true; 
    }
}
