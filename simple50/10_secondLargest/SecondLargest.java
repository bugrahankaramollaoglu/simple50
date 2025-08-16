public class SecondLargest {

	public static int secondLargest(int[] arr) {
		if (arr.length < 2) {
			return -1;
		}
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > max) {
				secondMax = max;
				max = num;
			} else if (num > secondMax && num != max) {
				secondMax = num;
			}
		}
		return secondMax;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 1, 1, 1 };
		int[] arr3 = { 1, 2, 3 };
		int[] arr4 = {};
		System.out.println(secondLargest(arr1)); // 4
		System.out.println(secondLargest(arr2)); // -1
		System.out.println(secondLargest(arr3)); // 2
		System.out.println(secondLargest(arr4)); // -1
	}
}
