package com.fg;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;



@Aspect
public class LogginAdvice  {

	@Before("execution(* *.hello(..))")
	public void logBefore(JoinPoint joinPoint) throws Throwable {
		System.out.println(".... LOGGIN BEFORE ADVICE .... Method " + joinPoint.getSignature().getName());		
		
	}

	@AfterReturning("execution(* *.hello(..))")
	public void logAfter(JoinPoint joinPoint)
			throws Throwable {
		System.out.println(".... LOGGIN AFTER ADVICE .... ");
		
	}


	
	
}
