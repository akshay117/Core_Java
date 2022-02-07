package validateSubsequence;

import java.util.ArrayList;
import java.util.List;
            
public class Solution1 {
            
	 public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        List<Integer> sequence = new ArrayList<>();
	 	 System.out.println(isValidSubsequence(array,sequence) ); 
	}
	  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
			int arrIdx = 0;
			int seqIdx = 0;
			while(arrIdx < array.size() && seqIdx < sequence.size()) {
				if(array.get(arrIdx).equals(sequence.get(seqIdx))) {
					seqIdx++;
				}
				arrIdx++;
			}
	    return seqIdx == sequence.size();
	  }
}
