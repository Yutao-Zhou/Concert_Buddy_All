package com.concertbuddy.concertbuddyuser.user;

import com.concertbuddy.concertbuddyuser.song.Song;
import com.concertbuddy.concertbuddyuser.song.SongController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping(path = "api/v1/users")
@CrossOrigin(origins = "*")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers(@RequestParam("nameFilter") Optional<String> nameFilter) {
        if (nameFilter.isEmpty()) {
            return userService.getUsers();
        }
        return userService.getFilteredUsers(nameFilter.get());
    }

    @GetMapping(path="{userId}")
    public User getUserById(@PathVariable("userId") UUID userId) {
        return userService.getUserById(userId);
    }

    @PostMapping
    public UUID registerNewUser(@RequestBody User user) {
        return userService.addNewUser(user);
    }

    @PutMapping
    public UUID updateUser(@RequestBody User user) {
        return userService.addNewUser(user);
    }

    @DeleteMapping(path="{userId}")
    public void deleteUser(@PathVariable("userId") UUID userId) {
        userService.deleteUser(userId);
    }

    @GetMapping(path="{userId}/songs")
    public ResponseEntity<CollectionModel<EntityModel<Song>>> getUserSongs(@PathVariable("userId") UUID userId) {
        User user = userService.getUserById(userId);
        List<EntityModel<Song>> songsWithLinks = user.getSongs().stream().map(
                song -> EntityModel.of(
                        song,
                        linkTo(methodOn(SongController.class).getSongById(song.getId())).withSelfRel()
                )
        ).toList();
        return ResponseEntity.ok(CollectionModel.of(songsWithLinks));
    }

    @PutMapping(path="{userId}/songs/{songId}")
    public void updateUserSong(@PathVariable("userId") UUID userId, @PathVariable("songId") UUID songId) {
        userService.addNewUserSong(userId, songId);
    }

    @DeleteMapping(path="{userId}/songs/{songId}")
    public void deleteUserSong(@PathVariable("userId") UUID userId, @PathVariable("songId") UUID songId) {
        userService.deleteUserSong(userId, songId);
    }

    @PutMapping(path="{userId}/SpotifySync")
    public void SpotifySync(@PathVariable("userId") UUID userId, @RequestParam("SpotifyAccountToken") String SpotifyAccountToken) {
        userService.SpotifySync(userId, SpotifyAccountToken);
    }
}
