package com.nt.service;

import java.util.List;

import com.nt.dto.EmpDto;

public interface EmpService {
	
	public String insertData(EmpDto dto);
	
	public List<EmpDto> getAllRecord();

}
