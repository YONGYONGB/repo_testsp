package com.test.fapp.gro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroService {

	@Autowired
	GroDao groDao;
	
	public List<GroDto> selectList(){
		return groDao.selectList();
	}
	public GroDto selectItem(GroDto groDto){
		return groDao.selectItem(groDto);
	}
}
