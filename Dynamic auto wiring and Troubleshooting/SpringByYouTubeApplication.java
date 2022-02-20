  package com.NightTimeSuff.spring.basics.springByYouTube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringByYouTubeApplication {
	
	//What are the beans?
	//What are the the dependencies of a bean?
	//What to search for beans?=> No need
	

	public static void main(String[] args) {
		
		
		//BinarySearchImpl binarySearch=new BinarySearchImpl(new QuickSortAlgorithm());
		//Application Context
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringByYouTubeApplication.class, args);
		BinarySearchImpl binarySearch=  applicationContext.getBean(BinarySearchImpl.class);
		int result=binarySearch.binarySearch(new int[] {12,4,6}, 3);
		System.out.println(result);
		
		/* OUTPUT
		 * com.NightTimeSuff.spring.basics.springByYouTube.BubbleSortAlgorithm@14c053c6
             3
		 */
	}

}
