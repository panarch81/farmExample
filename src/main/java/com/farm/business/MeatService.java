package com.farm.business;

public interface MeatService {
  public static String MEAT_SERVICE_CODE = "MEAT_SERVICE";
  public static double DEFAULT_MEAT_COST = 0.0;

  double getMeatPriceByKilogram(String animalType, int kilogramsAmount) throws Exception;
}
