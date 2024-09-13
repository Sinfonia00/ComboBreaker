package com.example.demo.service;

import com.example.demo.entity.HeroTechnique;
import com.example.demo.repository.TechniqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroTechniqueService {

  @Autowired
  private TechniqueRepository techniqueRepository;

  public HeroTechnique addNewTechnique(HeroTechnique heroTechnique){
    return techniqueRepository.save(heroTechnique);
  }

  public List<HeroTechnique> getAllHeroTechniques(){
    return techniqueRepository.findAll();
  }

}
