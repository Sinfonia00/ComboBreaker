package com.example.demo.utilPackage;

import org.springframework.stereotype.Component;

@Component
public class Log {

  private Log(){

  }

  public static void print(String logLine){

    System.out.println(logLine);
  }

}
