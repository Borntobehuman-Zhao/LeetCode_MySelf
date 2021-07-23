package structure;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author zhaoyx
 * @date 2021/7/14 14:20
 */
public class LeetCode350 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 4, 4, 6};
        int[] b = new int[]{2, 2, 4, 4, 6};
        intersect1(a, b);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int n = Math.min(nums1.length, nums2.length);
        int[] res = new int[n];
        int index = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : nums1) {
            int count = hashMap.getOrDefault(i, 0) + 1;
            hashMap.put(i, count);
        }
        for (int j : nums2) {
            int count = hashMap.getOrDefault(j, 0);
            if (count > 0) {
                res[index++] = j;
                count--;
                if (count > 0) {
                    hashMap.put(j, count);
                } else {
                    hashMap.remove(j);
                }
            }
        }
        for (int i : res) {
            System.out.println(i);
        }
        return Arrays.copyOfRange(res, 0, index);
    }

    public static int[] intersect1(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index = 0;
        int n = nums1.length < nums2.length ? nums1.length : nums2.length;
        int[] res = new int[n];
        int p = 0, q = 0;
        while (p < nums1.length && q < nums2.length) {
            if (nums1[p] > nums2[q]) {
                q++;
            } else if (nums1[p] < nums2[q]) {
                p++;
            } else {
                res[index++] = nums1[p];
                p++;
                q++;
            }
        }
        return Arrays.copyOfRange(res, 0, index);
    }
}
