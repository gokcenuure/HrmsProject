package com.kodlamaio.hrms.core.concretes;


import org.springframework.stereotype.Component;

import com.kodlamaio.hrms.core.abstracts.EmailService;


@Component
public class EmailManager implements EmailService{

	@Override
	public void sendVerificationMail(String email) {
		
	return;
    
	}
}
