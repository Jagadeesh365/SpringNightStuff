package com.NightTimeSuff.spring.basics.springByYouTube;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		// logic for Bubble Sort
		return numbers;
	}

}