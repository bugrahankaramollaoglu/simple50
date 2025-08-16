import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class TwoSum {

    // bu O(n^2) olan brute force versioynu. 
    public static int[] twoSum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0,0};
    }

    public static int[] twoSum2(int[] arr, int target) {

        // [10, 2, 8, 11, 9], 17 # [2, 4]
        Map<Integer, Integer> seen = new HashMap<Integer,Integer>();


        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(arr[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{10,2,5,3,11,0}, 16)));
        System.out.println(Arrays.toString(twoSum2(new int[]{10,2,5,3,11,0}, 16)));
    }
}