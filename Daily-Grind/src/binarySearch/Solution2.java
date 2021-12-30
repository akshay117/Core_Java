package binarySearch;

class Solution2 {
	public static int binarySearch(int[] array, int target) {
		return binarySearch(array, target, 0, array.length - 1);
	}

	public static int binarySearch(int[] array, int target, int left, int right) {
		while (left <= right) {
			int middle = (right + left) / 2;
			int potentialMatch = array[middle];
			if (target == potentialMatch) {
				return middle;
			} else if (target < potentialMatch) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
		}
		return -1;
	}
}
