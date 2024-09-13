package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

  private int id;

  private String username;

  private String email;



  @Override
  public String toString() {
    return username+"("+id+")";
  }
  
}
