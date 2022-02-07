package twoNumberSum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution2 {

	 public static void main(String[] args) {
		 int targetSum =10;
		 int[] array = {3,5,-4,8,11,1,-1,6};
	 	 System.out.println(Arrays.toString(twoNumberSum( array , targetSum)) ); 
	}
	 

	  public static int[] twoNumberSum(int[] array, int targetSum) {
		   Set<Integer> nums = new HashSet<>();
				for( int num : array){
					int potentialMatch = targetSum - num;
					if(nums.contains(potentialMatch)){
						return new int[] {potentialMatch,num};
					}else{
						nums.add(num);
					}
				}
		    return new int[0];
		  }
}
