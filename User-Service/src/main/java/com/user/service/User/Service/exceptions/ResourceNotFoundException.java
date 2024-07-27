package com.user.service.User.Service.exceptions;

public class ResourceNotFoundException extends RuntimeException{
  
	public ResourceNotFoundException() {
		super("Resource Not Found on Server !!");
	}
}
