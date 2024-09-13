package com.example.demo.ctr;

import com.example.demo.builder.HeroBuilder;
import com.example.demo.entity.Hero;
import com.example.demo.entity.HeroClass;
import com.example.demo.entity.User;
import com.example.demo.exception.DuplicatedRecordException;
import com.example.demo.exception.RecordNotFoundException;
import com.example.demo.form.HeroForm;
import com.example.demo.form.HeroStatsForm;
import com.example.demo.service.HeroClassService;
import com.example.demo.service.HeroService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/campfire")
public class CampfireController {

  @Autowired
  private HeroService heroService;

  @Autowired
  private HeroClassService heroClassService;

  @PostMapping("/chooseHero")
  public String chooseHero(Model model, HttpSession session, @Valid @ModelAttribute(name = "heroForm") HeroForm heroForm){
    try{
      Hero hero = heroService.recallHero((User)session.getAttribute("user"), heroForm.getId());
      session.setAttribute("hero", hero);
      return "campfirePages/campfirePage";

    } catch (RecordNotFoundException | DuplicatedRecordException e) {

      model.addAttribute("heroes", heroService.recallAllHeroes((User)session.getAttribute("user")));
      model.addAttribute("heroForm", new HeroForm());
      return "campfirePages/heroChoice";
    }

  }

  @PostMapping("/heroRecruitment")
  public String heroRecruitment(Model model, HttpSession session,@Valid @ModelAttribute(name = "heroForm") HeroForm heroForm){
    System.out.println(heroForm);

    try{
      Hero hero = HeroBuilder.toEntity(heroForm);
      hero.setUser((User)session.getAttribute("user"));
      HeroClass heroClass = heroClassService.retrieveHeroClass(hero.getHeroClass().getId());
      hero.setStrength(heroClass.getStartingStrength());
      hero.setDexterity(heroClass.getStartingDexterity());
      hero.setConstitution(heroClass.getStartingConstitution());
      hero.setIntelligence(heroClass.getStartingIntelligence());
      hero.setWisdom(heroClass.getStartingWisdom());
      hero.setCharisma(heroClass.getStartingCharisma());
      hero.setStatsPoints(heroClass.getExtraStatsPoints());

      hero = heroService.registerNewHero(hero);
      session.setAttribute("hero", hero);

      return "campfirePages/campfirePage";

    } catch (RecordNotFoundException e) {
      throw new RuntimeException(e);
    }

  }







  @PostMapping("/assignPoints")
  public String assignPoints(Model model, @Valid @ModelAttribute("heroStatsForm") HeroStatsForm heroStatsForm, Errors errors){
    if(errors.hasErrors()){
      model.addAttribute("heroStatsForm", heroStatsForm);
      return "campfirePages/trainingBarracksPage";
    }

    System.out.println(heroStatsForm);

    model.addAttribute("heroStatsForm", heroStatsForm);

    return "campfirePages/trainingBarracksPage";
  }

}
