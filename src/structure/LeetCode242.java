package structure;

/**
 * @author zhaoyx
 * @date 2021/7/23 15:14
 */
public class LeetCode242 {
    public static void main(String[] args) {

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            temp = s.charAt(i) - 'a';
            ++arr[temp];
        }
        for (int j = 0; j < t.length(); j++) {
            temp = t.charAt(j) - 'a';
            if (--arr[temp] < 0) {
                return false;
            }
        }
        return true;
    }
}
