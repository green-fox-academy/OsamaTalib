package com.greenfoxacademy.shelterapp.services;

import com.greenfoxacademy.shelterapp.models.Animal;
import com.greenfoxacademy.shelterapp.models.Person;
import com.greenfoxacademy.shelterapp.models.Shelter;
import com.greenfoxacademy.shelterapp.repositories.AnimalRepository;
import com.greenfoxacademy.shelterapp.repositories.PersonRepository;
import com.greenfoxacademy.shelterapp.repositories.ShelterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ShelterServiceImpl implements ShelterService {

  ShelterRepository shelterRepository;
  PersonRepository personRepository;
  AnimalRepository animalRepository;

  @Autowired
  public ShelterServiceImpl(ShelterRepository shelterRepository, PersonRepository personRepository, AnimalRepository animalRepository) {
    this.shelterRepository = shelterRepository;
    this.personRepository = personRepository;
    this.animalRepository = animalRepository;
  }

  @Override
  public Shelter createShelter(String shelterName) {
    Shelter shelter = new Shelter(shelterName);
    shelterRepository.save(shelter);
    return shelter;
  }

  @Override
  public List<Shelter> getShelters() {
    return shelterRepository.findAll();
  }

  @Override
  public Shelter getShelterById(Long id) {
    return shelterRepository.findById(id).get();
  }

  @Override
  @Transactional
  public Shelter addAnimal(Long shelterId, Animal newAnimal) {
    Shelter shelter = shelterRepository.findById(shelterId).get();
    shelter.addAnimal(newAnimal);
    shelterRepository.save(shelter);
    return shelter;
  }

  @Override
  public void adopt(Long shelterId, Long userId, Long animalId) {
    Shelter shelter = shelterRepository.findById(shelterId).get();
    Person person = personRepository.findById(userId).get();
    Animal animal = animalRepository.findById(animalId).get();

    person.addAnimal(animal);
    personRepository.save(person);
    removeAnimalFromShelter(shelter, animal);
  }

  private void removeAnimalFromShelter(Shelter shelter, Animal animal) {

    Animal animalToRemove = findAnimal(shelter, animal);
    if (animalToRemove != null) {
      shelter.getAnimals().remove(animalToRemove);
      shelterRepository.save(shelter);
    }
  }

  private Animal findAnimal(Shelter shelter, Animal animal) {
    for (Animal shelterAnimal : shelter.getAnimals()) {
      if (shelterAnimal.getId() == animal.getId()) {
        return shelterAnimal;
      }
    }
    return null;
  }

}