package com.matthias.paintball.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class ApiController {

    /*
     * UI Endpoint
     */
    @GetMapping("/")
    public String home(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Welcome to Paintball Inventory - Move to come in coming days", name);
    }

    /*
     * Reports
     */

    @GetMapping("/api/reports")
	public String getreports() {
		String list = " { \"reports\": [ {\"id\": 1,\"name\": \"Maintenance Activty\","
               +     "\"featured\": true,"
                +    "\"last_activity\": \"12/12/2019\""
               + "},{"
  +                  "\"id\": 2,"
   +                 "\"name\": \"Actvitiy by User\","
    +                "\"featured\": true,"
     +              " \"last_activity\": \"12/12/2019\""
      +         " },{"
   +                 "\"id\": 3,"
   +                " \"name\": \"Inventory Report\","
   +                " \"featured\": true,"
   +                 "\"last_activity\": \"12/12/2019\" }] }";

return list;}}