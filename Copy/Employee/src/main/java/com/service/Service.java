package com.service;


	import org.springframework.web.bind.annotation.RequestBody;

import com.Demo;
	@org.springframework.stereotype.Service
	public class Service {
		public int add( Demo d)
		  {
			 int i=0;
			 for(int j=d.getA();j<=d.getB();j++) {
				
			i=i+j;
		  }
			 return i;
		}
	}
	
