package com.example.demo.repository;


import com.example.demo.entity.HeroTechnique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<HeroTechnique, Integer> {



}
