package com.example.demo.service;

import com.example.demo.entity.HeroClass;
import com.example.demo.exception.DuplicatedRecordException;
import com.example.demo.exception.RecordNotFoundException;
import com.example.demo.repository.HeroClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroClassService {

  @Autowired
  HeroClassRepository repository;

  public HeroClass registerNewClass(HeroClass heroClass) throws DuplicatedRecordException {
    List<HeroClass> heroClasses = repository.findByClassName(heroClass.getClassName());

    if(!heroClasses.isEmpty())
      throw new DuplicatedRecordException("HeroClass: registerNewClass > the hero class "+heroClass.getClassName()+" is already registered");

     return repository.save(heroClass);
  }

  public List<HeroClass> getAllHeroClasses(){
    return repository.findAll();
  }

  public HeroClass retrieveHeroClass(Integer id) throws RecordNotFoundException {
    HeroClass heroClass = repository.findById(id).orElse(null);

    if(heroClass == null)
      throw new RecordNotFoundException("HeroClassService: retrieveHeroClass > there is not hero class matching this id: "+id);

    return heroClass;
  }

}
