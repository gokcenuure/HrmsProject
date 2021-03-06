package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.kodlamaio.hrms.business.abstracts.UserService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.dataAccess.abstracts.UserDao;
import com.kodlamaio.hrms.entities.concretes.User;

public class UserManager implements UserService{

	 private UserDao userDao;

    @Autowired
	public UserManager(UserDao userDao) {
	   this.userDao = userDao;
    }
	
	
	@Override
	public DataResult<List<User>> getAll() {
		
		return new SuccessDataResult<>(userDao.findAll(),"Success");
		
	}

	@Override
	public Result delete(User user) {
		
		return new SuccessDataResult<>(userDao.findAll(),"Kullanıcı silindi");
	}

}
