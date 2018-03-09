/**
 * 
 */
package com.leetcode.easy;

/**
 * @author sanketkumar
 *
 */
public class PalindromeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PalindromeNumber p = new PalindromeNumber();
		System.out.println(p.isPalindrome(353));
	}
	
	public boolean isPalindrome(int x) {
        
		int temp = x;
		int num = 0;
		
		while(x>0) {
			num = num * 10 + x%10;
			x = x/10;
		
		}
		
		if(num==temp) {
			return true;
		}
		return false;
    }

}
