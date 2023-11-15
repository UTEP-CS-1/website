---
layout: page
title: Lab 12
nav_exclude: true
search_exclude: true
---

# Lab 12: Application of Knowledge
{:.no_toc}

Today's topic is..... everything we have done so far!

Learning objectives:
- Students will understand and apply 2D Arrays
- Students will practice using objects, and classes to accomplish abstracting tasks away from the main 

{: .important }
Before you get started, read this entire document. If anything is unclear, do not
hesitate to come to your instructor, TAs, IAs, and Googlers for help or clarification. We will be happy to help
you. The office hours schedule is posted on the lab website and Blackboard.

## Table of contents
{: .no_toc .text-delta }

- TOC
{:toc}

## Before you begin

Download the starter code zip file, unzip it / extract all, and place the contents in cs1 under a new lab12 directory. Open it in Sublime.

<a href="https://github.com/UTEP-CS-1/website/raw/main{{page.url|relative_url}}../lab12_starter.zip" class="btn btn-green">Download starter code</a>

Your starter code will already have every method signature needed. Each section below will describe the requirements for each method.


Your submission will be scored based upon:
- The code compiles and runs.
- Correctly following the instructions and completing the code accordingly.
- Variables should be given descriptive names. Variable names should be written in camel case (all letters lowercase except the first letter of each word besides the first word), whichIsLikeThis.
- Comments are used to label sections and keep your code organized.
- The required test cases are added to the main method.

{: .warning }
> The following are not allowed:
> - Other Java libraries aside from Scanner, Files and FileExceptions.
> - The use of Java lists, linked-lists and other data structures other than arrays.
> - Use of generative AI (i.e., ChatGPT).
> - Posting any assignment (or any of its parts) online in any form.
> - Any type of plagiarism. 

## Overview

Today we will create the Tic-Tac-Toe Game Lab, you will utilize Java programming skills to create an interactive game, focusing on applying 2D arrays and object-oriented concepts.

This lab aims to strengthen your understanding of game logic, user input handling, and problem-solving in a practical, engaging context.

## Exercises

### 1) Creating the TicTacToe Class:
Complete the `TicTacToe` class by adding the following:
- Method for intializing the board (Empty board with '-')
- Displaying the board. 
- Making a move

{: .tip }
Moves are made using coordinates given from the user. You will need to parse the input by the comma delimeter to obtain the index. Example: 2,2 will be placed at 2,2 in your array. 
 

### 2) Game Logic
- Implement the logic for players to take turns to make moves.
- Implement a method `changePlayer()` to alternate turns between players. Players should alternate after a move is performed.

### 3) Enhancing the Game

- Ensure moves are `valid` and within the board. If a move is invalid then ask the user to try again.
{: .tip }
An invalid move would be one that is a. outside of the board or b. a space that is already taken

- Add logic to handle invalid moves and prevent overwriting existing moves. 
{: .tip }
After a valid move is made, call the method changePlayer() to allow the other player make a move. 
- Include an option to play another round after the game ends.

### 4) User Experience Improvements
- Provide clear instructions for inputting moves.
- Display informative messages for invalid moves, wins, draws, or next player's turn.


### 5) Win Counter
- Implement a feature in the `TicTacToe` class to keep track of the number of wins for each player ('X' and 'O').
- Add methods to retrieve and display the current win counts after each game.

### 6) Extra Credit:
- Implement a feature to give personalized message to user when winning (ie. "Congrats Dr. Mejia on your 3rd win!")

## TicTacToe.java
- public void resetBoard() -> resets board to 3x3 array of blank -'s'
- public void displayBoard() -> prints the gameboard (2D array)
- public boolean makeMove(int row,int col) 
    - given the CORRECT row and col, print into your board the player piece (X or O)
    - return `true` if valid movement was made, or `false` if it cannot be made 
    - ie. if player x has piece on 2,2, and player o tries 2,2 return `False`
- public boolean checkWin() -> checks rows, columns, & diagonals returns `True` if win found, false if not
- public void changePlayer() ->  method used to change from player X to 0
- public boolean isBoardFull() -> returns `False` if -'s left in array 
- public char getCurrentPlayer() -> Method to distinguish which player is making the move
## Main.java
- Scanner for user input on moves
- Using User input implement the game logic using TicTacToe's helper methods!


## Grading criteria

Your submission will be graded based on:
- Whether the code compiles and runs.
- Adherence to the instructions and correct completion of the tasks.
- Clear organization and use of comments.
- Use of descriptive variable names and adherence to Java naming conventions.


| **Criteria**                             |   **Pts** |
|:-----------------------------------------|----------:|
| Correctness of the coding exercises      |        85 |
| Coding style and use of comments         |        15 |
| **_Total_**                              | **_100_** |

The deadline is as posted on Gradescope. Assignments will be accepted up to three days late (72 hours) and will have scores reduced by 10% for each day (24 hours) of tardiness.

