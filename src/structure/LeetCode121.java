package structure;

/**
 * @author zhaoyx
 * @date 2021/7/14 15:22
 */
public class LeetCode121 {
    public static void main(String[] args) {
        int[] a = new int[]{2, 1, 4};
        System.out.println(maxProfit1(a));
    }

    //超时了，人麻了
    public static int maxProfit(int[] prices) {
        int max = 0;
        int p = 0, q = 0;
        while (p < prices.length - 1) {
            if (q == prices.length - 1) {
                p++;
                q = p;
            } else {
                q++;
                int temp = prices[q] - prices[p];
                if (temp > max) {
                    max = temp;
                }
            }
        }
        return max;
    }

    //动态规划，动态方程f(n) = f(n-1) = f(n-2)
    public static int maxProfit1(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > max) {
                max = prices[i] - minprice;
            }
        }
        return max;
    }
}
