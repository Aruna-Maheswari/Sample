package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/getMsg/{m}")
	public String msg(@PathVariable String m)
	{
		return "Hi...."+m;
	}
}
