/**
 * 
 */
package com.leetcode.easy;

/**
 * @author sanketkumar
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */
public class SingleNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numbers[]= {1, 2, 2, 3, 3};
		int size = numbers.length;
		SingleNumber s = new SingleNumber();
		System.out.println(s.checkSingleNumber(numbers, size));
	}
	
	public int checkSingleNumber(int[] numbers, int size) {
		int start = numbers[0];
		for(int i=1;i<size;i++)
			start = start ^ numbers[i];
		return start;
	}

}
