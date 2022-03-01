package com.example.demo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TxService {
   
	@Pointcut("@annotation(com.example.demo.anno.MyTx)")
	public void p1() {
		
	}
	@Before("p1()")
	public void beginTx() {
		System.out.println("Tx Begin");
		
	}
	
	
	
	 
}
