package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

  @Query("SELECT u FROM User u WHERE (:email = u.email AND :psw = u.password)")
  List<User> findAccounts(@Param(value = "email")String email, @Param(value = "psw")String psw);

  List<User> findByEmail(String email);

}
