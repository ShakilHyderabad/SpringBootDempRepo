package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dto.EmpDto;
import com.nt.entity.EmployeEntity;
import com.nt.repo.EmpRepo;

@Service("ser")
public class EmpServiceImpl implements EmpService {
    @Autowired
	private EmpRepo repo;
	
	@Override
	public String insertData(EmpDto dto) {
		EmployeEntity entity=new EmployeEntity();
		BeanUtils.copyProperties(dto,entity);
        EmployeEntity res =repo.save(entity);	
		return res!=null?"Record Inserted Successfully":"Record Insertion failed";
	}

	@Override
	public List<EmpDto> getAllRecord() {
	 List<EmpDto> dto=new ArrayList<EmpDto>();
	 
	 List<EmployeEntity> entityList;
	 entityList=repo.findAll();
	 System.out.println("list"+entityList);
	 entityList.forEach(entity->{
	 EmpDto dto1=new EmpDto();	 
	 BeanUtils.copyProperties(entity,dto1);	 
	  dto.add(dto1);
	 });
		     
		
		
		return dto;
	}

	
}
