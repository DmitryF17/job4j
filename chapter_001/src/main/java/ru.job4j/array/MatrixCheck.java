package ru.job4j.array;
/**
 * Package for the winning situation in the game Sokoban.
 * author DmitryF17
 * version 01
 * since05/12/2019
 */
public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            int rw = 0;
            int cw = 0;
                 if (board[i][i] == 'X') {
                     for (int j = 0; j < board.length; j++) {
                         if (board[i][j] == 'X') {
                             rw++;
                         }
                         if (board[j][i] == 'X') {
                             cw++;
                         }
                     }
                         if (rw == board.length || cw == board.length) {
                             result = true;
                         }
                     break;
                 }
        }
        return result;
    }
        public static void main(String[] args) {
            char[][] hasWinVertical = {
                    {'_', '_', 'X', '_', '_'},
                    {'_', '_', 'X', '_', '_'},
                    {'_', '_', 'X', '_', '_'},
                    {'_', '_', 'X', '_', '_'},
                    {'_', '_', 'X', '_', '_'},
            };
            boolean win = isWin(hasWinVertical);
            System.out.println("A board has a winner : " + win);
            System.out.println();
            char[][] hasWinHor = {
                    {'_', '_', '_', '_', '_'},
                    {'X', 'X', 'X', 'X', 'X'},
                    {'_', '_', '_', '_', '_'},
                    {'_', '_', '_', '_', '_'},
                    {'_', '_', '_', '_', '_'},
            };
            boolean winHor = isWin(hasWinHor);
            System.out.println("A board has a winner : " + winHor);
            System.out.println();
            char[][] notWin = {
                    {'_', '_', 'X', '_', '_'},
                    {'_', '_', 'X', '_', '_'},
                    {'_', 'X', '_', '_', '_'},
                    {'_', '_', 'X', '_', '_'},
                    {'_', '_', 'X', '_', '_'},
            };
            boolean lose = isWin(notWin);
            System.out.println("A board has a winner : " + lose);
        }
}





