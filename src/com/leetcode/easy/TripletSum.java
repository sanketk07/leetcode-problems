/**
 * 
 */
package com.leetcode.easy;

import java.util.Hashtable;

/**
 * @author sanketkumar
 *
 */
class TripletSum{
	  public void findTriplets(int arr[], int n){
	    boolean found = false;
	    for(int i = 0; i<=n-2; i ++){
	      Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
	      for(int j = i+1; j <= n-1; j++){

	        int sum = -(arr[i]+arr[j]);
	        if(table.containsKey(sum)){
	          System.out.println(sum + ", "+ arr[i]+", "+arr[j]);
	          found = true;
	        }else{
	          table.put(arr[j], j);
	        }
	      }
	    }

	    if(found==false){
	      System.out.println("No triplet combination found!");
	    }
	  }
	  
	  public static void main(String args[]) {
		  int arr[] = {0, -1, 2, -3, 1};
		    int n = arr.length;
		    
		    TripletSum t = new TripletSum();
		    
		    t.findTriplets(arr, n);
		    
	  }
	}
