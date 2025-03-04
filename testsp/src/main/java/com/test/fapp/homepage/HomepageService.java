package com.test.fapp.homepage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomepageService {

	@Autowired
	HomepageDao homepageDao;
	
	public List<HomepageDto> selectList(){
		return homepageDao.selectList();
	}
	
	public HomepageDto selectItem(HomepageDto homepageDto){
		return homepageDao.selectItem(homepageDto);
	}
}
