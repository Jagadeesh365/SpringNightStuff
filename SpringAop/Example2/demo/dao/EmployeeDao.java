package com.example.demo.dao;

import java.util.Random;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
//business class
@Component
public class EmployeeDao {

	
	public String saveEmployee() {
		System.out.println("FROM SAVE EMPLOYEE");
		
		/*if(new Random().nextInt(15)<=10)
		{
			throw new RuntimeException("DUMMY EXCEPTION");
		}
		 */
		return "HELLO";
	}
}
