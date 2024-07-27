package com.user.service.User.Service.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.service.User.Service.entities.User;
import com.user.service.User.Service.services.UserService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService _userService;
	
	//create
	@PostMapping
	public ResponseEntity<String> createUser(@RequestBody User user) 
	{
		User user1=_userService.createUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body("User created Successfuly !");
	}
		
	//single user get
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserbyId(@PathVariable String id)
	{
		User user1= _userService.getUser(id);
		return ResponseEntity.ok(user1);
	}
	
		
	//all user get
	@GetMapping
	public ResponseEntity<List<User>> getAll(){
		return ResponseEntity.ok(_userService.getAll());
	}
	
	
	//update user by ID
	@PostMapping("/update")
	public ResponseEntity<User> updateUser(@RequestBody User user){
		User user1=_userService.updateUser(user);
		return ResponseEntity.ok(user1);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable String id)
	{	
		_userService.deleteUser(id);
		return new ResponseEntity<String>("User deleted Successfully",HttpStatus.OK);
	}

}
