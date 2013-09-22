package com.fg;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ExceptionAspect {

	// executed only when exception is thrown...
	@AfterThrowing("execution(* *.*(..))")
	public void logIfException(JoinPoint joinPoint)
			throws Throwable {
		System.out.println(".... LOGGIN THROW ADVICE from exception aspect...... ");
		
	}
	
}
