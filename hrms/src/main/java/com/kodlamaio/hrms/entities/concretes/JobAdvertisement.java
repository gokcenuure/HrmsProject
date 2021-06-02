package com.kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity

@Table(name="job_advertisements")
public class JobAdvertisement {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private int id;

	    @Column(name = "job_Description")
	    private String jobDescription;

	    @Column(name = "min_Salary")
	    private Double minSalary;

	    @Column(name = "max_Salary")
	    private Double maxSalary;

	    @Column(name = "open_Position_Count")
	    private int openPositionCount;

	    @Column(name = "application_Deadline")  //son basvuru tarihi
	    private Date applicationDeadLine;

	    @Column(name = "create_Date")
	    private Date createDate;

	    @Column(name = "is_Active")
	    private boolean isActive;
	}










