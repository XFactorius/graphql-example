package com.example.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.model.People;
import com.example.graphql.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private PeopleRepository repository;

    public List<People> people() {
        return repository.findAll();
    }

    public List<People> findPeople(Long id) {
        return Collections.singletonList(repository.findById(id).get());
    }

}
