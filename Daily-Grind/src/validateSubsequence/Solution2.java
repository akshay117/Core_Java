package validateSubsequence;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

	public static void main(String[] args) {
		List<Integer> array = new ArrayList<>();
		List<Integer> sequence = new ArrayList<>();
		System.out.println(isValidSubsequence(array, sequence));
	}

	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		int seqIdx = 0;
		for (var value : array) {
			if (seqIdx == sequence.size()) {
				break;
			}
			if (sequence.get(seqIdx).equals(value)) {
				seqIdx++;
			}
		}
		return seqIdx == sequence.size();
	}
}
