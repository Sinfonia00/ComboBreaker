package com.example.demo.builder;

import com.example.demo.entity.Hero;
import com.example.demo.entity.HeroClass;
import com.example.demo.entity.HeroTechnique;
import com.example.demo.entity.User;
import com.example.demo.form.HeroForm;

public class HeroBuilder {

  public static Hero newHero(User user, HeroClass heroClass, String name, HeroTechnique t1, HeroTechnique t2, HeroTechnique t3, HeroTechnique t4){
    Hero hero = new Hero();
    hero.setId(0);
    hero.setUser(user);
    hero.setHeroClass(heroClass);

    hero.setName(name);
    hero.setLevel(1);
    hero.setStrength(heroClass.getStartingStrength());
    hero.setDexterity(heroClass.getStartingDexterity());
    hero.setConstitution(heroClass.getStartingConstitution());
    hero.setIntelligence(heroClass.getStartingIntelligence());
    hero.setWisdom(heroClass.getStartingWisdom());
    hero.setCharisma(heroClass.getStartingCharisma());
    hero.setStatsPoints(heroClass.getExtraStatsPoints());

    hero.setHeroTechnique1(t1);
    hero.setHeroTechnique2(t2);
    hero.setHeroTechnique3(t3);
    hero.setHeroTechnique4(t4);

    return hero;
  }

  public static Hero toEntity(HeroForm form){
    Hero entity = new Hero();
    entity.setId(form.getId());
    entity.setName(form.getName());
    HeroClass heroClass = new HeroClass();
    heroClass.setId(form.getHeroClass());
    entity.setHeroClass(heroClass);

    return entity;
  }

}
