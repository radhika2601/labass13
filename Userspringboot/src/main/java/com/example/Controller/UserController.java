package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.User;
import com.example.Service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}

	@GetMapping("/users")
	public List<User> findAllUsers() {
		return userService.findAllUsers();
	}

	@GetMapping("/users/{id}")
	public User findUserById(@PathVariable int id) {
		return userService.findUserById(id);
	}

	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable int id) {

		userService.deleteUser(id);
		return "User is deleted";
	}

	@PutMapping("/users")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}

}
