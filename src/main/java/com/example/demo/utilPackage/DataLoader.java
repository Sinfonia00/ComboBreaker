package com.example.demo.utilPackage;

import com.example.demo.builder.ClassTechniqueBuilder;
import com.example.demo.builder.HeroBuilder;
import com.example.demo.builder.HeroClassBuilder;
import com.example.demo.builder.HeroTechniqueBuilder;
import com.example.demo.builder.UserBuilder;
import com.example.demo.entity.Hero;
import com.example.demo.entity.HeroClass;
import com.example.demo.entity.HeroTechnique;
import com.example.demo.entity.User;
import com.example.demo.service.ClassTechniqueService;
import com.example.demo.service.HeroClassService;
import com.example.demo.service.HeroService;
import com.example.demo.service.HeroTechniqueService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

  @Autowired
  private UserService userService;

  @Autowired
  private HeroService heroService;

  @Autowired
  private HeroClassService classService;

  @Autowired
  private HeroTechniqueService heroTechniqueService;

  @Autowired
  private ClassTechniqueService classTechniqueService;


  public void run(String... args) throws Exception {
    User user1 = userService.registerUser(UserBuilder.newUser("Dark Knight", "andrea@gmail.com", "Password00"));
    User user2 = userService.registerUser(UserBuilder.newUser("Sanraku", "shangrila@gmail.com", "Password00"));

    HeroTechnique heroTechnique1 = heroTechniqueService.addNewTechnique(HeroTechniqueBuilder.newTechnique("Fire ball", "Big angry sun", "", 40, 0, "DAMAGE"));
    HeroTechnique heroTechnique2 = heroTechniqueService.addNewTechnique(HeroTechniqueBuilder.newTechnique("Iron fist", "Big angry sun", "", 40, 0, "DAMAGE"));
    HeroTechnique heroTechnique3 = heroTechniqueService.addNewTechnique(HeroTechniqueBuilder.newTechnique("Ki compression", "Big angry sun", "", 40, 0, "DAMAGE"));
    HeroTechnique heroTechnique4 = heroTechniqueService.addNewTechnique(HeroTechniqueBuilder.newTechnique("Evil dispersion", "Big angry sun", "", 40, 0, "DAMAGE"));
    HeroTechnique heroTechnique5 = heroTechniqueService.addNewTechnique(HeroTechniqueBuilder.newTechnique("Final grudge", "Big angry sun", "", 40, 0, "DAMAGE"));
    HeroTechnique heroTechnique6 = heroTechniqueService.addNewTechnique(HeroTechniqueBuilder.newTechnique("Tickle", "Big angry sun", "", 40, 0, "DAMAGE"));
    HeroTechnique heroTechnique7 = heroTechniqueService.addNewTechnique(HeroTechniqueBuilder.newTechnique("Heavy breath", "Big angry sun", "", 40, 0, "DAMAGE"));
    HeroTechnique heroTechnique8 = heroTechniqueService.addNewTechnique(HeroTechniqueBuilder.newTechnique("Tackle", "Big angry sun", "", 40, 0, "DAMAGE"));

    HeroClass heroClass1 = classService.registerNewClass(HeroClassBuilder.newHeroClass("Barbarian", 18, 10, 10, 10, 10, 10, 0));
    HeroClass heroClass2 = classService.registerNewClass(HeroClassBuilder.newHeroClass("Commoner", 10, 10, 10, 10, 10, 10, 10));

    classTechniqueService.save(ClassTechniqueBuilder.newClassTechnique(heroClass1, heroTechnique2));
    classTechniqueService.save(ClassTechniqueBuilder.newClassTechnique(heroClass1, heroTechnique3));
    classTechniqueService.save(ClassTechniqueBuilder.newClassTechnique(heroClass1, heroTechnique4));
    classTechniqueService.save(ClassTechniqueBuilder.newClassTechnique(heroClass1, heroTechnique7));
    classTechniqueService.save(ClassTechniqueBuilder.newClassTechnique(heroClass1, heroTechnique8));
    classTechniqueService.save(ClassTechniqueBuilder.newClassTechnique(heroClass2, heroTechnique1));
    classTechniqueService.save(ClassTechniqueBuilder.newClassTechnique(heroClass2, heroTechnique3));
    classTechniqueService.save(ClassTechniqueBuilder.newClassTechnique(heroClass2, heroTechnique4));
    classTechniqueService.save(ClassTechniqueBuilder.newClassTechnique(heroClass2, heroTechnique5));
    classTechniqueService.save(ClassTechniqueBuilder.newClassTechnique(heroClass2, heroTechnique6));
    classTechniqueService.save(ClassTechniqueBuilder.newClassTechnique(heroClass2, heroTechnique7));

    Hero hero1 = heroService.registerNewHero(HeroBuilder.newHero(user1, heroClass1, "Leo", heroTechnique1, heroTechnique2, heroTechnique3, heroTechnique4));
    Hero hero2 = heroService.registerNewHero(HeroBuilder.newHero(user1, heroClass2, "Roxy", heroTechnique1, heroTechnique2, heroTechnique3, heroTechnique4));
    Hero hero3 = heroService.registerNewHero(HeroBuilder.newHero(user2, heroClass2, "Ban", heroTechnique1, heroTechnique2, heroTechnique3, heroTechnique4));





  }

}
