package com.anz.wholesale.exception;
/**
 * 
 * @author Geetha Thambiran
 * Handles the exceptions related to the account details
 *
 */
public class NoAccountDetailsFoundException extends RuntimeException{

	private static final long serialVersionUID = -2612106161752761543L;
	
	public NoAccountDetailsFoundException() {
		super();
	}
	
	public NoAccountDetailsFoundException(String message) {
		super(message);
	}
	

}
