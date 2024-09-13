package com.example.demo.exception;

public class RecordNotFoundException extends Exception{

  public RecordNotFoundException(String errorMessage){
    super(errorMessage);
  }

}
