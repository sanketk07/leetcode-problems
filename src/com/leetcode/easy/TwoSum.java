package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sanketkumar
 *
 */
/*
 * 	Given an array of integers, return indices of the two numbers such that they add up to a specific target.

	You may assume that each input would have exactly one solution, and you may not use the same element twice.

	Example:
	Given nums = [2, 7, 11, 15], target = 9,

	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
  
 	I/P:[2,5,5,11], 10
 	O/p:[1,2]
 */

public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {2, 5, 5,11};
		int target = 10;

		TwoSum ts = new TwoSum();
		ts.checkSumInArray(nums, target);

	}

	/*
	 * Complexity Analysis:

	Time complexity : O(n). We traverse the list containing nn elements exactly twice. 
	Since the hash table reduces the look up time to O(1), the time complexity is O(n).

	Space complexity : O(n). The extra space required depends on the number of items stored in the hash table, which stores exactly n elements.
	
	 * */
	
	public int[] checkSumInArray(int[] arr, int sum) {

		Map<Integer, Integer> inputElements = new HashMap<>();
		int[] digits = new int[2];

		for(int i = 0; i<arr.length; i++) {
			inputElements.put(arr[i], i);
		}

		for(int i = 0; i<arr.length;i++) {
			int complement = sum - arr[i];
			if(inputElements.containsKey(complement) && inputElements.get(complement) != i) {
				digits=new int [] {i, inputElements.get(complement)};
				System.out.println(digits[0] + ", "+ digits[1]);
				return digits;
			}
		}

		throw new IllegalArgumentException("No two numbers with given sum");
	}

	//Using 2 for loops. Complexity O(n^2)
	/*
	 * Complexity Analysis

		Time complexity : O(n^2)
		For each element, we try to find its complement by looping through the rest of array which takes O(n)O(n) time. 
		Therefore, the time complexity is O(n^2)

		Space complexity : O(1).
	 * */

	//		public int[] twoSum(int[] nums, int target) {
	//				
	//				int digits[] = new int[2];
	//				boolean flag = false;
	//			
	//		        for(int i=0; i<nums.length; i++){
	//		            for(int j=1; j<nums.length; j++)
	//		             if((nums[i]+nums[j]==target)&&(flag==false)&&(i!=j)){
	//		            	 	digits[0]=i;
	//		            	 	digits[1]=j;
	//		            	 	flag = true;
	//		             }
	//		        }
	//		        
	//		        System.out.println("["+digits[0]+","+digits[1]+"]");
	//		        return digits;
	//		    }

}

