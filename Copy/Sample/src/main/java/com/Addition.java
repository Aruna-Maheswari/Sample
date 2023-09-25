package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Addition {
	@GetMapping("add/{a}/{b}")
	public int add(@PathVariable int a,@PathVariable int b)
	{
		return a+b;
	}

}
