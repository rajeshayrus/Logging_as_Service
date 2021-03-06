package com.durgasoft.main.aspects;

import java.util.List;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Aspect
@Configuration
public class LoggingAspect {

	private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Pointcut(value= "execution(* com.durgasoft.main.service.ProductService.*(..))")
	public void pointcut() {
		
	}
	@Around("pointcut()")
	public List applicationLogger(ProceedingJoinPoint joinPoint) throws Throwable {
		
		ObjectMapper ob = new ObjectMapper();
		Object[] args = joinPoint.getArgs();
		String request = ob.writeValueAsString("input params");
		logger.info("Method execution started : "+joinPoint.getSignature());
		logger.info(request);
		List response = (List) joinPoint.proceed();
		String writeValueAsString = ob.writeValueAsString(response);
		logger.info(writeValueAsString);
		logger.info("method exectution ended");
		return response;
	}
	
}
