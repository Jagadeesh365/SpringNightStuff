package com.example.demo.dao;

import java.util.Random;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.example.demo.anno.MyTx;
//business class
@Component
public class EmployeeDao {

	@MyTx
	public void saveEmployee() {
		System.out.println("FROM SAVE EMPLOYEE");
		
		
	}
	
	public void getAllEmployee() {
		System.out.println("FROM ALL EMPLOYEE");
		
		
	}
}
