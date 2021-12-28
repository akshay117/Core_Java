package nthFibonacci;
import java.util.*;

class Solution2 {
  public static int getNthFib(int n) {
  Map<Integer,Integer> memoize = new HashMap<Integer,Integer>();
		memoize.put(1,0);
		memoize.put(2,1);
	  return getNthFib(n,memoize);
  }
	
	public static int getNthFib(int n,Map<Integer,Integer> memoize){
	if(memoize.containsKey(n)){
		return memoize.get(n);
	}else{
		memoize.put(n, getNthFib(n-1,memoize)+getNthFib(n-2,memoize));
		return memoize.get(n);
	}
	}
}