package com.test.fapp.day;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface DayDao {

	public List<DayDto> selectList();
	
	public DayDto selectItem(DayDto dayDto);
	
}
