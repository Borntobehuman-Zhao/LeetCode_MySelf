package structure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaoyx
 * @date 2021/7/15 11:15
 */
public class LeetCode118 {
    public static void main(String[] args) {
        generate(5);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> lists = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    lists.add(1);
                } else {
                    lists.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
                }
            }
            list.add(lists);
        }
        return list;
    }
}
