package com.example.demo.repository;

import com.example.demo.entity.HeroTechnique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechniqueRepository extends JpaRepository<HeroTechnique, Integer> {
}
