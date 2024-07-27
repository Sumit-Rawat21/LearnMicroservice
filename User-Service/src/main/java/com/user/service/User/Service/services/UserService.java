package com.user.service.User.Service.services;

import java.util.List;

import com.user.service.User.Service.entities.User;

public interface UserService {
	
	//create User
	User createUser(User user);
	
	//get all users
	List<User> getAll();
	
	//get user based on id
	User getUser(String id);
	
	//update user
	User updateUser(User editUser);
	
	//delete user
	void deleteUser(String id);
	
}
