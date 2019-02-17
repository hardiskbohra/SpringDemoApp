package com.example.demo.services.impl;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hardikbohra on 2019-02-17.
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public UserEntity findUserById(int id) {
    UserEntity userEntity = userRepository.findById(id);
    return userEntity;
  }

  @Override
  public boolean updateUser(UserEntity user, int id) {
    return false;
  }

  @Override
  public boolean deleteUser(int id) {
    return false;
  }

  @Override
  public boolean createUser(UserEntity user) {
    return false;
  }
}
