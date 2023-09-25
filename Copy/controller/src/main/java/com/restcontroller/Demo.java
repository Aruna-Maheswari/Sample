package com.restcontroller;


	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class Demo {
		@RequestMapping("/test")
		public String display()
		{
			return "Welcome.........!";
		}

	}



