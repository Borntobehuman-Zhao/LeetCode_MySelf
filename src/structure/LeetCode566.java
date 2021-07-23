package structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhaoyx
 * @date 2021/7/15 9:50
 */
public class LeetCode566 {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 2}, {3, 4}};
        matrixReshape(a, 1, 4);
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        if (m * n != r * c) {
            return mat;
        } else {
            int[][] res = new int[r][c];
            for (int i = 0; i < m * n - 1; ++i) {
                res[i / c][i % c] = mat[i / m][i % m];
            }
            return res;
        }
    }
}
