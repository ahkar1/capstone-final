package com.matthias.paintball.controller;

import java.util.Optional;

import com.matthias.paintball.dao.GunsRepository;
import com.matthias.paintball.model.Guns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class GunsController {
    @Autowired

    private GunsRepository gunsRepository;

    @GetMapping(path = "/api/guns")
    public @ResponseBody Iterable<Guns> getAllGuns() {

        return gunsRepository.findAll();
    }

    @GetMapping("/api/guns/{id}")
    Optional<Guns> gun(@PathVariable int id) {

        return gunsRepository.findById(id);
    }

    /*
     * Post Guns Endpoint
     */
    @PostMapping("/api/guns")
    Guns postguns(@RequestBody Guns gun) {
        return gunsRepository.save(gun);
    }

    @DeleteMapping("/api/guns/{id}")
    void deleteGun(@PathVariable int id) {
        gunsRepository.deleteById(id);
    }
}