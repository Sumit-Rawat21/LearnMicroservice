package com.user.service.User.Service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.service.User.Service.entities.User;
import com.user.service.User.Service.exceptions.ResourceNotFoundException;
import com.user.service.User.Service.exceptions.UnableToPerformDelete;
import com.user.service.User.Service.repository.UserRepo;
import com.user.service.User.Service.services.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo _userRepository;
		
	@Override
	public User createUser(User user) {
		UUID randomid= UUID.randomUUID();
	    user.setId(randomid.toString());
		return _userRepository.save(user);
	}

	@Override
	public List<User> getAll() {
			
		return _userRepository.findAll();	
	}

	@Override
	public User getUser(String id) {
	 return _userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException());
	}

	@Override
	public User updateUser(User editUser) {
		
		User user1=_userRepository.findById(editUser.getId()).orElseThrow(()->new ResourceNotFoundException());
		user1.setEmail(editUser.getEmail());
		user1.setName(editUser.getName());
		user1.setLocation(editUser.getLocation());
		return _userRepository.save(user1);	
		
	}

	@Override
	public void deleteUser(String id) throws UnableToPerformDelete{
		try {
			_userRepository.deleteById(id);
		} catch (UnableToPerformDelete ex) {
			throw ex;
		}

	}

}
