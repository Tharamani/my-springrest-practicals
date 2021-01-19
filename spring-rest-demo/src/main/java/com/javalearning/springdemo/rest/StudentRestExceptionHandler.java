/**
 * 
 */
package com.javalearning.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Thara Created date and time : 30 Dec 2020 7:38:02 pm global exception
 *         handler using AOP
 *         // add exceptionhandler to hadle any type of generic exception
 */
@ControllerAdvice
public class StudentRestExceptionHandler {

	// add an exception handler using @exceptionhandler annotation
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exception) {

		// create a StudentErrorResponse
		StudentErrorResponse studentError = new StudentErrorResponse();

		studentError.setStatus(HttpStatus.NOT_FOUND.value());
		studentError.setMessage(exception.getMessage());
		studentError.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<StudentErrorResponse>(studentError, HttpStatus.NOT_FOUND);
	}

	// add another exception handler...to catch any exception (catch all)/generic
	// exception
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(Exception exception) {
		// create a StudentErrorResponse
		StudentErrorResponse studentError = new StudentErrorResponse();

		studentError.setStatus(HttpStatus.BAD_REQUEST.value());
		studentError.setMessage(exception.getMessage());
		studentError.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<StudentErrorResponse>(studentError, HttpStatus.BAD_REQUEST);
	}
}
