package com.kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="verification_codes")
public class EmailVerificationCode {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private int id;

	    @Column(name = "user_id")
	    private int userId;

	    @Column(name = "email_verification_code")
	    private String emailVerificationCode;
	   
	    @Column(name = "is_confirmed")
	    private boolean isConfirmed;

	    @Column(name = "created_date")
	    @JsonIgnore
	    private LocalDate createdDate = LocalDate.now();

	    @Column(name = "confirmed_date")
	    private LocalDate confirmedDate;
	
	
}
