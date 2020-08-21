package com.matthias.paintball.dao;


import com.matthias.paintball.model.Activity;

import org.springframework.data.repository.CrudRepository;

public interface ActivityRepository extends CrudRepository<Activity, Integer> {

}