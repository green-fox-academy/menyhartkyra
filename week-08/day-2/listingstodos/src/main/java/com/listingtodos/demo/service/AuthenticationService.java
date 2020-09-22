package com.listingtodos.demo.service;

import com.listingtodos.demo.model.User;
import com.listingtodos.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
  private UserRepository userRepository;

  @Autowired
  public AuthenticationService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void addUser(User user){
    userRepository.save(user);
  }

  public User findUserByName(String name){
    return userRepository.findById(name).orElse(null);
  }

  public boolean isUserInDatabase(String name){
    if ( findUserByName(name) == null){
      return false;
    }
    return true;
  }

  public boolean authenticateUser(String name, String password){
    User user = findUserByName(name);
    if (user.getPassword().equals(password)){
      return true;
    } else {
      return false;
    }
  }
}
