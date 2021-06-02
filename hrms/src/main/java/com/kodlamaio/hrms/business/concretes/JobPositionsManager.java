package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.JobPositionsService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.ErrorResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.dataAccess.abstracts.JobPositionsDao;
import com.kodlamaio.hrms.entities.concretes.JobPositions;

@Service
public class JobPositionsManager implements JobPositionsService {

	private JobPositionsDao jobPositionsDao;
	
	 @Autowired
	    public JobPositionsManager(JobPositionsDao jobPositionsDao) {
	        this.jobPositionsDao = jobPositionsDao;
	    }

	@Override
	public DataResult<List<JobPositions>> getAll() {
		return new SuccessDataResult<>(jobPositionsDao.findAll(),"Success!" );
	}

	@Override
	public Result add(JobPositions jobPositions) {

      try {
	      jobPositionsDao.save(jobPositions);
	      return new SuccessResult("Pozisyon kaydedildi");
	  } catch (Exception exception){
	      exception.printStackTrace();
	      return new ErrorResult("Kaydedilemedi");
	  }
		
	}	
}
