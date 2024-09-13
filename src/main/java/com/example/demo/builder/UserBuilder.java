package com.example.demo.builder;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.form.UserForm;

public class UserBuilder {

  public static User newUser(String username, String email, String password){
    User user = new User();
    user.setUsername(username);
    user.setEmail(email);
    user.setPassword(password);

    return user;
  }

  public static User toEntity (UserForm form) {
    if(form != null){
      User entity = new User();
      entity.setId(0);
      entity.setUsername(form.getUsername());
      entity.setEmail(form.getEmail());
      entity.setPassword(form.getPassword());

      return entity;
    }else
      return null;
  }

  public static UserDto toDto (User entity) {
    if(entity != null) {
      UserDto dto = new UserDto();
      dto.setId(entity.getId());
      dto.setUsername(entity.getUsername());
      dto.setEmail(entity.getEmail());

      return dto;
    }else
      return null;
  }


}
