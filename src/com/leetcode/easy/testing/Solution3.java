/**
 * 
 */
package com.leetcode.easy.testing;

import java.util.TreeSet;

/**
 * @author sanketkumar
 *
 */
class Solution3 {
    public int kEmptySlots(int[] flowers, int k) {
        TreeSet<Integer> active = new TreeSet();
        int day = 0;
        for (int flower: flowers) {
            day++;
            active.add(flower);
            Integer lower = active.lower(flower);
            Integer higher = active.higher(flower);
            if (lower != null && flower - lower - 1 == k ||
                    higher != null && higher - flower - 1 == k)
                return day;
        }
        return -1;
    }
    
    public static void main(String args[])
    {
        Solution3 sol = new Solution3();
        int flowers[] = {3, 1, 5, 4, 2};
        int k = 2;
        int a = sol.kEmptySlots(flowers, k);
        System.out.println("result:"+ a);
    }
}
