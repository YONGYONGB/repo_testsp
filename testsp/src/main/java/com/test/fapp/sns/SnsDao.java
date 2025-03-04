package com.test.fapp.sns;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface SnsDao {
	
	public List<SnsDto> selectList();
	public SnsDto selectItem(SnsDto snsDto);

}
