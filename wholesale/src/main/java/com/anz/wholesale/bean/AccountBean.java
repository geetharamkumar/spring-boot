package com.anz.wholesale.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Geetha Thambiran
 * All the account related fields are declared in this class.
 *
 */
@Entity
@Table(name = "ACCOUNT")
public class AccountBean {
	private String userId;
	@Id
	private String acctNumber;
	private String acctName;
	private String acctType;
	private String balDate;
	private String currency;
	private double openAvailBal;
	
	
	/**
	 * 
	 */
	public AccountBean() {
		super();		
	}
	/**
	 *@param userId
	 * @param acctNumber
	 * @param acctName
	 * @param acctType
	 * @param balDate
	 * @param currency
	 * @param openAvailBal
	 */
	public AccountBean(String userId, String acctNumber, String acctName, String acctType, String balDate, String currency,
			double openAvailBal) {
		super();
		this.userId = userId;
		this.acctNumber = acctNumber;
		this.acctName = acctName;
		this.acctType = acctType;
		this.balDate = balDate;
		this.currency = currency;
		this.openAvailBal = openAvailBal;
	}
	/**
	 * @return the acctNumber
	 */
	public String getAcctNumber() {
		return acctNumber;
	}
	/**
	 * @param acctNumber the acctNumber to set
	 */
	public void setAcctNumber(String acctNumber) {
		this.acctNumber = acctNumber;
	}
	/**
	 * @return the acctName
	 */
	public String getAcctName() {
		return acctName;
	}
	/**
	 * @param acctName the acctName to set
	 */
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	/**
	 * @return the acctType
	 */
	public String getAcctType() {
		return acctType;
	}
	/**
	 * @param acctType the acctType to set
	 */
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	/**
	 * @return the balDate
	 */
	public String getBalDate() {
		return balDate;
	}
	/**
	 * @param balDate the balDate to set
	 */
	public void setBalDate(String balDate) {
		this.balDate = balDate;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * @return the openAvailBal
	 */
	public double getOpenAvailBal() {
		return openAvailBal;
	}
	/**
	 * @param openAvailBal the openAvailBal to set
	 */
	public void setOpenAvailBal(double openAvailBal) {
		this.openAvailBal = openAvailBal;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
