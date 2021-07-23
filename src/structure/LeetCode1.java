package structure;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaoyx
 * @date 2021/7/13 15:09
 */
public class LeetCode1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 5, 11};
        int target = 10;
        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if ((target - nums[i]) == nums[j]) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }


    public static int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }
}
