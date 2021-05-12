package com.farm.domain;

import com.farm.people.Person;
import java.util.List;

public class Farm {
  private List<Animal> animals;
  private List<Person> owners;
  private List<Person> clients;

  public List<Animal> getAnimals() {
    return animals;
  }

  public Farm(List<Animal> animals, List<Person> owners) {
    this.animals = animals;
    this.owners = owners;
  }

  public ProductType getProductTypeByAnimal(Animal animal){
    return animal.getAnimalType().getProductType();
  }
  public void setAnimals(List<Animal> animals) {
    this.animals = animals;
  }

  public List<Person> getOwners() {
    return owners;
  }

  public void setOwners(List<Person> owners) {
    this.owners = owners;
  }

  public List<Person> getClients() {
    return clients;
  }

  public void setClients(List<Person> clients) {
    this.clients = clients;
  }
}
