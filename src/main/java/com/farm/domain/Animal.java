package com.farm.domain;

import lombok.Data;

@Data
public class Animal implements Comparable<Animal>{
  private String name;
  private String color;
  private AnimalType animalType;
  private int edad;

  @Override
  public int compareTo(Animal animal) {
    return this.getName().compareTo(animal.getName());
  }
}
