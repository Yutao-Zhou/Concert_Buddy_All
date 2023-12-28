package com.concertbuddy.concertbuddyuser.graphql.resolver;

import graphql.kickstart.tools.GraphQLMutationResolver;
import com.concertbuddy.concertbuddyuser.user.User;
import com.concertbuddy.concertbuddyuser.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.UUID;


@Component
public class UserMutationResolver implements GraphQLMutationResolver {

    private final UserService userService;

    @Autowired
    public UserMutationResolver(UserService userService) {
        this.userService = userService;
    }

    public User createUser(String name, String email, String password, LocalDate dateOfBirth, String profilePictureUrl) {
        User newUser = new User(UUID.randomUUID(), name, dateOfBirth, email, password, profilePictureUrl, null);
        userService.addNewUser(newUser);
        return newUser;
    }

}

