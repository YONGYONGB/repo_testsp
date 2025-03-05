package com.test.fapp.day;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DayService {

	@Autowired
	DayDao dayDao;
	
	public List<DayDto> selectList(){
		return dayDao.selectList();
	}
	
	public DayDto selectView(DayDto dayDto){
		return dayDao.selectView(dayDto);
	}
	
}
