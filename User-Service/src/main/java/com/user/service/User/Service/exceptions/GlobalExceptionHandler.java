package com.user.service.User.Service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.user.service.User.Service.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex){
		String message=ex.getMessage();
		ApiResponse response = ApiResponse.builder().message(message).status(true).code(HttpStatus.NOT_FOUND).build();
		return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(UnableToPerformDelete.class)
	public ResponseEntity<ApiResponse> handlerDeleteException(UnableToPerformDelete ex) {
		String message=ex.getMessage();
		ApiResponse response=ApiResponse.builder().status(false).message(message).code(HttpStatus.EXPECTATION_FAILED).build();
		return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(response);
	}
}
