package com.kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name="job_positions")
public class JobPositions {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "detail")
	private String detail;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
