package com.test.fapp.gro;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface GroDao {

	public List<GroDto> selectList();
	
	public GroDto selectItem(GroDto groDto);
}
