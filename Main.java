import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean gameEnded = false;
        Game session = new Game();
        int row, col;

        System.out.println("\nLet's play Tic Tac Toe!");
        while (!gameEnded) {
            session.drawBoard();

            if (session.boardIsFull()) {
                System.out.println("No one won!");
                gameEnded = true;
                break;
            }

            System.out.println(session.getTurn() + "'s Turn:");
            char[][] board = session.getBoard();

            while (true) {
                System.out.print("Enter a row number: ");
                row = in.nextInt() - 1;
                System.out.print("Enter a column number: ");
                col = in.nextInt() - 1;
                if (row < 0 || col < 0 || row >= 3 || col >= 3) {
                    System.out.println("This position is off the bounds of the board! Try again.");
                } else if (board[row][col] != '-') {
                    System.out.println("Someone has already made a move at this position! Try again.");
                } else {
                    break;
                }
            }
            if (session.setMark(row, col)) {
                session.drawBoard();
                System.out.println("Congratulation!The player with " + session.getTurn() + " won the game!");
                gameEnded = true;
            }
        }
        in.close();
    }
}