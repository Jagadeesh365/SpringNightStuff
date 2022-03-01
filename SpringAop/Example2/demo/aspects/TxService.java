package com.example.demo.aspects;

import javax.xml.crypto.Data;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TxService {
   
	@Pointcut("execution(* com.example.demo.dao.EmployeeDao.*())")
	public void p1() {}
	
	@Around("p1()")
	public void aroundTest(ProceedingJoinPoint jp) {
		System.out.println("Before b.method");
		
		//code-->call :b.method
		try {
			Object ob=jp.proceed();
			System.out.println("Data is : "+ob);
			//on success
		} catch (Throwable e) {
			
			//on failures
			e.printStackTrace();
		}
		 //at any case
		System.out.println("After b.method");
		
	}
	
	 
}
