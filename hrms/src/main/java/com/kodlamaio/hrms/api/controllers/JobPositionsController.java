package com.kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.JobPositionsService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.JobPositions;

@RestController
@RequestMapping("/api/jobPositions")
public class JobPositionsController {

	private JobPositionsService jobPositionsService;
	
	    @Autowired
	    public JobPositionsController(JobPositionsService jobPositionsService) {
	        this.jobPositionsService = jobPositionsService;
	    }

	    @GetMapping("/getall")
	    public DataResult<List<JobPositions>> getAll(){
	        return jobPositionsService.getAll();
	    }
	    
	    @PostMapping("/add")
	    public Result add(@RequestBody JobPositions jobPositions){
	        return jobPositionsService.add(jobPositions);
	    }
	
	
	
	
	
 }
