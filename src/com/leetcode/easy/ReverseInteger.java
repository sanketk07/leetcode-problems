/**
 * 
 */
package com.leetcode.easy;

/**
 * @author sanketkumar
 *
 */
public class ReverseInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseInteger rev = new ReverseInteger();
		
		 int r = rev.reverse(120);
		System.out.println("Reversed Integer is: "+ r);

	}
	
	public int reverse(int x) {
		boolean neg = false;
		if(x<0) {
        	x= x*-1;
        	neg = true;
        }
        
        
       
        int num=0;
         
        while(x>0) {
        		
        		num = num * 10 + x % 10;
        	
        		x= x/10;
        		
        	
        }
		if(neg ==true)
		{
			return (num*-1);
		}
		return num;
    }

}
