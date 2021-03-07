package com.anz.wholesale.exception;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.anz.wholesale.bean.ErrorBean;
import com.anz.wholesale.constants.ErrorConstants;
/**
 * 
 * @author Geetha Thambiran
 * Global exception class to handle all the exceptions apart from the custom exceptions
 *
 */
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		List<String> details = new ArrayList<>();
		details.add(ErrorConstants.MISSING_PATH_VARIABLE);
		ErrorBean errorBean = new ErrorBean(ex.getMessage(), details, status, LocalDateTime.now());
		return ResponseEntity.status(status).body(errorBean);
	}

	@Override
	protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		List<String> details = new ArrayList<>();
		details.add(ErrorConstants.HANDLE_TYPE_MISMATCH);
		ErrorBean errorBean = new ErrorBean(ex.getMessage(), details, status, LocalDateTime.now());
		return ResponseEntity.status(status).body(errorBean);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		List<String> details = new ArrayList<>();
		details.add(ErrorConstants.MESSAGE_NOT_READABLE);
		ErrorBean errorBean = new ErrorBean(ex.getMessage(), details, status, LocalDateTime.now());
		return ResponseEntity.status(status).body(errorBean);
	}
	
	@Override
	protected ResponseEntity<Object> handleNoHandlerFoundException(NoHandlerFoundException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		List<String> details = new ArrayList<>();
		details.add(ErrorConstants.NO_HANDLER_FOUND);
		ErrorBean errorBean = new ErrorBean(ex.getMessage(), details, status, LocalDateTime.now());
		return ResponseEntity.status(status).body(errorBean);
	}
	/**
	 * This method will handle the custom exception related to the account details 
	 * @param ex
	 * @return
	 */
	
	@ExceptionHandler (NoAccountDetailsFoundException.class)
	public ResponseEntity<Object> handleNoAccountDetailsFoundException(NoAccountDetailsFoundException ex) {
		List<String> details = new ArrayList<>();
		details.add(ErrorConstants.ACCOUNT_LIST_NOT_FOUND);
		ErrorBean errorBean = new ErrorBean(ex.getMessage(), details, HttpStatus.BAD_REQUEST, LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBean);
		
	}
	/**
	 * This method will handle the transaction related exceptions
	 * @param ex
	 * @return
	 */
	@ExceptionHandler (NoAccountTranFoundException.class)
	public ResponseEntity<Object> handleNoAccountTranFoundException(NoAccountTranFoundException ex) {
		List<String> details = new ArrayList<>();
		details.add(ErrorConstants.ACCOUNT_TRAN_NOT_FOUND);
		ErrorBean errorBean = new ErrorBean(ex.getMessage(), details, HttpStatus.BAD_REQUEST, LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBean);
		
	}
	/**
	 * All the exceptions other than the specified will be handled by this method.
	 * @param ex
	 * @return
	 */
	
	@ExceptionHandler (Exception.class)
	public ResponseEntity<Object> handleOtherException(Exception ex) {
		List<String> details = new ArrayList<>();
		details.add(ErrorConstants.OTHER_EXCEPTION);
		ErrorBean errorBean = new ErrorBean(ex.getMessage(), details, HttpStatus.BAD_REQUEST, LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBean);
		
	}
	

}
