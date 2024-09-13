package com.example.demo.ctr;

import com.example.demo.builder.UserBuilder;
import com.example.demo.entity.User;
import com.example.demo.exception.DatabaseLogicException;
import com.example.demo.exception.DuplicatedRecordException;
import com.example.demo.exception.RecordNotFoundException;
import com.example.demo.form.HeroForm;
import com.example.demo.form.UserForm;
import com.example.demo.service.HeroService;
import com.example.demo.service.UserService;

import com.example.demo.utilPackage.Log;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/authentication")
public class AuthenticationController {

  @Autowired
  UserService userService;

  @Autowired
  HeroService heroService;

  @PostMapping("/login")
  public String doLogin (Model model, HttpSession session, @Valid @ModelAttribute("loginForm") UserForm userForm, Errors errors){
    if(errors.hasErrors()) {
      model.addAttribute("loginForm", userForm);
      return "authenticationPages/loginPage";
    }

    try{
      User user = userService.logUser(UserBuilder.toEntity(userForm));
      model.addAttribute("heroes", heroService.recallAllHeroes(user));
      model.addAttribute("heroForm", new HeroForm());
      session.setAttribute("user", user);
      Log.print(user+" has logged in.");
      return "campfirePages/heroChoicePage";

    } catch (RecordNotFoundException e) {
      model.addAttribute("loginForm", userForm);
      model.addAttribute("errorForm", "No account has been found");
      return "authenticationPages/loginPage";

    } catch (DatabaseLogicException e) {
      model.addAttribute("loginForm", userForm);
      model.addAttribute("errorForm", "Multiple compatible accounts has been found");
      return "authenticationPages/loginPage";
    }

  }

  @PostMapping("/registration")
  public String doRegistration (Model model, HttpSession session, @Valid @ModelAttribute("registrationForm") UserForm userForm, Errors errors){
    if(errors.hasErrors()){
      model.addAttribute("registrationForm", userForm);
      return "authenticationPages/registrationPage";
    }

    try{
      User user = userService.registerUser(UserBuilder.toEntity(userForm));
      model.addAttribute("heroes", new ArrayList<>());
      model.addAttribute("heroForm", new HeroForm());
      session.setAttribute("user", user);
      Log.print(user+" has registered.");
      return "campfirePages/heroChoicePage";

    } catch (DuplicatedRecordException e) {
      model.addAttribute("registrationForm", userForm);
      model.addAttribute("errorForm", "This email is already in use");
      return "authenticationPages/registrationPage";

    }

  }

  @GetMapping("/logout")
  public String logout(HttpSession session) {
    Log.print(session.getAttribute("user")+" has logged out.");
    session.removeAttribute("user");
    session.removeAttribute("hero");
    return "welcomePages/welcomePage";
  }

}