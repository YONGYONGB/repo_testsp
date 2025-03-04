package com.test.fapp.sns;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SnsService {

	@Autowired
	SnsDao snsDao;
	

	public List<SnsDto> selectList(){
		return snsDao.selectList();
	}
	public SnsDto selectItem(SnsDto snsDto) {
		return snsDao.selectItem(snsDto);
	}

}
