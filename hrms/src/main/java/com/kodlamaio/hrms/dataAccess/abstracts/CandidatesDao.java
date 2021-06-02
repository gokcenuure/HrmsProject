package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.Candidates;

public interface CandidatesDao extends JpaRepository<Candidates,Integer>{
	

}
