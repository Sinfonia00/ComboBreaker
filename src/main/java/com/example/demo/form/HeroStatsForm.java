package com.example.demo.form;

import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class HeroStatsForm {

  @PositiveOrZero(message = "Extra points cannot be below zero")
  private int strExtra;

  @PositiveOrZero(message = "Extra points cannot be below zero")
  private int dexExtra;

  @PositiveOrZero(message = "Extra points cannot be below zero")
  private int conExtra;

  @PositiveOrZero(message = "Extra points cannot be below zero")
  private int intExtra;

  @PositiveOrZero(message = "Extra points cannot be below zero")
  private int widExtra;

  @PositiveOrZero(message = "Extra points cannot be below zero")
  private int chaExtra;

}
