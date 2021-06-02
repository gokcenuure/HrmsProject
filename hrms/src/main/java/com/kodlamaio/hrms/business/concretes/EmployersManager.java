package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.EmployersService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.dataAccess.abstracts.EmployersDao;
import com.kodlamaio.hrms.entities.concretes.Employers;

@Service
public class EmployersManager implements EmployersService{

	private EmployersDao employersDao;
	
	@Autowired
	public EmployersManager(EmployersDao employersDao) {
		super();
		this.employersDao = employersDao;
		
	}

	@Override
	public DataResult<List<Employers>> getAll() {
		return new SuccessDataResult<>(employersDao.findAll(),"Success!");
	}

	@Override
	public Result add(Employers employers) {
		return null;
	}
	
	

}
