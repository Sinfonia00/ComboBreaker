package com.example.demo;

import java.util.Collection;
import java.util.Collections;

public class Prova {

  public static void main(String[] args) {
    String s = "aa";
    System.out.println(min(s));
    
  }

  public static boolean min (String s){
    int sLength = s.length()-1;
    for (int i = 0; i < s.length()/2; i++) {
      if(s.charAt(i) != s.charAt(sLength-i))
        return false;
    }

    return true;
  }


}
