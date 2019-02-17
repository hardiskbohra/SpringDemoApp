package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.UserEntity;
import com.example.demo.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hardikbohra on 2019-02-17.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
  public UserEntity getstockDetailById(@PathVariable int id) {
    UserEntity userEntity = null;
    userEntity = userService.findUserById(id);
    return userEntity;
  }

  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public String createUser(@RequestBody UserDao userDao) {
    boolean response = userService.createUser(userDao);
    if (response) {
      return "user successfully added.";
    } else {
      return "user creation failed.";
      
    }
  }
}
