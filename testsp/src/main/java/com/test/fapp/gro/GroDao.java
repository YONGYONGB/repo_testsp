package com.test.fapp.gro;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface GroDao {

	public List<GroDto> selectList();
	
	public GroDto selectView(GroDto groDto);
	
	public int insert(GroDto groDto); //객체가 필요하기 때문에 list가 
	
	public int update(GroDto groDto);
	
	public int delete(GroDto groDto);
	
	public int unsee(GroDto groDto);
	
	
}
