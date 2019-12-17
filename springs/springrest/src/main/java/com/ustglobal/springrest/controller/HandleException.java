package com.ustglobal.springrest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.springrest.dto.EmployeeResponce;

@RestControllerAdvice
public class HandleException {
	
	@ExceptionHandler(Exception.class)
	public  EmployeeResponce getException() {
		EmployeeResponce responce = new EmployeeResponce();
		responce.setStatusCode(501);
		responce.setMessage("Error in Code");
		responce.setDescription("Got an Exception");
		return responce;
	}
}
