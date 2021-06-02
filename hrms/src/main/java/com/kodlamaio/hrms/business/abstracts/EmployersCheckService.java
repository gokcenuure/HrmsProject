package com.kodlamaio.hrms.business.abstracts;

import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.entities.concretes.Employers;

@Service
public interface EmployersCheckService {
boolean fieldsFull(Employers employers);
	
	boolean isCompatibleWebAddressAndEmail(Employers employers);
}
