package com.example.demo.repository;

import com.example.demo.entity.HeroClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HeroClassRepository extends JpaRepository<HeroClass, Integer> {

  List<HeroClass> findByClassName(String className);

}
