package com.kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.kodlamaio.hrms.business.abstracts.CandidatesService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Candidates;

public class CandidatesController {

	
	private CandidatesService candidatesService;
	
	@Autowired
	public CandidatesController(CandidatesService candidatesService) {
		this.candidatesService=candidatesService;
	}
	@GetMapping("/getall")
	public DataResult<List<Candidates>> getAll() {
		return candidatesService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Candidates candidates) {
		return candidatesService.add(candidates);
	}
}
