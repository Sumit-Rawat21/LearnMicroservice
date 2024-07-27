package com.user.service.User.Service.exceptions;

import java.util.UUID;

public class UnableToPerformDelete extends RuntimeException{
		
	UnableToPerformDelete(UUID id){
		super("Unable to Perform Delete operation on object with id"+id.toString());
	}
}
