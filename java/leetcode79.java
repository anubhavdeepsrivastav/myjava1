class leetcode79 {
    public  static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean x = word_s(i, j, board, board.length, board[0].length, 0, word);
                    if (x == true) {
                        return true;
                    }
                }
            }
        }
        return false;

    }

    public static boolean word_s(int row, int col, char board[][], int m, int n, int idx, String word) {
        // base case
        if (idx == word.length()) {
            return true;
        }
        if (row < 0 || row >= m || col < 0 || col >= n || board[row][col] != word.charAt(idx)) {
            return false;
        }
        board[row][col] = '#';
        int r[] = { -1, 0, 0, 1 };
        int c[] = { 0, -1, 1, 0 };
        for (int i = 0; i < c.length; i++) {
            boolean ans = word_s(row + r[i], col + c[i], board, m, n, idx + 1, word);
            if (ans == true) {
                return true;
            }
        }
        board[row][col] = word.charAt(idx);
        return false;

    }

    public static void main(String args[])
    {
        String word="ABCB";
        char ch[][]={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(exist( ch, word));
    }
}