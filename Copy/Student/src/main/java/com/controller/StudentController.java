package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentyService;

@RestController
public class StudentController {
	
	@Autowired
	StudentyService studentyService;

	@GetMapping("/getData")
	public List<Map<String,Object>> getData()
	{
		return studentyService.getData();
	}
	
	@PostMapping("/addStudent")
	public String addStudent(@RequestBody Student s)
	{
		return studentyService.addStudent(s);
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Student s)
	{
		return studentyService.update(s);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int bookId)
	{
		return studentyService.delete(bookId);
	}
}
