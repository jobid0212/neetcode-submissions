class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> rowNums = new HashSet<>();
        Set<Character> colNums = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            rowNums.clear();
            colNums.clear();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !rowNums.add(board[i][j])) {
                    return false;
                }
                if (board[j][i] != '.' && !colNums.add(board[j][i])) {
                    return false;
                }
            }
        }

        rowNums.clear();
        for (int box = 0; box < 9; box++) {
            rowNums.clear();
            for (int cell = 0; cell < 9; cell++) {
                int r = (box / 3) * 3 + (cell / 3);
                int c = (box % 3) * 3 + (cell % 3);

                if (board[r][c] != '.' && !rowNums.add(board[r][c])) {
                    return false;
                }
            }
        }
        return true;
    }
}
