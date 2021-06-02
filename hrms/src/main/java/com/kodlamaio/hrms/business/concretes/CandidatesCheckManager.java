package com.kodlamaio.hrms.business.concretes;

import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.CandidatesCheckService;
import com.kodlamaio.hrms.entities.concretes.Candidates;


@Service
public class CandidatesCheckManager implements CandidatesCheckService{

	@Override
	public boolean fieldsFull(Candidates candidates) {
		return candidates.getId() != 0 && candidates.getEmail() != null && candidates.getPassword() != null && candidates.getFirstName() != null
                && candidates.getLastName() != null && candidates.getIdentificationNumber() != null && candidates.getBirthDate() !=0;
	
}}
