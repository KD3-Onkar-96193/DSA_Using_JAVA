
import java.util.Arrays;

class Q4 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {
        Q4 sol = new Q4();

        int[] nums1 = {1, 2, 3, 0, 0, 0}; 
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        sol.merge(nums1, m, nums2, n);

        System.out.println("Merged array:");
        System.out.println(Arrays.toString(nums1));
    }
}
