package com.matthias.paintball.controller;

import java.util.Optional;

import com.matthias.paintball.dao.ActivityRepository;
import com.matthias.paintball.model.Activity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ActivityController {
    @Autowired 
    
    private ActivityRepository activityRepository;
    
    
	@GetMapping("/api/activity")
	public @ResponseBody Iterable<Activity> getAllActivity() {
    return activityRepository.findAll();
    }
    @GetMapping("/api/activity/{id}")
    Optional<Activity> gun(@PathVariable int id) {

        return activityRepository.findById(id);
    }
/*
	 * Post activity Endpoint
	 */
	@PostMapping("/api/activity")
	Activity postactivity(@RequestBody Activity activity) {
		return activityRepository.save(activity);
    }
    
    @DeleteMapping("/api/activity/{id}")
    void deleteGun(@PathVariable int id) {
        activityRepository.deleteById(id);
    }
}