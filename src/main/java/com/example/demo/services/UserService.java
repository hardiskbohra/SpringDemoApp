package com.example.demo.services;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.UserEntity;

/**
 * Created by hardikbohra on 2019-02-17.
 */
public interface UserService {

  UserEntity findUserById(int id);

  boolean updateUser(UserEntity user, int id);

  boolean deleteUser(int id);

  boolean createUser(UserDao user);
}
