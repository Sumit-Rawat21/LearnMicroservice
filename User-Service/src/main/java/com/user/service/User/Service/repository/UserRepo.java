package com.user.service.User.Service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.service.User.Service.entities.User;

public interface UserRepo extends JpaRepository<User, String> {

}
	