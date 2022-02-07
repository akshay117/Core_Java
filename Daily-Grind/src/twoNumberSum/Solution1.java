package twoNumberSum;

import java.util.*;

public class Solution1 {
	
 public static void main(String[] args) {
	 int targetSum =10;
	 int[] array = {3,5,-4,8,11,1,-1,6};
 	 System.out.println(Arrays.toString(twoSum( array , targetSum)) ); 
}
 
 public static int[] twoSum(int[] array ,int targetSum) {
	 for(int idx=0;idx<array.length-1;idx++) {
		int firstNum = array[idx];
		 for(int jdx=idx+1;jdx<array.length;jdx++) {
			 int secondNum = array[jdx];
			 if(firstNum+secondNum==targetSum) {
				 return new int[] {firstNum,secondNum};
			 }
		 }
	 }
	 return new int[0];
 }

}