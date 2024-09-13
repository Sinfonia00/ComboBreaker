package com.example.demo.service;

import com.example.demo.builder.UserBuilder;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.exception.DatabaseLogicException;
import com.example.demo.exception.DuplicatedRecordException;
import com.example.demo.exception.RecordNotFoundException;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

  @Autowired
  UserRepository repository;

  public User logUser(User user) throws RecordNotFoundException, DatabaseLogicException {
    List<User> accounts = repository.findAccounts(user.getEmail(), user.getPassword());

    if(accounts.isEmpty())
      throw new RecordNotFoundException("UserService: logUser > no account found for "+user.getEmail());

    if(accounts.size() > 1)
      throw new DatabaseLogicException("UserService: logUser > there are multiple accounts for user "+user.getEmail());

    return accounts.get(0);
  }

  public User registerUser(User user) throws DuplicatedRecordException {
    List<User> accounts = repository.findByEmail(user.getEmail());

    if(!accounts.isEmpty())
      throw new DuplicatedRecordException("UserService: registerUser > the email "+user.getEmail()+" is already used");

    return repository.save(user);
  }

}
