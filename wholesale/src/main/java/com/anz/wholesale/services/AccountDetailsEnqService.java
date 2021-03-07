package com.anz.wholesale.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anz.wholesale.bean.AccountBean;
import com.anz.wholesale.bean.AccountTransactionBean;
import com.anz.wholesale.constants.ErrorConstants;
import com.anz.wholesale.exception.NoAccountDetailsFoundException;
import com.anz.wholesale.repository.AccountRepository;
import com.anz.wholesale.repository.AccountTranRepository;
/**
 * 
 * @author Geetha Thambiran
 *
 */
@Service
public class AccountDetailsEnqService {
	/**
	 * This method will get the list of accounts mapped to the user
	 * @param userId
	 * @return
	 */
	
	@Autowired
	AccountRepository accountRepository;
	public void  addAccount(AccountBean accountBean) {
		accountRepository.save(accountBean);
		
	}
	public List<AccountBean> getAccountListEnq(String userId) {
		List<AccountBean> acctList = new ArrayList<AccountBean>();
		accountRepository.findAccountByUser(userId).forEach(acctList::add);
		if (acctList.isEmpty()) {
			throw new NoAccountDetailsFoundException(ErrorConstants.ACCOUNT_LIST_NOT_FOUND);
		} else {
			return acctList;
		}

	}
	/**
	 * This method will fetch the transaction list based on the account selected
	 * @param accountNo
	 * @return
	 */
	@Autowired
	AccountTranRepository accountTranRepository;
	
	public List<AccountTransactionBean> getAccountTranListEnq(String accountNo) {
		
		List<AccountTransactionBean> acctTranListByNo = new ArrayList<AccountTransactionBean>();		
		accountTranRepository.findAccountById(accountNo).forEach(acctTranListByNo::add);		
		if (acctTranListByNo.isEmpty()) {
			throw new NoAccountDetailsFoundException(ErrorConstants.ACCOUNT_TRAN_NOT_FOUND);
		} else {
			return acctTranListByNo;
		}
	}
	
	/**
	 * To get the account transaction details based on the account selected.
	 * @param acctTranDetailList
	 * @param accountNo
	 * @return
	 */
	public Optional<AccountTransactionBean> getAccountById(final List<AccountTransactionBean> acctTranDetailList,
			final String accountNo) {

		return acctTranDetailList.stream().filter(accountTran -> accountTran.getAcctNumber().equals(accountNo))
				.findAny();
	}
	
	/**
	 * To get the list of accounts mapped to the user based on the userId
	 * @param acctDetailList
	 * @param userId
	 * @return
	 */
	public Optional<AccountBean> getAccountByUserId(final List<AccountBean> acctDetailList, final String userId) {

		return acctDetailList.stream().filter(accountDetails -> accountDetails.getUserId().equals(userId)).findAny();

	}
	public void addAccountTran(AccountTransactionBean accountBean) {
		accountTranRepository.save(accountBean);
		
	}
	


}
