package com.example.demo.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserForm {

  @NotBlank(message = "Username can't be null")
  private String username;

  @Email(message = "Email address is not valid")
  @NotBlank(message = "Email can't be null")
  private String email;

  @Size(min = 8, message = "Password must be at least 8 characters long")
  //@Pattern(regexp = "^[a-zA-Z0-9]{6,10}$")
  private String password;

}
