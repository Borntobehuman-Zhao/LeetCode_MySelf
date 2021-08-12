package structure;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhaoyx
 * @date 2021/7/19 15:22
 */
public class LeetCode73 {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(a);
    }

    public static void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> column = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    column.add(j);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row.contains(i) || column.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
