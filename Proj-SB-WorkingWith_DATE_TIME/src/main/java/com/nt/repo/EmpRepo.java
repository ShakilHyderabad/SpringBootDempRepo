package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.EmployeEntity;

public interface EmpRepo extends JpaRepository<EmployeEntity,Integer> {
	
	

}
