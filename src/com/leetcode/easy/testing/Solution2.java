/**
 * 
 */
package com.leetcode.easy.testing;

/**
 * @author sanketkumar
 *
 */
public class Solution2 {
    

    public int kEmptySlots(int[] P, int K) {
        int n = P.length;
        if(K == 0)
            return P[n-1];
        if (n == 0 || K >= n) return -1;
        int[] f = new int[n + 1];
        
        for (int i = 0; i < n; ++i)
            if (IsValid(P[i], K, n, f))
                return i + 1;
        
        return -1;
    }
    
    private boolean IsValid(int x, int k, int n, int[] f) {
        f[x] = 1;
        if (x + k + 1 <= n && f[x + k + 1] == 1) {
            boolean valid = true; 
            for (int i = 1; i <= k; ++i)
                if (f[x + i] == 1) {
                    valid = false;
                    break;
                }
            if (valid) return true;
        }
        if (x - k - 1 > 0 && f[x - k - 1] == 1) {
            for (int i = 1; i <= k; ++i)
                if (f[x - i] == 1) return false;
            return true;
        }
        return false;
    }
    
    public static void main(String args[])
    {
        Solution2 sol = new Solution2();
        int flowers[] = {3, 1, 5, 4, 2};
        int k = 1;
        int a = sol.kEmptySlots(flowers, k);
        System.out.println("result:"+ a);
    }
}
