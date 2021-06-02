package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.CandidatesCheckService;
import com.kodlamaio.hrms.business.abstracts.CandidatesService;
import com.kodlamaio.hrms.core.abstracts.EmailService;
import com.kodlamaio.hrms.core.adapters.MernisServiceAdapter;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.ErrorResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.dataAccess.abstracts.CandidatesDao;
import com.kodlamaio.hrms.entities.concretes.Candidates;

@Service
public class CandidatesManager implements CandidatesService {

	private CandidatesDao candidatesDao;
	private CandidatesCheckService candidatesCheckService;
	private EmailService emailService;
	private MernisServiceAdapter mernisServiceAdapter;

	@Autowired
	public CandidatesManager(CandidatesDao candidatesDao,CandidatesCheckService candidatesCheckService,EmailService emailService, MernisServiceAdapter mernisServiceAdapter) {
	this.candidatesDao = candidatesDao;
    this.candidatesCheckService = candidatesCheckService;
    this.emailService = emailService;
    this.mernisServiceAdapter = mernisServiceAdapter;
   
}
	@Override
	public DataResult<List<Candidates>> getAll() {
		return new SuccessDataResult<>(candidatesDao.findAll(),"Successfull");
	}
	public Result add(Candidates candidates){

        if(!candidatesCheckService.fieldsFull(candidates)){
            return new ErrorResult("There is empty fields!");
        } else if (mernisServiceAdapter.isNatIdReal(candidates.getIdentificationNumber(),
                candidates.getFirstName(), candidates.getLastName(), candidates.getBirthDate())){
            return new ErrorResult("Identification Number, Name, Surname, Birth Date");
        }
        try {
            candidatesDao.save(candidates);
            emailService.sendVerificationMail(candidates.getEmail());
            return new SuccessResult("Candidates Saved");
        } catch (Exception exception){
            exception.printStackTrace();
            return new ErrorResult("Registration Failed");
        }
	}
	

	

}
