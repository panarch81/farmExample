package com.farm.people;

import com.farm.domain.Animal;
import java.util.List;

public class Farmer implements Person{
  List<Animal> animals;

  @Override
  public String getName() {
    return "Mr. Acme";
  }
}
