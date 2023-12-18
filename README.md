# README for Java Tic Tac Toe Game

This Java program implements a simple command-line-based Tic Tac Toe game that allows two players to take turns and play until a player wins or the game ends in a draw.
Running the Game:

    Compile the Java files using a Java compiler: javac Main.java Game.java
    Run the compiled program: java Main
    Follow the prompts to play the game.

How to Play:

    The game starts by displaying an empty 3x3 board.
    Players take turns entering row and column numbers to place their marks ('X' or 'O') on the board.
    Win the game by having three of your marks in a row, column, or diagonal.
    If the board fills up without a winner, the game ends in a draw.

Game Mechanics:

    The board is displayed after each move.
    Input validation ensures players enter valid positions within the board's bounds and in unoccupied cells.
    The game switches between 'X' and 'O' for each turn.
    The program declares the winner when a player achieves three marks in a row, column, or diagonal or announces a draw when the board is full.

Java Files:

    Main.java: Contains the main game loop, user input handling, and game termination conditions.
    Game.java: Implements the game logic, board management, mark placement, win checking, and turn switching.

Additional Notes:

    The program uses a 3x3 board for the Tic Tac Toe game.
    Players input row and column numbers starting from 1.
    The game ends when a player wins or the board fills up.

Feel free to use, modify, or expand upon this code for educational purposes or entertainment. Enjoy playing Tic Tac Toe!
