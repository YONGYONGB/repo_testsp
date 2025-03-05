package com.test.fapp.address;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface AddressDao {

	public List<AddressDto> selectList();
	
	public AddressDto selectView(AddressDto addressDto);
	
	public int insert(AddressDto addressDto);
}
