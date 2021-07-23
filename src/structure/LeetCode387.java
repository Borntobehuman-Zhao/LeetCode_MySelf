package structure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author zhaoyx
 * @date 2021/7/19 15:57
 */
public class LeetCode387 {
    public static void main(String[] args) {
        firstUniqChar("leetcode");
    }

    //数组处理，利用indexof方法和lastindexof方法。
    public static int firstUniqChar(String s) {
        int min = Integer.MAX_VALUE;
        for (char c = 'a'; c <= 'z'; c++) {
            int n = s.indexOf(c);
            if (n != -1 && n == s.lastIndexOf(c) && n < min) {
                min = n;
            }
        }
        return min < s.length() ? min : -1;
    }

    //hash表存储数据出现的频率
    public static int firstUniqChar2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    //hash存储数据出现的索引，符合则替换
    public static int firstUniqChar3(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(0);
            if (map.containsKey(c)) {
                map.put(c, -1);
            } else {
                map.put(c, 1);
            }
        }
        int ans = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int pos = entry.getValue();
            if (pos != -1 && pos < ans) {
                ans = pos;
            }
        }
        if (ans == Integer.MAX_VALUE) {
            return -1;
        } else {
            return ans;
        }
    }
}
