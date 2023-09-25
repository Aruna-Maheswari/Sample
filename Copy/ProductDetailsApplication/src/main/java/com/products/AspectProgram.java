package com.products;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class AspectProgram {

	


		@Before(value = "execution(* com.products.ProductService.*(..))")
		public void startMethod(JoinPoint joinPoint)
		{
			log.info("\n======> Started with method "+joinPoint.getSignature().getName());
		}
		
		@After(value = "execution(*  com.products.ProductService.*(..))")
		public void endMethod(JoinPoint joinPoint)
		{
			log.info("\n======> Completed execution of method "+joinPoint.getSignature().getName());
		}
	}


