package com.test.fapp.labels;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface LabelsDao {

	public List<LabelsDto> selectList();
	public LabelsDto selectItem(LabelsDto labelsDto);
}
