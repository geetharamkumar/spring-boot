package com.anz.wholesale.constants;
/**
 * This class is created to list all the error constants used in the exception class
 * @author Geetha Thambiran
 *
 */
public final class AccountEnqMappingConstants {
	
	private AccountEnqMappingConstants() {
		super();
	}
	 public static final String ACCOUNT_DETAIL_ENQ_PAGE = "/accountLists/{userId}";
	 public static final String ACCOUNT_TRAN_DETAIL_PAGE = "/account/{number}";
	 public static final String ACCOUNT_NUMBER = "number";
	 public static final String USER_ID = "userId"; 
	 public static final String ADD_ACCOUNT = "addAccount";
	 public static final String ADD_ACCOUNT_TRANSACTION = "addAccountTran";
}
