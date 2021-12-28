package nthFibonacci;

import java.util.*;

class Solution3 {
  public static int getNthFib(int n) {
    // Write your code here.
		int[] lastTwo = {0,1};
		int counter =3;
		while(counter <= n){
			int nextFib = lastTwo[0]+ lastTwo[1];
			lastTwo[0]=lastTwo[1];
			lastTwo[1]=nextFib;
			counter++;
		}
    return n > 1 ? lastTwo[1]:lastTwo[0];
  }
}
