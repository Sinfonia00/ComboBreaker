package com.example.demo.repository;

import com.example.demo.entity.ClassTechnique;
import com.example.demo.entity.HeroClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassTechniqueRepository extends JpaRepository<ClassTechnique, Integer> {

  List<ClassTechnique> findByHeroClass(HeroClass heroClass);



}
