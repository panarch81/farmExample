package com.farm.business;

import com.farm.people.FarmException;

public class MilkServiceImpl implements MilkService{

  @Override
  public double getMilkPriceByLiter(String animalType, int liters) throws FarmException {
    if("COW".equals(animalType)){
      return STANDAR_MILK_COST * liters;
    }
    else if("GOAT".equals(animalType)){
      return STANDAR_MILK_COST * liters;
    }
    throw new FarmException("Animal type without milk to sell");
  }
}
