package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.Employees;

public interface EmployeesDao extends JpaRepository<Employees,Integer>{
	

}
