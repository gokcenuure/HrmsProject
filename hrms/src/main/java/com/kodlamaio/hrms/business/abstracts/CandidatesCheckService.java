package com.kodlamaio.hrms.business.abstracts;

import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.entities.concretes.Candidates;

@Service
public interface CandidatesCheckService {
	boolean fieldsFull(Candidates candidates);
}
