  package com.NightTimeSuff.spring.basics.springByYouTube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringByYouTubeApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch=new BinarySearchImpl(new QuickSortAlgorithm());
		int result=binarySearch.binarySearch(new int[] {12,4,6}, 3);
		System.out.println(result);
		SpringApplication.run(SpringByYouTubeApplication.class, args);
	}

}
