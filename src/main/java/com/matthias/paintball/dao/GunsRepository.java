package com.matthias.paintball.dao;


import com.matthias.paintball.model.Guns;

import org.springframework.data.repository.CrudRepository;

public interface GunsRepository extends CrudRepository<Guns, Integer> {

}