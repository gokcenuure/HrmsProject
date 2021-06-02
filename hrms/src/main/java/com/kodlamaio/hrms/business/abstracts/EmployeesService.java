package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Employees;

@Service
public interface EmployeesService {
	
	DataResult<List<Employees>>getAll();
	
	 Result add(Employees employees);
	 Result delete(Employees employees);
	 
}
