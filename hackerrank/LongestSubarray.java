import java.util.HashMap;

public class LongestSubarray {

	public static boolean isValidWindow(HashMap<Integer, Integer> map) {
		if (map.size() <= 1)
			return true;
		if (map.size() > 2)
			return false;

		Integer[] keys = map.keySet().toArray(new Integer[0]);
		return Math.abs(keys[0] - keys[1]) <= 1;
	}

	public static int longestSubarray(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int left = 0, maxLen = 0;

		for (int right = 0; right < arr.length; right++) {

			map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

			while (!isValidWindow(map)) {
				int count = map.get(arr[left]) - 1;
				if (count == 0) {
					map.remove(arr[left]);
				} else {
					map.put(arr[left], count);
				}
				left++;
			}

			maxLen = Math.max(maxLen, right - left + 1);
		}

		return maxLen;
	}

	public static void main(String[] args) {
		System.out.println(longestSubarray(new int[] { 0, 1, 2, 1, 2, 3 }));
		System.out.println(longestSubarray(new int[] { 3, 2, 2, 1 }));
		System.out.println(longestSubarray(new int[] { 1, 2, 3, 4, 5 }));
		System.out.println(longestSubarray(new int[] { 1, 3, 1 }));
	}
}
