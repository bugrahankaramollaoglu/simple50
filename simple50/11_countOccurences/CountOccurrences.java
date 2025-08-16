public class CountOccurrences {

	public static int countOccurrences(int[] arr, int target) {
		int count = 0;
		for (int num : arr) {
			if (num == target) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 2, 4, 2 };
		int[] arr2 = { 1, 1, 1, 1 };
		int[] arr3 = { 1, 2, 3 };
		int[] arr4 = {};

		System.out.println(countOccurrences(arr1, 2)); // Output: 3
		System.out.println(countOccurrences(arr2, 1)); // Output: 4
		System.out.println(countOccurrences(arr3, 5)); // Output: 0
		System.out.println(countOccurrences(arr4, 1)); // Output: 0
	}
}
