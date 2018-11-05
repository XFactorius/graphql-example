package com.example.graphql.mutations;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.model.People;
import com.example.graphql.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private PeopleRepository repository;

    public People createPeople(String name) {
        People people = new People();
        people.setName(name);

        return repository.save(people);
    }
}
