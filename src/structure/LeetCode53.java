package structure;


/**
 * @author zhaoyx
 * @date 2021/7/12 16:00
 */
public class LeetCode53 {
    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArray(nums);
    }

    //动态规划,核心方程式：pre = Math.max(pre+i,pre)
    public static int maxSubArray(int[] nums) {
        int pre = 0, maxRes = nums[0];
        for (int i : nums) {
            pre = Math.max(pre + i, i);
            maxRes = Math.max(pre, maxRes);
        }
        return maxRes;
    }
}
