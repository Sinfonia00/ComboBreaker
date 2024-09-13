package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "hero")
public class Hero {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @ManyToOne
  @JoinColumn(name = "user", nullable = false)
  private User user;

  @ManyToOne
  @JoinColumn(name = "hero_class", nullable = false)
  private HeroClass heroClass;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "level", nullable = false)
  private int level;

  @Column(name = "strength", nullable = false)
  private int strength;

  @Column(name = "dexterity", nullable = false)
  private int dexterity;

  @Column(name = "constitution", nullable = false)
  private int constitution;

  @Column(name = "intelligence", nullable = false)
  private int intelligence;

  @Column(name = "wisdom", nullable = false)
  private int wisdom;

  @Column(name = "charisma", nullable = false)
  private int charisma;

  @Column(name = "stats_points", nullable = false)
  private int statsPoints;


  @ManyToOne
  @JoinColumn(name = "technique1")
  private HeroTechnique heroTechnique1;

  @ManyToOne
  @JoinColumn(name = "heroTechnique2")
  private HeroTechnique heroTechnique2;

  @ManyToOne
  @JoinColumn(name = "heroTechnique3")
  private HeroTechnique heroTechnique3;

  @ManyToOne
  @JoinColumn(name = "heroTechnique4")
  private HeroTechnique heroTechnique4;

}
