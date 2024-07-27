package com.microservice.HotelService.Exceptions;

public class ResourceNotFoundException extends RuntimeException{
	
       public ResourceNotFoundException(String message) {
		super(message);
		
	}
       
       public ResourceNotFoundException() {
    	   super();
       }
	
	

}
