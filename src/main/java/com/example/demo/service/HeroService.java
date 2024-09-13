package com.example.demo.service;

import com.example.demo.entity.Hero;
import com.example.demo.entity.User;
import com.example.demo.exception.DuplicatedRecordException;
import com.example.demo.exception.RecordNotFoundException;
import com.example.demo.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroService {

  @Autowired
  HeroRepository repository;

  public Hero registerNewHero(Hero hero){
    hero = repository.save(hero);
    return hero;
  }

  public List<Hero> recallAllHeroes(User user){
    return repository.findByUser(user);
  }

  public Hero recallHero(User user, Integer heroId) throws RecordNotFoundException, DuplicatedRecordException {
    List<Hero> list = repository.findByUserAndId(user, heroId);

    if(list.isEmpty())
      throw new RecordNotFoundException("");

    if(list.size() > 1)
      throw new DuplicatedRecordException("");

    return list.get(0);

  }

}
