package com.test.fapp.account;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao {

	//mapper 에서 해당하는 쿼리와 연결 시켜 주고  쿼리 결과를 가져옴
	
	public List<AccountDto> selectList();
	public AccountDto selectList_test(AccountDto accountDto);    //  AccountDto로 함으로써 제한을 둠?
	
}