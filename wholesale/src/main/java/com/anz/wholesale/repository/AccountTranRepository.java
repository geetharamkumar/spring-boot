package com.anz.wholesale.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.anz.wholesale.bean.AccountTransactionBean;

public interface AccountTranRepository extends JpaRepository<AccountTransactionBean, Long> {

	@Query(value = "SELECT * FROM ACCOUNT_TRAN WHERE ACCT_NUMBER  =?1", nativeQuery = true)
	public List<AccountTransactionBean> findAccountById(@Param("acctNumber") String acctNumber);
}
