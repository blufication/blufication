package com.BLU.blufication.dao;

import org.springframework.data.repository.CrudRepository;

import com.BLU.blufication.model.User;

public interface UserRepo extends CrudRepository<User, String> {

		User findByUsername(String Username); 
}
