/**
 * 
 */
package com.leetcode.easy;

/**
 * @author sanketkumar
 *
 */
public class SquareRoot {

	public float mySqrt(int x) {
        
		int result = 0, end = x, start = 1;
		
		while(start <= end) {
			
			int mid = (start+end)/2;
			
		if (mid*mid == x){
				return mid;
			}
			if(mid*mid<x) {
				start = mid+1;
				result = mid;
			}else {
				end = mid-1;
			}
		}
		
		return (int) Math.abs(result);
    }
	
	public static void main(String[] args) {
		SquareRoot s = new SquareRoot();
		System.out.println(s.mySqrt(37));
		
	}
}
