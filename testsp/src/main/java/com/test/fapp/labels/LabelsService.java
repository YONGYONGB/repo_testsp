package com.test.fapp.labels;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LabelsService {

	@Autowired
	LabelsDao labelsDao;
	
	public List<LabelsDto> selectList(){
		
		return labelsDao.selectList();
	}
	public LabelsDto selectItem(LabelsDto labelsDto){
	
		return labelsDao.selectItem(labelsDto);
	}
}
