package com.kodlamaio.hrms.core.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.core.abstracts.EmailVerificationCodeService;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.dataAccess.abstracts.EmailVerificationCodeDao;
import com.kodlamaio.hrms.entities.concretes.EmailVerificationCode;


@Service
public class EmailVerificationCodeManager implements EmailVerificationCodeService {
    private EmailVerificationCodeDao emailVerificationCodeDao;

    @Autowired
    public EmailVerificationCodeManager(EmailVerificationCodeDao emailVerificationCodeDao) {
        this.emailVerificationCodeDao = emailVerificationCodeDao;
    }

    @Override
    public Result add(EmailVerificationCode emailVerificationCode) {
        this.emailVerificationCodeDao.save(emailVerificationCode);
        return new SuccessResult();

    }}

	