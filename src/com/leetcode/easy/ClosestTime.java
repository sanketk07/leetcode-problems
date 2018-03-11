/**
 * 
 */
package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author sanketkumar
 *
 */
class ClosestTime {
    int diff = Integer.MAX_VALUE;
    String result = "";
    
    public String nextClosestTime(String time) {
        Set<Integer> set = new HashSet<>();
        set.add(Integer.parseInt(time.substring(0, 1)));
        set.add(Integer.parseInt(time.substring(1, 2)));
        set.add(Integer.parseInt(time.substring(3, 4)));
        set.add(Integer.parseInt(time.substring(4, 5)));
        
        if (set.size() == 1) return time;
        
        List<Integer> digits = new ArrayList<>(set);
        int minute = Integer.parseInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3, 5));
        System.out.println("minute: "+ minute);
        System.out.println("digits: "+ digits.size());
        dfs(digits, "", 0, minute);

        return result;
    }

    private void dfs(List<Integer> digits, String cur, int pos, int target) {
    	System.out.println("digits: "+ digits+ ", cur: "+cur+ ", pos: "+ pos+", target: "+ target);
        if (pos == 4) {
        	System.out.println("test1");
            int m = Integer.parseInt(cur.substring(0, 2)) * 60 + Integer.parseInt(cur.substring(2, 4));
            if (m == target) return;
            int d = m - target > 0 ? m - target : 1440 + m - target;
           
            if (d < diff) {
            	System.out.println("diff: "+ diff);
                diff = d;
                result = cur.substring(0, 2) + ":" + cur.substring(2, 4);
            }
            
            return;
        }

        for (int i = 0; i < digits.size(); i++) {
        	System.out.println("test2");
            if (pos == 0 && digits.get(i) > 2) continue;
            if (pos == 1 && Integer.parseInt(cur) * 10 + digits.get(i) > 23) continue;
            if (pos == 2 && digits.get(i) > 5) continue;
            if (pos == 3 && Integer.parseInt(cur.substring(2)) * 10 + digits.get(i) > 59) continue;
            dfs(digits, cur + digits.get(i), pos + 1, target);
        }
    }
    
    public static void main(String args[]) {
    	
    		ClosestTime c = new ClosestTime();
    		System.out.println(c.nextClosestTime("23:59"));
    }
}
