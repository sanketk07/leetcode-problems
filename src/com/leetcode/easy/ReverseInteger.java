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
		
		 int r = rev.reverse(1000000003);
		System.out.println("Reversed Integer is: "+ r);

	}
	public int reverse(int x) {
	    int num = 0;
	    
	    while(x != 0) {
	    	System.out.println("num: "+ num);
	        int temp = num*10 + x%10;
	        System.out.println("temp: "+ temp);
	        
	        if ((temp - x%10)/10 != num) 
	        {
	        	System.out.println("(temp - x%10)/10 :"+ (temp - x%10)/10 );
	        	return 0;
	        }
	        
	        else num = temp;

	        x = x/10;   
	    }
	    return num;
	}/*
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
	    
        if(num > Integer.MAX_VALUE || num < Integer.MIN_VALUE ){
            return 0;
        }
        
		return num;
    }
	*/
	//OLD VERSION
/*	public int reverse(int x) {
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
           //String temp=Integer.toString(num);
        double test = Math.pow(2,31)-1;
        System.out.println("test: "+ test);
        double ts= Double.parseDouble(Integer.toString(num));
        System.out.println("ts: "+ ts);
        if(ts>test ){
            return 0;
        }
        
	    
        Double test = Math.pow(2,31)-1;
       // System.out.println("test:" + test);
        Double ds = Double.parseDouble(Integer.toString(num));
        
        //Double(d1).compareTo(new Double(d2))
        //the value 0 if d1 is numerically equal to d2; a value less than 0 if d1 is numerically less than d2; and a value              //greater than 0 if d1 is numerically greater than d2.
        if(ds.compareTo(test) >0 ){
            return 0;
        }
        
		return num;
    }*/

}
