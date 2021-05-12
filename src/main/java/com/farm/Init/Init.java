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
import java.util.ArrayList;
import java.util.List;

public class Init {
  public static void main(String[] args){
    List<Animal> animals = new ArrayList<>();
    Cow cowA = new Cow();
    animals.add(cowA);
    animals.add(new Chicken());
    animals.add(new Goat());

    Farm farm = new Farm(
                        animals,
                        List.of(new Farmer())
                );
    manageAnimals(farm);
    MilkService milkService = new MilkServiceImpl();
    System.out.println("The farmer is: "+farm.getOwners().get(0).getName());
    try {
      double milkPriceByLiter = milkService.getMilkPriceByLiter(AnimalType.CHICKEN.name(), 2);
    }catch (FarmException e){
      System.out.println(e.getMessage());
    }finally {
      System.out.println("happy farm");
    }
  }

  private static void manageAnimals(Farm farm) {
    List<Animal> animals = new ArrayList<>();
    Cow cowA = new Cow();
    animals.add(cowA);
    animals.add(new Chicken());
    animals.add(new Goat());
    farm.setAnimals(animals);

    System.out.println("-----Animals in the farm:");
    farm.getAnimals().stream().forEach(animal -> System.out.println(animal.getName()));
    System.out.println("-----");

    System.out.println("The Cow gives: "+farm.getProductTypeByAnimal(cowA));
  }

}
