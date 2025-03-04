package com.test.fapp.contactaddress;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactAddressService {

	@Autowired
	ContactAddressDao contactAddressDao;
	
	public List<ContactAddressDto> selectList(){
		return contactAddressDao.selectList();
	}
	
	public ContactAddressDto selectItem(ContactAddressDto contactAddressDto){
		return contactAddressDao.selectItem(contactAddressDto);
	}
}
