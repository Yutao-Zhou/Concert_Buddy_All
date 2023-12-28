package com.concertbuddy.concertbuddyuser.graphql.config;

import com.concertbuddy.concertbuddyuser.graphql.resolver.SongMutationResolver;
import com.concertbuddy.concertbuddyuser.graphql.resolver.SongQueryResolver;
import com.concertbuddy.concertbuddyuser.graphql.resolver.UserMutationResolver;
import com.concertbuddy.concertbuddyuser.graphql.resolver.UserQueryResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

import java.util.UUID;

@Configuration
public class GraphQLConfiguration {

    @Bean
    public RuntimeWiringConfigurer runtimeWiringConfigurer(
            SongQueryResolver songQueryResolver,
            SongMutationResolver songMutationResolver,
            UserQueryResolver userQueryResolver,
            UserMutationResolver userMutationResolver) {

        return builder -> builder
                .type("Query", wiring -> wiring
                        .dataFetcher("song", env -> songQueryResolver.getSong(UUID.fromString(env.getArgument("id"))))
                        .dataFetcher("songs", env -> songQueryResolver.getAllSongs())
                        .dataFetcher("user", env -> userQueryResolver.getUser(UUID.fromString(env.getArgument("id"))))
                        .dataFetcher("users", env -> userQueryResolver.getAllUsers())
                )
                .type("Mutation", wiring -> wiring
                        .dataFetcher("createSong", env -> songMutationResolver.createSong(
                                env.getArgument("name"),
                                env.getArgument("artist"),
                                env.getArgument("genre")
                        ))
                        .dataFetcher("deleteSong", env -> songMutationResolver.deleteSong(UUID.fromString(env.getArgument("id"))))
                );
    }
}
