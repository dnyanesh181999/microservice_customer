package com.cjc.loanapplication.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler
{
	@ExceptionHandler
	public ResponseEntity<APIError>  InvalidEmployeeIdException(InvalidEmployeeIdException e,HttpServletRequest request)
	{
		APIError error =new APIError();
		 error.setDate(new Date());
		 error.setStatuscode(HttpStatus.BAD_REQUEST.value());
		 error.setMessage(e.getMessage());
		 error.setPath(request.getRequestURI());
		 error.setHttpmessage(HttpStatus.BAD_REQUEST);
		return  new ResponseEntity<APIError>(error,HttpStatus.BAD_REQUEST) ;
	 
	}
	@ExceptionHandler(NoResourceFoundException.class)
	public ResponseEntity<APIError>NoResourceFoundException(NoResourceFoundException excep,HttpServletRequest req)
	{
		APIError error=new APIError();
		error.setStatuscode(HttpStatus.BAD_REQUEST.value());
		error.setMessage(excep.getMessage());
		error.setDate(new Date());
		error.setPath(req.getRequestURI());
		error.setHttpmessage(HttpStatus.BAD_REQUEST);
		return new ResponseEntity<APIError>(error,HttpStatus.BAD_REQUEST);
		
	}
	
	

	
}
