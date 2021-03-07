package com.anz.wholesale.bean;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;
/**
 * 
 * @author Geetha Thambiran
 * All the fields specified in the exception are declared in this bean
 *
 */
public class ErrorBean {	

	String message;
	List<String> details;
	HttpStatus status ;
	LocalDateTime timeStamp;
	
	
	public ErrorBean() {
		super();
		}
	/**
	 * @param message
	 * @param details
	 * @param status
	 * @param timeStamp
	 */
	public ErrorBean(String message, List<String> details, HttpStatus status, LocalDateTime timeStamp) {
		super();
		this.message = message;
		this.details = details;
		this.status = status;
		this.timeStamp = timeStamp;
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
	 * @return the details
	 */
	public List<String> getDetails() {
		return details;
	}


	/**
	 * @param details the details to set
	 */
	public void setDetails(List<String> details) {
		this.details = details;
	}


	/**
	 * @return the status
	 */
	public HttpStatus getStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(HttpStatus status) {
		this.status = status;
	}


	/**
	 * @return the timeStamp
	 */
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}


	/**
	 * @param timeStamp the timeStamp to set
	 */
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

}
