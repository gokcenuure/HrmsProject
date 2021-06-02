package com.kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.EmployersService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Employers;


@RestController
@RequestMapping("/api/employers")
public class EmployersController {

	
	private EmployersService employersService;
	
	@Autowired
	public EmployersController(EmployersService employersService) {
		this.employersService=employersService;
	}
	@GetMapping("/getall")
	public DataResult<List<Employers>> getAll()  {
		return employersService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Employers employers) {
		return employersService.add(employers);
	}
	
}
