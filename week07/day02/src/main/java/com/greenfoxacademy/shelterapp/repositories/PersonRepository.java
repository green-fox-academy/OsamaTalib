package com.greenfoxacademy.shelterapp.repositories;

import com.greenfoxacademy.shelterapp.models.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}