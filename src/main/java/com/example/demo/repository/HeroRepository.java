package com.example.demo.repository;

import com.example.demo.entity.Hero;
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HeroRepository extends JpaRepository<Hero, Integer> {

  List<Hero> findByUser(User user);

  List<Hero> findByUserAndId(User user, Integer id);

}
