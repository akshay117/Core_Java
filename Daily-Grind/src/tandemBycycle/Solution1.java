package tandemBycycle;

import java.util.*;

class Solution1 {

	public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
		Arrays.sort(redShirtSpeeds);
		Arrays.sort(blueShirtSpeeds);

		if (!fastest) {
			reverseArrayInPlace(redShirtSpeeds);
		}

		int topSpeed = 0;
		for (int idx = 0; idx < redShirtSpeeds.length; idx++) {
			int rider1 = redShirtSpeeds[idx];
			int rider2 = blueShirtSpeeds[blueShirtSpeeds.length - idx - 1];
			topSpeed = topSpeed + Math.max(rider1, rider2);
		}
		return topSpeed;
	}

	public void reverseArrayInPlace(int[] Array) {
		int start = 0;
		int end = Array.length - 1;
		while (start < end) {
			int temp = Array[start];
			Array[start] = Array[end];
			Array[end] = temp;
			start++;
			end--;
		}
	}
}
