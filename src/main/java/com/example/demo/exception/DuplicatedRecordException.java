package com.example.demo.exception;

public class DuplicatedRecordException extends Exception{

  public DuplicatedRecordException(String errorMessage){
    super(errorMessage);
  }

}
