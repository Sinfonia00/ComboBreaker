package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "hero_class")
public class HeroClass {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "class_name", unique = true)
  private String className;

  @Column(name = "starting_strength")
  private int startingStrength;

  @Column(name = "starting_dexterity")
  private int startingDexterity;

  @Column(name = "starting_constitution")
  private int startingConstitution;

  @Column(name = "starting_intelligence")
  private int startingIntelligence;

  @Column(name = "starting_wisdom")
  private int startingWisdom;

  @Column(name = "starting_charisma")
  private int startingCharisma;

  @Column(name = "extra_stats_points")
  private int extraStatsPoints;

}
