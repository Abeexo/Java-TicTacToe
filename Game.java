public class Game {
    private char[][] board = new char[3][3];
    private char turn;

    public Game() {
        this.turn = 'X';
        this.initialize();
    }

    private void initialize() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void drawBoard() {
        System.out.println("Board:\n");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public boolean setMark(int row, int col) {
        board[row][col] = this.turn;
        if (checkWin()) {
            return true;
        }
        if (this.turn == 'X') {
            this.turn = 'O';
        } else {
            this.turn = 'X';
        }
        return false;
    }

    public boolean boardIsFull() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkWin() {
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }

        for (int j = 0; j < board.length; j++) {
            if (board[0][j] != '-' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return true;
            }
        }

        return ((board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
                || (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]));
    }

    public char[][] getBoard() {
        return board;
    }

    public char getTurn() {
        return turn;
    }

}
