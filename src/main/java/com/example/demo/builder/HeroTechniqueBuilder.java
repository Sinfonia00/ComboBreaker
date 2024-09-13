package com.example.demo.builder;

import com.example.demo.entity.HeroTechnique;

public class HeroTechniqueBuilder {

  public static HeroTechnique newTechnique(String name, String description, String iconUrl, int activationCost, int maintenanceCost, String effect){
    HeroTechnique heroTechnique = new HeroTechnique();
    heroTechnique.setId(0);
    heroTechnique.setTechniqueName(name);
    heroTechnique.setDescription(description);
    heroTechnique.setIcon(null);
    heroTechnique.setStar(1);
    heroTechnique.setActivationCost(activationCost);
    heroTechnique.setMaintenanceCost(maintenanceCost);
    heroTechnique.setEffect(effect);

    return heroTechnique;
  }


}
