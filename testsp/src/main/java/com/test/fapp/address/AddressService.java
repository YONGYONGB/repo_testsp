package com.test.fapp.address;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

	@Autowired
	AddressDao addressDao;
	
	public List<AddressDto> selectList(){
		return addressDao.selectList();
	}
	
	public AddressDto selecView(AddressDto addressDto){
		return addressDao.selectView(addressDto);
	}
	
	public int insert(AddressDto addressDto) {
		return addressDao.insert(addressDto);
	}
	

	public int update(AddressDto addressDto) {
		return addressDao.update(addressDto);
	}
}
