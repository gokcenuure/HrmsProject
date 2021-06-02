package com.kodlamaio.hrms.core.abstracts;

import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.EmailVerificationCode;

public interface EmailVerificationCodeService {

	 Result add(EmailVerificationCode emailVerificationCode);
}
