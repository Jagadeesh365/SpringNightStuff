package com.NightTimeSuff.spring.basics.springByYouTube;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	//using  constuctor
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	//using Setter
		public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
			this.sortAlgorithm = sortAlgorithm;
		}
		//using no setter remove all above Autowiring but setter and no setter same 

	public int binarySearch(int []numbers,int numberToSearchFor)
	{
		int [] sortedNumbers=sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
	//Sorting an array
	//Bubble Sort Algorithm
	//search the array
	//Return the result
	return 3;
	
	}
	 

}
