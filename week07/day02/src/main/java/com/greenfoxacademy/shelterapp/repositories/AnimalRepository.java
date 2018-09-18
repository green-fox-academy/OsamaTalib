package com.greenfoxacademy.shelterapp.repositories;

import com.greenfoxacademy.shelterapp.models.Animal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Long> {
}