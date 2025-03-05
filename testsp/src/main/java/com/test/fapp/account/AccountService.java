package com.test.fapp.account;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service					// 처음에로드가 될때 service라는 어노테이션을 service - 로직을 구현하는 곳(CRUD)
public class AccountService {
	
	//로직을 정의 하는 부분(CRUD)
	
	//오늘은 데이터를 가져오는 것만
	@Autowired          // 이미 spring boot에는 class 객체를 만들어 두었음. 이를 바로 이용할수있도록
	AccountDao accountDao; //AccountDao accountDao = new AccountDao를 하지 않아도 위의 autowired를 통해서 바로 구현가능.
	
	public List<AccountDto> selectList(){
		List<AccountDto> accountDtos = new ArrayList<>();
		
		accountDtos = accountDao.selectList();
		
		return accountDtos;
	}
	
	
	public AccountDto selectView(AccountDto accountDto) {
		
		return accountDao.selectView(accountDto);
	}
	
	public int insert(AccountDto accountDto) {
		
		return accountDao.insert(accountDto);
	}
	
	
}
