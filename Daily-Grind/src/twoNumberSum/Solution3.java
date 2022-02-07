package twoNumberSum;

import java.util.Arrays;

public class Solution3 {

	 public static void main(String[] args) {
		 int targetSum =10;
		 int[] array = {3,5,-4,8,11,1,-1,6};
	 	 System.out.println(Arrays.toString(twoNumberSum( array , targetSum)) ); 
	}
	 
	  public static int[] twoNumberSum(int[] array, int targetSum) {
		    Arrays.sort(array);
				int left = 0;
				int right = array.length-1;
				while(left<right){
					int currentSum = array[left]+array[right];
					if(currentSum==targetSum){
						return new int[] {array[left],array[right]};
					}else if(currentSum<targetSum){
						left++;
					}else if (currentSum>targetSum){
						right--;
					}
				}
		    return new int[0];
		  }
}
