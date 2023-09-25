package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
@Aspect
@Component
@Slf4j

public class Aspectprogram {
	@BeforerAdvice("execution(* com.service.AddressService.*(..))")
	public void before(JoinPoint joinpoint) {
		log.info("***********Before method invoked**********" + joinpoint.getSignature());
	}

	@Around("execution(* com.service.AddressService.*(..))")
	public void after(JoinPoint joinpoint) {
          log.info("after method executed" + joinpoint.getSignature());
	}
}
