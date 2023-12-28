package com.concertbuddy.concertbuddyuser.graphql.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import com.concertbuddy.concertbuddyuser.user.User;
import com.concertbuddy.concertbuddyuser.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;


@Component
public class UserQueryResolver implements GraphQLQueryResolver {

    private final UserService userService;

    @Autowired
    public UserQueryResolver(UserService userService) {
        this.userService = userService;
    }

    public User getUser(UUID id) {
        return userService.getUserById(id);
    }

    public List<User> getAllUsers() {
        return userService.getUsers();
    }
}
