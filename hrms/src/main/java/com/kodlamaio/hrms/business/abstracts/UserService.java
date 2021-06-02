package com.kodlamaio.hrms.business.abstracts;
import java.util.List;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.User;

@Service
public interface UserService {

	
	DataResult<List<User>> getAll();
	Result delete(User user);
}
