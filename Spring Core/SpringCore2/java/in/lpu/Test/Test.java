package in.lpu.Test;

import java.lang.annotation.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.lpu.Bean.DbConn;
import in.lpu.Bean.config.Appconfig;

public class Test {
	public static void main(String[] args) {

		// Crete Spring container refernce
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);

		// scan spring beans (classs)- using one package name
		// ac.scan("in.lpu.Bean");
		// referesh -create object,provide data, links objests.....
		// ac.refresh();

		// read object(bean) and print
		DbConn ob = ac.getBean("conn", DbConn.class);
		System.err.println(ob);
		// close container
		ac.close();

	}
}
