class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int q1 = n - 1;
        int p = m + n - 1;

        while (p1 >= 0 && q1 >= 0) {
            if (nums1[p1] >= nums2[q1]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[q1];
                q1--;
            }
            p--;
        }
        while (q1 >= 0) {
            nums1[p] = nums2[q1];
            q1--;
            p--;
        }
    }
}