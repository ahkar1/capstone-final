package com.matthias.paintball;

import com.matthias.paintball.model.User;
import com.matthias.paintball.model.Users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PaintballApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaintballApplication.class, args);

	}

	/*
	 * UI Endpoint
	 */
	@GetMapping("/")
	public String home(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Welcome to Paintball Inventory - Move to come in coming days", name);
	}

	/*
	 * Guns
	 */
	/*
	 * Get Guns Endpoint
	 */
	@GetMapping("/api/guns")
	public String getguns(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("guns %s!", name);
	}

	/*
	 * Post Guns Endpoint
	 */
	@PostMapping("/api/guns")
	public String postguns(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("guns %s!", name);
	}

	/*
	 * Reports
	 */

	@GetMapping("/api/reports")
	public String getreports(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("guns %s!", name);
	}

	/*
	 * Activity
	 */

	@GetMapping("/api/activity")
	public String getactivity(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("guns %s!", name);
	}
/*
	 * Post activity Endpoint
	 */
	@PostMapping("/api/activity")
	public String postactivity(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("guns %s!", name);
	}

		/*
	 * Users
	 */

	@GetMapping("/api/users")
	public Users getusers() {
		Users users = new Users();
		User user = new User();
		user.setId(1);
		user.setName("Tori");
		user.setRole("ADMIN");
		users.addUser(user);
		
		User user2 = new User();
		user.setId(2);
		user.setName("22Tori");
		user.setRole("ADMIN");

		users.addUser(user2);
		return users;
	}
/*
	 * Post activity Endpoint
	 */
	@PostMapping("/api/users")
	public String postusers(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("guns %s!", name);
	}
}
