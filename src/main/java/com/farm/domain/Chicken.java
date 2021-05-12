package com.farm.domain;

import lombok.Data;

@Data
public class Chicken extends Animal{
    @Override
    public String getName() {
      return "Super Chicken";
    }
}
