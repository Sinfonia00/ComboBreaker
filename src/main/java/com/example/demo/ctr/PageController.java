package com.example.demo.ctr;

import com.example.demo.dto.HeroDto;
import com.example.demo.entity.User;
import com.example.demo.form.HeroForm;
import com.example.demo.form.HeroStatsForm;
import com.example.demo.form.UserForm;
import com.example.demo.service.ClassTechniqueService;
import com.example.demo.service.HeroClassService;
import com.example.demo.service.HeroService;
import com.example.demo.service.HeroTechniqueService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/goTo")
public class PageController {

  @Autowired
  HeroClassService heroClassService;

  @Autowired
  HeroService heroService;

  @Autowired
  HeroTechniqueService heroTechniqueService;

  @GetMapping("/welcomePage")
  public String getHome(HttpSession session){
    session.removeAttribute("user");
    session.removeAttribute("hero");

    return "welcomePages/welcomePage";
  }

  @GetMapping("/loginPage")
  public String goToLoginPage(Model model) {
    model.addAttribute("loginForm", new UserForm());
    return "authenticationPages/loginPage";
  }

  @GetMapping("/registrationPage")
  public String goToRegistrationPage(Model model) {
    model.addAttribute("registrationForm", new UserForm());
    return "authenticationPages/registrationPage";
  }

  @GetMapping("/heroChoicePage")
  public String goToHeroChoicePage(Model model, HttpSession session){
    session.removeAttribute("hero");
    model.addAttribute("heroes", heroService.recallAllHeroes((User)session.getAttribute("user")));
    model.addAttribute("heroForm", new HeroForm());
    return "campfirePages/heroChoicePage";
  }

  @GetMapping("/heroRecruitmentPage")
  public String goToHeroRecruitmentPage(Model model){
    model.addAttribute("heroForm", new HeroForm());
    model.addAttribute("heroClasses", heroClassService.getAllHeroClasses());
    model.addAttribute("techniques", heroTechniqueService.getAllHeroTechniques());

    return "campfirePages/heroRecruitmentPage";
  }

  @GetMapping("/campfirePage")
  public String goToCampfirePage(){

    return "campfirePages/campfirePage";
  }

  @GetMapping("/trainingBarracksPage")
  public String goToTrainingBarracksPage(Model model){
    model.addAttribute("heroStatsForm", new HeroStatsForm());

    return "campfirePages/trainingBarracksPage";
  }

  @GetMapping("/trainingGroundPage")
  public String goToTrainingGroundPage(){


    return "campfirePages/trainingGroundPage";
  }



}