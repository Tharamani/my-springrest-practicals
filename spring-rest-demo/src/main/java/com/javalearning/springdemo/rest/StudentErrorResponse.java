/**
 * 
 */
package com.javalearning.springdemo.rest;

/**
 * @author Thara Created date and time : 30 Dec 2020 7:00:18 pm
 */
public class StudentErrorResponse {

	private int status;
	private String message;
	private long timeStamp;

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the timeStamp
	 */
	public long getTimeStamp() {
		return timeStamp;
	}

	/**
	 * @param timeStamp the timeStamp to set
	 */
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

	/**
	 * @param status
	 * @param message
	 * @param timeStamp
	 */
	public StudentErrorResponse(int status, String message, long timeStamp) {
		super();
		this.status = status;
		this.message = message;
		this.timeStamp = timeStamp;
	}

	/**
	 * 
	 */
	public StudentErrorResponse() {
		super();
	}

}
