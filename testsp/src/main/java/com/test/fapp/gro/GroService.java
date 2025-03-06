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
	public GroDto selectView(GroDto groDto){
		return groDao.selectView(groDto);
	}
	
	public int insert(GroDto groDto){
		return groDao.insert(groDto);
	}
	
	public int update(GroDto groDto) {
		return groDao.update(groDto);
	}
	
}
