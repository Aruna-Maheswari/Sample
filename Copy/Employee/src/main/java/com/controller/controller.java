package com.controller;


	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

import com.Demo;

	@RestController

	public class controller{
	  @Autowired
	  Service ds;
		@PostMapping("/get")
	 public int add(@RequestBody Demo d) {

		 return ((controller) ds).add(d);
	}
	}


