package structure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author zhaoyx
 * @date 2021/7/19 17:13
 */
public class LeetCode383 {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        boolean flag = false;
        for (Map.Entry<Character, Integer> m : hashMap.entrySet()) {
            if (map.containsKey(m.getKey())) {
                if (m.getValue() <= map.get(m.getKey())) {
                    flag = true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return flag;
    }

    public static boolean canConstruct1(String ransomNote, String magazine) {
        int[] arr = new int[26];
        int temp = 0;
        for (int i = 0; i < magazine.length(); i++) {
            temp = magazine.charAt(i) - 'a';
            arr[temp]++;
        }
        for (int j = 0; j < ransomNote.length(); j++) {
            temp = ransomNote.charAt(j) - 'a';
            if (arr[temp] > 0) {
                arr[temp]--;
            } else {
                return false;
            }
        }
        return true;
    }
}
