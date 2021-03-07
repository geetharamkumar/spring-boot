package com.anz.wholesale.exception;
/**
 * 
 * @author Geetha Thambiran
 * This class handles the exception related to transaction details
 *
 */
public class NoAccountTranFoundException extends RuntimeException {

	
	private static final long serialVersionUID = -3382393569820438499L;

	public NoAccountTranFoundException() {
		super();		
	}



	/**
	 * @param message
	 */
	public NoAccountTranFoundException(String message) {
		super(message);
	}


	
	

}
