package com.example.demo.builder;

import com.example.demo.entity.HeroClass;

public class HeroClassBuilder {

  public static HeroClass newHeroClass(String className, int startingStrength, int startingDexterity, int startingConstitution, int startingIntelligence, int startingWisdom, int startingCharisma, int statsPoints){
    HeroClass heroClass = new HeroClass();
    heroClass.setClassName(className);
    heroClass.setStartingStrength(startingStrength);
    heroClass.setStartingDexterity(startingDexterity);
    heroClass.setStartingConstitution(startingConstitution);
    heroClass.setStartingIntelligence(startingIntelligence);
    heroClass.setStartingWisdom(startingWisdom);
    heroClass.setStartingCharisma(startingCharisma);
    heroClass.setExtraStatsPoints(statsPoints);

    return heroClass;
  }

}
