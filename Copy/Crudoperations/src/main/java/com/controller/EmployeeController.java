package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService servemp;

	@PostMapping("/insert")
	public String insert(@RequestBody Employee emp) {
		servemp.insert(emp);	
		return "inserted";
		}

	@PutMapping("/update")
	public String update(@RequestBody Employee emp) {
		int i=servemp.update(emp);
		//return "updated";
		if(i>0) {
			return "updated";
		}
		else {
			return "no value existed with that id";
		}
	}

}
