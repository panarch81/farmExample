package com.farm.utils;

import com.farm.domain.Animal;
import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {

  @Override
  public int compare(Animal animal, Animal t1) {
    return t1.getName().compareTo(animal.getName());
  }
}
