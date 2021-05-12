package com.farm.domain;

import lombok.Data;

@Data
public class Goat extends Animal{
  @Override
  public String getName() {
    return "Mountain Goat";
  }
}
