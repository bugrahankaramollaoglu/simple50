public class MergeTwoArrays {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m - 1;
            int j = n - 1;
            int k = m + n - 1;
            
            while (j >= 0) {
                if (i >= 0 && nums1[i] > nums2[j]) {
                    nums1[k--] = nums1[i--];
                } else {
                    nums1[k--] = nums2[j--];
                }
            }
        }

    public static void main(String[] args) {
        MergeTwoArrays obj = new MergeTwoArrays();
        int[] nums1 = {10, 20, 0, 0, 0};
        int[] nums2 = {15, 35, 100};
        int m = 2, n = 3;

        obj.merge(nums1, m, nums2, n);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
