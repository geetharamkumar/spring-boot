package com.anz.wholesale.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.anz.wholesale.bean.AccountBean;


public interface AccountRepository extends  JpaRepository<AccountBean, Long> {
	
	@Query(value = "SELECT * FROM ACCOUNT WHERE USER_ID  =?1", nativeQuery = true)
	public List<AccountBean> findAccountByUser(@Param("userId") String userId);
	
	

}
