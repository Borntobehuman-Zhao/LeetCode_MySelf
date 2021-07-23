package structure;


/**
 * @author zhaoyx
 * @date 2021/7/16 14:45
 */
public class LeetCode36 {
    public static void main(String[] args) {
        char[][] c = {{'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(isValidSudoku(c));

    }

    public static boolean isValidSudoku(char[][] board) {
        char[][] row = new char[9][9];
        char[][] columns = new char[9][9];
        char[][] box = new char[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                int box_index = (i / 3) * 3 + j / 3;
                if (c != '.') {
                    int n = c - '1';
                    System.out.println(c);
                    if (row[i][n] == 1) {
                        return false;
                    } else {
                        row[i][n] = 1;
                    }
                    if (columns[j][n] == 1) {
                        return false;
                    } else {
                        columns[j][n] = 1;
                    }
                    if (box[box_index][n] == 1) {
                        return false;
                    } else {
                        box[box_index][n] = 1;
                    }
                }
            }
        }
        return true;
    }

}
