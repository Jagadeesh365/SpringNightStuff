package com.example.demo.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TxService {
   
	@Pointcut("execution(public String com.example.demo.dao.EmployeeDao.saveEmployee(..))")
	public void p1() {}
	//advice
	 @Before("p1()") //JointPoint
	//@After("")
	//@Around("")
	//@AfterReturning("")
	//@AfterThrowing("")
	public void beginTx() {
		 System.out.println("Tx started!");
		
	}
	 @After("p1()") //success/fail
	 public void sendReport() {
		 System.out.println("Report sent!");
		
	}
	 @AfterReturning( value = "p1()",returning = "ob") //only on success
	 public void commitTx(Object ob) {
		 System.out.println("Tx is committed "+ob);
		
	}
	 @AfterThrowing(value = "p1()",throwing="th") //when we have expection
	 public void rollbackTax(Throwable th) {
		 System.out.println("Tx is rollback "+th.getMessage());
		
	}
}
