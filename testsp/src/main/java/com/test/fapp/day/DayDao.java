package com.test.fapp.day;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface DayDao {

	public List<DayDto> selectList();
	
	public DayDto selectView(DayDto dayDto);
	
	public int insert(DayDto dayDto);
	
	public int update(DayDto dayDto);
	
}
