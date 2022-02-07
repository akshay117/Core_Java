package sortedSquaredArray;

import java.util.Arrays;

public class Solution1 {

	  public int[] sortedSquaredArray(int[] array) {
	   int[] sortedSquares = new int[array.length];
			for (int idx=0;idx<array.length;idx++){
				int value = array[idx];
				sortedSquares[idx] =value*value;
			}
			Arrays.sort(sortedSquares);
	    return  sortedSquares;
	  }
	}