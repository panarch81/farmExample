package com.farm.domain;

public class Product extends Animal implements Buyable {
  public String name;

  public String getAnimal(AnimalType animalType){
    return animalType.name();
  }

  public String getProduct(AnimalType animalType) {
    if(AnimalType.COW.name().equals(animalType.name())){
      return AnimalType.COW.getProductType().name();
    }
    else if (AnimalType.GOAT.name().equals(animalType.name())){
      return AnimalType.GOAT.getProductType().name();
    }
    else if (AnimalType.CHICKEN.name().equals(animalType.name())){
      return AnimalType.CHICKEN.getProductType().name();
    }
    return null;
  }

  @Override
  public String getComprador() {
    return "Comprador con dinero";
  }
}
