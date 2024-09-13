package com.example.demo.ctr;

import com.example.demo.form.HeroForm;
import com.example.demo.service.HeroClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @Autowired
  private HeroClassService heroClassService;

  @GetMapping("/")
  public String getHome(Model model){
    return "welcomePage";

//    model.addAttribute("heroForm", new HeroForm());
//    model.addAttribute("heroClasses", heroClassService.getAllHeroClasses());
//
//    return "campfirePages/heroRecruitmentPage";
//
    

//    List<HeroDto> list = new ArrayList<>();
//    list.add(HeroBuilder.toDto(HeroBuilder.newHero(5)));
//    list.add(HeroBuilder.toDto(HeroBuilder.newHero(6)));
//
//    model.addAttribute("heroes", list);
//    model.addAttribute("theChosenOne", new HeroDto());
//
//    return "campfirePages/heroChoicePage";
  }

}