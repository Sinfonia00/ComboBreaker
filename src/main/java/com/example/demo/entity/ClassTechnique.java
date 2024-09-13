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
@Table(name = "class_technique")
public class ClassTechnique {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @ManyToOne
  @JoinColumn(name = "hero_class")
  private HeroClass heroClass;

  @ManyToOne
  @JoinColumn(name = "hero_technique")
  private HeroTechnique heroTechnique;

  @Override
  public String toString() {
    return heroClass.getClassName() + " - " + heroTechnique.getTechniqueName();
  }

}
