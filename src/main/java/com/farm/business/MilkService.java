package com.farm.business;

import com.farm.people.FarmException;

public interface MilkService {
  public static String MEAT_SERVICE_CODE = "MILK_SERVICE";
  public static double STANDAR_MILK_COST = 5.0;

  double getMilkPriceByLiter(String animalType, int liters) throws FarmException;
}
