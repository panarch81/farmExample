package com.farm.business;

public class MeatServiceImpl implements MeatService{
  private double goatPrice = 10.0;
  private double cowPrice = 15.0;

  @Override
  public double getMeatPriceByKilogram(String animalType, int kilogramsAmount) throws Exception {
    if("COW".equals(animalType)){
      return cowPrice * kilogramsAmount;
    }
    else if("GOAT".equals(animalType)){
        return goatPrice * kilogramsAmount;
    }
    throw new Exception("Animal type without meet to sell");
  }
}
