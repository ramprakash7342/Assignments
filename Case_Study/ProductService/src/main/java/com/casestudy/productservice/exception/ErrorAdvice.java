package com.casestudy.productservice.exception;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorAdvice {

	@ExceptionHandler(NotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ApiErrors handleNotFoundException(NotFoundException exception, HttpServletRequest request) {

		ApiErrors errors=new ApiErrors(404,exception.getMessage(),request.getServletPath());
		return errors;
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String,String> handleInvalidArgument(MethodArgumentNotValidException ex){
		Map<String,String> errorMap=new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(error->{
			errorMap.put(error.getField(), error.getDefaultMessage());
		});
		return errorMap;
	}
}
