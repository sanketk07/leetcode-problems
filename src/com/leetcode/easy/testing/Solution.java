/**
 * 
 */
package com.leetcode.easy.testing;

import java.util.HashSet;



/**
 * @author sanketkumar
 *
 */
class Solution {
    // Since we "may assume the given input string is always valid"
    // we can safely write the function without doing extra input checking.
    public String nextClosestTime(String time) {
        String[] input = time.split(":");
        HashSet<Integer> set = new HashSet<Integer>() {{
            add(Integer.parseInt(input[0].substring(0, 1)));
            add(Integer.parseInt(input[0].substring(1, 2)));
            add(Integer.parseInt(input[1].substring(0, 1)));
            add(Integer.parseInt(input[1].substring(1, 2)));
        }};

        // Generate all possible combinations.
        HashSet<Integer> possible = new HashSet<Integer>();
        int minValue = Integer.MAX_VALUE;
        System.out.println("Integer.MAX_VALUE: "+ minValue);
        for (int i : set) {
            for (int j : set) {
            	if(i!=j) {
                int tmp = i * 10 + j;
                
                		possible.add(tmp);
                		  minValue = Math.min(minValue, tmp);
                          System.out.println("minValue: "+ minValue+ ", tmp: "+tmp);
                }else {
                		System.out.println("else case");
                		System.out.println("i: "+i+", j: "+j);
                		
                }
                
              
            }
        }

        String minTime;
        if (minValue < 10) {
            minTime = "0" + String.valueOf(minValue);
            System.out.println("minTime: "+ minTime);
        } else {
            minTime = String.valueOf(minValue);
            System.out.println("minTime: "+ minTime);
        }

        String ret = "";
        int currMinute = Integer.parseInt(input[1]);
        int currHour = Integer.parseInt(input[0]);
        if (currMinute < 59) {
            int tmpMin = Integer.MAX_VALUE;
            for (int i : possible) {
                if (i > currMinute && i < 60) {
                    tmpMin = Math.min(tmpMin, i);
                }
            }
            if (tmpMin != Integer.MAX_VALUE) {
                if (tmpMin < 10) {
                    ret = ret + input[0] + ":0" + String.valueOf(tmpMin);
                } else {
                    ret = ret + input[0] + ":" + String.valueOf(tmpMin);
                }
                return ret;
            }
        }

        if (currHour < 23) {
            int tmpMin = Integer.MAX_VALUE;
            for (int i : possible) {
                if (i > currHour && i < 24) {
                    tmpMin = Math.min(tmpMin, i);
                }
            }

            if (tmpMin != Integer.MAX_VALUE) {
                if (tmpMin < 10) {
                    ret = ret + "0" + String.valueOf(tmpMin) + ":" + minTime;
                } else {
                    ret = ret + String.valueOf(tmpMin) + ":" + minTime;
                }

                return ret;
            }
        }

        ret = ret + minTime + ":" + minTime;

        return ret;
    }
    
    public static void main(String args[]) {
    	
    	Solution c = new Solution();
		System.out.println(c.nextClosestTime("23:59"));
}
}
