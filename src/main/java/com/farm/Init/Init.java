package com.farm.Init;

import com.farm.business.MilkService;
import com.farm.business.MilkServiceImpl;
import com.farm.domain.Animal;
import com.farm.domain.AnimalType;
import com.farm.domain.Chicken;
import com.farm.domain.Cow;
import com.farm.domain.Farm;
import com.farm.domain.Goat;
import com.farm.people.FarmException;
import com.farm.people.Farmer;
import com.farm.utils.AnimalComparator;
import com.farm.utils.Dictionary;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Init {
  public static void main(String[] args){
    List<Animal> animals = getAnimals();
    Farm farm = new Farm(
                        animals,
                        List.of(new Farmer())
                );

    manageAnimals(farm);
    MilkService milkService = new MilkServiceImpl();

    System.out.println("Milk price for the animal is:"+
        getMilkPrice(milkService, args[0],Integer.valueOf(args[1])));
    System.out.println("Please negotiate with the farmer who is: "+farm.getOwners().get(0).getName());
    Map translatedAnimals = Dictionary.initializeDictionary();

    Set animalsInSpanish = translatedAnimals.entrySet();
    System.out.println(animalsInSpanish);

  }

  private static double getMilkPrice(MilkService milkService, String animalTypeName, int liter) {
    try {
      return milkService.getMilkPriceByLiter(animalTypeName, 2);
    }catch (FarmException e){
      System.out.println(e.getMessage());
    }finally {
      System.out.println("happy farm");
    }
    return 0;
  }

  private static List<Animal> getAnimals() {
    List<Animal> animals = new ArrayList<>();
    Cow cowA = new Cow();
    animals.add(cowA);
    animals.add(new Goat());
    animals.add(new Chicken());
    return animals;
  }

  private static void manageAnimals(Farm farm) {
    for(int i= 0; i< farm.getAnimals().size(); i++){
      System.out.println(farm.getAnimals().get(i).getName());
    }
//using the Comparable implementation inside Animal using natural order
    Collections.sort(farm.getAnimals());
    System.out.println("------");
    for(int i= 0; i< farm.getAnimals().size(); i++){
      System.out.println(farm.getAnimals().get(i).getName());
    }
    System.out.println("------****** ----");

    //using the Comparator implementation in the AnimalComparator using reverse order
    Collections.sort(farm.getAnimals(),new AnimalComparator());

    for(int i= 0; i< farm.getAnimals().size(); i++){
      System.out.println(farm.getAnimals().get(i).getName());
    }
    System.out.println("------*######### ----");
    System.out.println("The Cow gives: "+farm.getProductTypeByAnimal(new Cow()));
  }

}
