/**
 * 
 */
package com.leetcode.easy.testing;


/**
 * @author sanketkumar
 *
 */
public class TestTime {
	public String functionTime(int[] numbers){      
        int num[] = numbers;
        int temp = 0;
        int cnt=0;
        int numA=0;
        int numB=0;
        int numC=0;
        int numD=0;
        int target = (10 * num[0] + num[1]) * 60 + (10 * num[2] + num[3]);
        int minDiff = target;
        
        for(int a=0;a<num.length; a++){
            for(int b=0;b<num.length; b++){
                for(int c=0;c<num.length; c++){
                    for(int d=0;d<num.length; d++){
                        if(a!=b && a!=c && a!=d
                                && b!=c && b!=d
                                        && c!=d){
                            if((10*num[c]+num[d])<60) {
                                int cal = (10 * num[a] + num[b]) * 60 + (10 * num[c] + num[d]);
                                System.out.println("Input Numbers [ " + num[a] + ", " + num[b] + ", " + num[c] + ", " + num[d] + " ]");
                                
                                int diff = target - cal;
                                System.out.println("diff:"+ diff);
                                if(diff<minDiff)
                                {
                                	minDiff = diff;
                                	System.out.println("minDiff:"+ minDiff );
                                	
                                }
                                //int diff = cal - target > 0 ? cal- target : 1440 + cal - target;
                                
                                if (cal <= 1439) {
                                    cnt++;
                                    if (temp < cal) {
                                        temp = cal;
                                        numA = num[a];
                                        numB = num[b];
                                        numC = num[c];
                                        numD = num[d];
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if(cnt==0){
            return "impossible";
        }else {
            return numA+""+numB+" : "+numC+""+numD;
        }
    }
	
	 public static void main(String args[]) {
	    	
		 TestTime c = new TestTime();
		
		 String str = "11:00";
		 
		 
		 int numbers[] = new int[4];
		 String result = str.substring(0, 2) + str.substring(2+1);
		 System.out.println(result);
		 for (int i = 0; i < result.length(); i++) {
			
				  numbers[i] = Character.getNumericValue(result.charAt(i));
					 System.out.println(numbers[i] + ":" + result.charAt(i));
			 
		
		 }
		 
		 
 		System.out.println(c.functionTime(numbers));
 }
}
