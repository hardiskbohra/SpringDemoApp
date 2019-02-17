package com.example.demo.repository;

import com.example.demo.entity.UserEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hardikbohra on 2019-02-17.
 */
@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {

  UserEntity findById(int id);
}
