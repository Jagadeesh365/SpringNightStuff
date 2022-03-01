package in.lpu.Bean.test;

import java.security.Provider.Service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.lpu.Bean.EmpJdbcRepo;
import in.lpu.Bean.EmpService;
import in.lpu.Bean.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new  AnnotationConfigApplicationContext(AppConfig.class);
		
		EmpService service=ac.getBean("empService",EmpService.class);
		System.out.println(service);
		ac.close();
	}
}
