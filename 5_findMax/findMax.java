// find max in an array

class findMax {

	public static int myFindMax(int[] arr) {
		int length = arr.length;

		if (length < 1)
			return -1;

		int max = arr[0];
		for (int i = 1; i < length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}

		return max;
	}

	public static void main(String[] args) {
		// int[] arr = {};
		int[] arr = { 10, 20, 2, 55, 3, 0, -65 };
		System.out.println(myFindMax(arr));
	}
}

// time: O(n)
// space: O(1)
