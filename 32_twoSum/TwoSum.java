import java.util.Arrays;

public class TwoSum {
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
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{10,2,5,3,11,0}, 16)));
    }
}