package com.concertbuddy.concertbuddyuser.song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class SongService {

    private final SongRepository songRepository;

    @Autowired
    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public List<Song> getSongs() {
        return songRepository.findAll();
    }

    public Song getSongById(UUID songId) {
        Optional<Song> optionalSongById = songRepository.findById(songId);
        if (optionalSongById.isEmpty()) {
            throw new IllegalStateException(
                    "Song with id " + songId + " does not exist"
            );
        }
        return optionalSongById.get();
    }

    public UUID addNewSong(Song song) {
        List<Song> songsByName = songRepository.findAllByName(song.getName());
        for (Song e : songsByName) {
            if (e.getArtist().equals(song.getArtist())) {
                return e.getId();
            }
        }
        return songRepository.save(song).getId();
    }

    public void deleteSong(UUID songId) {
        boolean exists = songRepository.existsById(songId);
        if (!exists) {
            throw new IllegalStateException(
                    "Song with id " + songId + " does not exist"
            );
        }
        songRepository.deleteById(songId);
    }

}
