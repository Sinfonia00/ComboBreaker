package com.example.demo.service;

import com.example.demo.entity.HeroTechnique;
import com.example.demo.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

  @Autowired
  SkillRepository skillRepository;

  public List<HeroTechnique> getLoadedSkill(){
    return skillRepository.findAll();
  }

}
