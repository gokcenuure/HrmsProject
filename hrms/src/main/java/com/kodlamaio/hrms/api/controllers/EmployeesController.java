package com.kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.EmployeesService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Employees;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {

	private EmployeesService  employeesService;
	
	@Autowired
	public EmployeesController(EmployeesService employeesService) {
		this.employeesService=employeesService;
	}
	@GetMapping("/getall")
	public DataResult<List<Employees>> getAll() {
		return employeesService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Employees employees) {
		return employeesService.add(employees);
	}
}
