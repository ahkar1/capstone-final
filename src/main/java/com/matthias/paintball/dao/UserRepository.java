package com.matthias.paintball.dao;

import com.matthias.paintball.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}