package com.practice.springbootmongodb.services;

import com.practice.springbootmongodb.collection.Person;
import org.bson.Document;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IPersonService {
    String save(com.practice.springbootmongodb.collection.Person person);

    List<Person> getPersonStartWith(String name);

    void delete(String id);

    List<Person> getPersonByAge(Integer minAge, Integer maxAge);

    Page<Person> search(String name, Integer minAge, Integer maxAge, String city, Pageable pageable);

    List<Document> getOldestPersonByCity();

    List<Document> getPopulationByCity();
}
