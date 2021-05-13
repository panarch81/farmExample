package com.farm.utils;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
  public static Map initializeDictionary(){
    Map<String,String> animalsInSpanish =  new HashMap<>();
    animalsInSpanish.put("Cow","Vaca");
    animalsInSpanish.put("Chicken","Gallina");
    animalsInSpanish.put("Goat","Cabra");
    return animalsInSpanish;
  }
}
