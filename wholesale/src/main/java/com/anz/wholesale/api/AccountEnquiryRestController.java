package com.anz.wholesale.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anz.wholesale.bean.AccountBean;
import com.anz.wholesale.bean.AccountTransactionBean;
import com.anz.wholesale.constants.AccountEnqMappingConstants;
import com.anz.wholesale.services.AccountDetailsEnqService;
/**
 * 
 * @author Geetha Thambiran
 *
 */
@RestController
public class AccountEnquiryRestController {
	@Autowired
	AccountDetailsEnqService accountEnqService;
	
	@GetMapping(AccountEnqMappingConstants.ACCOUNT_DETAIL_ENQ_PAGE)
	public List<AccountBean> getAccountListEnq(@PathVariable(AccountEnqMappingConstants.USER_ID) String userId) {
		return accountEnqService.getAccountListEnq(userId);
	}
	
	@GetMapping(AccountEnqMappingConstants.ACCOUNT_TRAN_DETAIL_PAGE)
	public List<AccountTransactionBean> getAccountTranList(@PathVariable(AccountEnqMappingConstants.ACCOUNT_NUMBER) String accountNo) {
		return accountEnqService.getAccountTranListEnq(accountNo);
	}
	//Below two methods are added for testing purpose
	@PutMapping(AccountEnqMappingConstants.ADD_ACCOUNT)
	public void  addAccount(@RequestBody AccountBean accountBean) {
		 accountEnqService.addAccount(accountBean);
	}
	@PutMapping(AccountEnqMappingConstants.ADD_ACCOUNT_TRANSACTION)
	public void  addAccountTran(@RequestBody AccountTransactionBean accountBean) {
		 accountEnqService.addAccountTran(accountBean);
	}

}
