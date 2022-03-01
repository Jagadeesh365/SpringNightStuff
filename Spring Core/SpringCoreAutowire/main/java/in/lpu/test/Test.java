package in.lpu.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.lpu.Bean.Employee;
import in.lpu.test.Config.AppConfig;


public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		Employee emp = ac.getBean("eob", Employee.class);
		System.out.println(emp);
		ac.close();
	}
}
