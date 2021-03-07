package com.anz.wholesale.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Geetha Thambiran
 * This class has the fields related to the transaction 
 *
 */
@Entity
@Table (name = "ACCOUNT_TRAN")
public class AccountTransactionBean {
	
	@Id
	private String tranId;
	private String acctNumber;
	private String acctName;
	private String valueDate;
	private String currency;
	private double debitAmt;
	private double creditAmt;
	private String tranType;
	private String tranNarrative;
	
	/**
	 * @param acctNumber
	 * @param acctName
	 * @param valueDate
	 * @param currency
	 * @param debitAmt
	 * @param creditAmt
	 * @param tranType
	 * @param tranNarrative
	 */
	public AccountTransactionBean(String tranId, String acctNumber, String acctName, String valueDate, String currency,
			double debitAmt, double creditAmt, String tranType, String tranNarrative) {
		super();
		this.tranId = tranId;
		this.acctNumber = acctNumber;
		this.acctName = acctName;
		this.valueDate = valueDate;
		this.currency = currency;
		this.debitAmt = debitAmt;
		this.creditAmt = creditAmt;
		this.tranType = tranType;
		this.tranNarrative = tranNarrative;
	}
	public AccountTransactionBean() {
		super();
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
	 * @return the valueDate
	 */
	public String getValueDate() {
		return valueDate;
	}
	/**
	 * @param valueDate the valueDate to set
	 */
	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
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
	 * @return the debitAmt
	 */
	public double getDebitAmt() {
		return debitAmt;
	}
	/**
	 * @param debitAmt the debitAmt to set
	 */
	public void setDebitAmt(double debitAmt) {
		this.debitAmt = debitAmt;
	}
	/**
	 * @return the creditAmt
	 */
	public double getCreditAmt() {
		return creditAmt;
	}
	/**
	 * @param creditAmt the creditAmt to set
	 */
	public void setCreditAmt(double creditAmt) {
		this.creditAmt = creditAmt;
	}
	/**
	 * @return the tranType
	 */
	public String getTranType() {
		return tranType;
	}
	/**
	 * @param tranType the tranType to set
	 */
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}
	/**
	 * @return the tranNarrative
	 */
	public String getTranNarrative() {
		return tranNarrative;
	}
	/**
	 * @param tranNarrative the tranNarrative to set
	 */
	public void setTranNarrative(String tranNarrative) {
		this.tranNarrative = tranNarrative;
	}
	/**
	 * @return the tranId
	 */
	public String getTranId() {
		return tranId;
	}
	/**
	 * @param tranId the tranId to set
	 */
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}

}
