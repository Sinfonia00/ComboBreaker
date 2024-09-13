package com.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HeroDto {

  private int id;

//  private String heroName;
//
//  private String
//
//  private int level;

  private int strength;

  private int dexterity;

  private int constitution;

  private int intelligence;

  private int wisdom;

  private int charisma;

  private int availablePoints;


  @Override
  public String toString() {
    return  id + " - " +
            "STR["+strength+"], " +
            "DEX["+dexterity+"], " +
            "COS["+constitution+"], " +
            "WID["+wisdom+"], " +
            "INT["+intelligence+"], " +
            "CHA["+charisma+"]";
  }
}
