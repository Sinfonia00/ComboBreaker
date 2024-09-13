package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "hero_technique")
public class HeroTechnique implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "name")
  private String techniqueName;

  @Column(name = "description")
  private String description;

  @Column(name = "icon")
  @Lob
  private Byte[] icon;

  @Column(name = "star")
  private int star;

  @Column(name = "activation_cost")
  private int activationCost;

  @Column(name = "maintenance_cost")
  private int maintenanceCost;

  @Column(name = "effect")
  private String effect;

}
