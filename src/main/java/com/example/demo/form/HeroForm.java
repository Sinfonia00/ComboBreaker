package com.example.demo.form;

import com.example.demo.entity.HeroClass;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class HeroForm {

  private int id;

  private String name;

  private int heroClass;

  private Integer[] aaa;

}
