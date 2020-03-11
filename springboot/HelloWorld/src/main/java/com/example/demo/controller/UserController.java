package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserRepository;
import com.example.demo.pojos.User;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@GetMapping
	public Iterable<User>getAllUser()
	{
		return userRepository.findAll();
	}
	@PostMapping
	public User saveUser(@RequestBody User user)
	{
		System.out.println(user);
		userRepository.save(user);
		return user;
	}
	@PutMapping("/updateUser/{username}")
	
	public User updateUser(@RequestBody User user,@PathVariable("username") String username)
	{
		
		user.setUsername(username);
		System.out.println(user);
		
		userRepository.save(user);
		return user;
	}
	@DeleteMapping("/delete/{username}")
	public boolean deleteUser(@PathVariable("username") String username)
	{
		
	
		System.out.println(username);
		
		userRepository.deleteById(username);
		return true;
	}
	@GetMapping("/find/{username}")
	public User findAllinOne(@PathVariable("username") String username)
	{
	
	Optional<User> user=userRepository.findById(username);
		return user.get();
	}
	
}
