package ua.leader.basics.C09_TicTacToe;

import java.util.Scanner;


    public class TicTacToe {
        // One-dimensional board array, initialized with numbers 1 to 9
        static char[] board = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        static char currentPlayer = 'X';  // Start with player 'X'

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int totalMoves = 0;
            boolean gameWon = false;

            // Main game loop
            while (totalMoves < 9) {
                printBoard();
                int move = getPlayerMove(scanner);

                if (isValidMove(move)) {
                    makeMove(move);
                    totalMoves++;
                    gameWon = checkWinner();
                    if (gameWon) {
                        break;
                    }
                    switchPlayer();
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }

            printBoard();
            printGameResult(gameWon);
            scanner.close();
        }

        // Method to print the current state of the board
        public static void printBoard() {
            System.out.println();
            System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
            System.out.println("---|---|---");
            System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
            System.out.println("---|---|---");
            System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
            System.out.println();
        }

        // Method to get the player's move
        public static int getPlayerMove(Scanner scanner) {
            System.out.println("Player " + currentPlayer + ", enter your move (1-9): ");
            return scanner.nextInt();
        }

        // Method to check if the move is valid
        public static boolean isValidMove(int move) {
            return move >= 1 && move <= 9 && board[move - 1] != 'X' && board[move - 1] != 'O';
        }

        // Method to update the board with the current player's move
        public static void makeMove(int move) {
            board[move - 1] = currentPlayer;
        }

        // Method to switch the current player
        public static void switchPlayer() {
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        // Method to check if a player has won
        public static boolean checkWinner() {
            return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) || // Row 1
                    (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) || // Row 2
                    (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) || // Row 3
                    (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) || // Column 1
                    (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) || // Column 2
                    (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) || // Column 3
                    (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) || // Diagonal 1
                    (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);   // Diagonal 2
        }

        // Method to print the result of the game
        public static void printGameResult(boolean gameWon) {
            if (gameWon) {
                System.out.println("Congratulations! Player " + currentPlayer + " wins!");
            } else {
                System.out.println("It's a draw!");
            }
        }
    }


