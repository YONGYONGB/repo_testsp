package com.test.fapp.email;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface EmailDao {

	public List<EmailDto> selectList();
	
	public EmailDto selectItem(EmailDto emailDto);
}
