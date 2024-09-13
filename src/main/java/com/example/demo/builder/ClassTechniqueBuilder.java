package com.example.demo.builder;

import com.example.demo.entity.ClassTechnique;
import com.example.demo.entity.HeroClass;
import com.example.demo.entity.HeroTechnique;

public class ClassTechniqueBuilder {

  public static ClassTechnique newClassTechnique(HeroClass heroClass, HeroTechnique heroTechnique){
    ClassTechnique classTechnique = new ClassTechnique();
    classTechnique.setId(0);
    classTechnique.setHeroClass(heroClass);
    classTechnique.setHeroTechnique(heroTechnique);

    return classTechnique;
  }

}
