/**
 * 
 */
package com.javalearning.springdemo.rest;

/**
 *@author Thara
 *Created date and time : 30 Dec 2020 7:02:12 pm
 */
public class StudentNotFoundException extends RuntimeException{

	/**
	 * @param message
	 * @param cause
	 */
	public StudentNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public StudentNotFoundException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public StudentNotFoundException(Throwable cause) {
		super(cause);
	}
}
