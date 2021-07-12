package structure;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author zhaoyx
 * @date 2021/7/12 15:41
 */
public class LeetCode217 {
    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
