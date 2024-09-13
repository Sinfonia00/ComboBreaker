package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<Libro> list = new ArrayList<>();
    list.add(new Libro("Libro1", 150));
    list.add(new Libro("Libro2", 50));
    list.add(new Libro("Libro3", 70));

    reduce(list).forEach(System.out::println);
  }

  public static List<Libro> reduce (List<Libro> list){
    return list.stream().filter(x -> x.getPagine() < 100).collect(Collectors.toList());
  }



  @Getter
  @Setter
  @ToString
  @AllArgsConstructor
  public static class Libro{

    private String titolo;

    private int pagine;

  }

}


