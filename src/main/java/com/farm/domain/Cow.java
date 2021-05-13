package com.farm.domain;

import lombok.Data;

@Data
public class Cow extends Animal{
  private boolean isMeetProvider;
  private boolean isMilkProvider;

  private String typoCollar;

  @Override
  public String getName() {
    return "Cow";
  }

  @Override
  public AnimalType getAnimalType() {
    return AnimalType.COW;
  }
}
