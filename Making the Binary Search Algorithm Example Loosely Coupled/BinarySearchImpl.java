package com.NightTimeSuff.spring.basics.springByYouTube;

public class BinarySearchImpl {
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

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
