package com.example.demo.service;

import com.example.demo.entity.ClassTechnique;
import com.example.demo.entity.HeroClass;
import com.example.demo.repository.ClassTechniqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassTechniqueService {

  @Autowired
  ClassTechniqueRepository classTechniqueRepository;

  public List<ClassTechnique> getStartingTechniquesOfClass(HeroClass heroClass){
    return classTechniqueRepository.findByHeroClass(heroClass);
  }

  public ClassTechnique save(ClassTechnique classTechnique){
    return classTechniqueRepository.save(classTechnique);
  }

}
