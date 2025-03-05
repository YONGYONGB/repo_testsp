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
	
	public ContactAddressDto selectView(ContactAddressDto contactAddressDto){
		return contactAddressDao.selectView(contactAddressDto);
	}
	
	public int insert(ContactAddressDto contactAddressDto) {
		return contactAddressDao.insert(contactAddressDto);
	}
	
}
