/**
 * 
 */
package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;


/**
 * @author sanketkumar
 *
 */
public class RomanToInteger {

	/**
	 * @param args
	 */
	
	Map<Character, Integer> charMap = new HashMap<Character, Integer>();
	
	public static void main(String[] args) {
		RomanToInteger r = new RomanToInteger();
		r.initializeMapvalues();
		System.out.println(r.romanToInteger("DCXXI"));
	}
	
	public int romanToInteger(String roman) {
		initializeMapvalues();
		int result = 0;
		int len = roman.length();//2
		for(int i = 0; i < len; i++) {
			int s1 = getInteger(roman.charAt(i)); //i=0, s1=1
			
			if(i+1 < len) {//i+1= 0+1=1 < 2 - true, i+1=2 < 2 - false
				int s2 = getInteger(roman.charAt(i+1));//s2=10
				
				if(s1>=s2) {
					result = result+s1;
				}else {
					result = result + s2 - s1;//result = 0 + 10 - 1 = 9;
					i++; //i=1;
				}
			}else {
				result = result+s1; //result = 9;
				i++;
			}
		}
		return result;
	}
	
	public void initializeMapvalues() {
		charMap.put('I', 1);
		charMap.put('V', 5);
		charMap.put('X', 10);
		charMap.put('L', 50);
		charMap.put('C', 100);
		charMap.put('D', 500);
		charMap.put('M', 1000);
	}
	
	public int getInteger(char s) {
		return charMap.get(s);
	}

}
