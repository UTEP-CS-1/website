---
layout: page
title: Comprehensive Lab 3
nav_exclude: true
search_exclude: true
---

# Comprehensive Lab 3: Wordle
{:.no_toc}

## Table of contents
{: .no_toc .text-delta }

- TOC
{:toc}

{: .important }
Before you get started, read this entire document. If anything is unclear, do not
hesitate to come to your instructor, TAs, IAs, and Googlers for help or clarification. We will be happy to help
you. The office hours schedule is posted on the lab website and Blackboard.

{: .warning }
> Generative AI use is prohibited. Plagiarism detection analysis will be performed on all submissions. Please review the course syllabus for the full standards of conduct. Below is an exerpt on the definition of collaboration.
>
> The following are not allowed:
> - Posting any assignment (or any of its parts) online in any form
> - Sharing assignments outside of the course (i.e., to other students)
> - Copy/pasting any code from anywhere other than from Instructor/TA/IA. This includes copy/pasting code snippets (or entire assignments) from online resources such as, but not limited to: stackoverflow.com, Chegg, Course Hero, ChatGPT/Bard.
> - Sharing your code with other students.
> - Reading code from other students.
> - Look at another student’s code
> - Debug another student’s code
>
> The following are allowed:
> - Communicating with the instructors/TAs/IAs/Googlers
> - Searching for basic syntax online
> - Using examples from reference materials (slides, practice problems, etc.) distributed by your instructor/TA/IA
>
> When in doubt, ask. It is better to ask if something is permitted, rather than doing something that is not permitted and causing issues later.


## Deliverables

- Check-in **submission**: By the check-in deadline posted on Gradescope, submit your progress on the project so far to the designated "Comprehensive Lab 3 CHECK-IN" assignment. To receive full credit, you will need to complete and pass ALL the automated test cases for **"Word Bank"** (`WordBank.java`) and **"Wordle Letter"** (`WordleLetter.java`). Also submit `Tester.java` completed with tests for these parts. If you believe you have completed it but the automated test case does not pass, you must raise the issue with your TA in advance so that you are able to get the test case to pass before the deadline. See the [Gradescope debugging guide](../../../gradescope-debug-guide) for tips.
- Final code submission on Gradescope. You should submit the following files:
	- `WordBank.java`
	- `WordleLetter.java`
	- `WordleGame.java`
	- `Main.java`
	- `Tester.java`
	- Do not submit the `txt` files. They will be automatically discarded and the autograder will use its own for evaluation.

Check-in code submission and the final code submission will be accepted up to three days late (72 hours) and will have scores reduced by 10% for each day (24 hours) of tardiness.

## Objective

Students will demonstrate all skills learned in CS 1.

## Overview

We will be implementing the Wordle game. Before you begin, familiarize yourself with how to play [Wordle](https://www.nytimes.com/games/wordle/index.html).

The starter code contains several Java files you will need to modify, as well as txt files containing data you will need to parse into your program.

<a href="https://github.com/UTEP-CS-1/website/raw/main{{page.url|relative_url}}../clab3_starter.zip" class="btn btn-green">Download starter code</a>

{: .tip }
Throughout this project, you are free to add additional helper methods, constructors, or attributes to help you achieve the requirements. This can be an effective strategy to help you stay organized, to prevent redundant calculations, or to avoid repeating logic. Make sure though, that (1) the required method and constructor signatures are still present and left unchanged, and that (2) your program works as required when these required methods/constructors are invoked. The idea is that the required methods and constructors are known as the interface of your class; these methods and constructors are the ones that other code that uses your class should know about and use. Any additional methods or constructors are the behind-the-scenes inner workings of your class, that may be called by the body of your required ones as part of your implementation, but users typically should not be expected to interact with them. You can make these additional methods and constructors `private` to signify this.

## WordBank

The `WordBank` class will provide utilities that take care of scanning our word lists to provide any necessary information our word-based game will need. In `WordBank.java`, implement the following methods as described below.

{: .important }
Do not change the names or method signatures given by the starter code, as the autograder will not be able to grade your submission. In particular, do not change the file name (`WordBank.java`), the class name (`WordBank`), or the method signatures provided.

{: .important }
Do not hardcode items from the word lists into your code (i.e. do not copy+paste words from the txt files into your Java file). Your code should function properly even if new words are added or words are removed from the txt files.

{: .tip }
Test these functions by calling them with some sample arguments and `System.out.println` the results. We have provided `Tester.java`  with a main method that you can modify to add print statements to test your code. In your terminal, run `javac *.java` to compile all the Java files at once, and then run `java Tester` to execute the program starting from the `main()` method in `Tester.java`.

{: .recall }
> - Scanner file reading from [Lab 3 - word count](../../../labs/3/spec/#word).
> - String equality checking from [CLab 1](../../../clabs/1/spec).

### getAnswerForPuzzleNumber (provided)

{: .note }
This first method is already implemented for you in the starter code. Read this description and the code, as you will need to use it in later parts. You should not modify it.

This method returns the `puzzleNumber`-eth word in the file `answers.txt`.

Examples:

- `WordBank.getAnswerForPuzzleNumber(0)` returns `bused` since that is the 0th word in the file.
- `WordBank.getAnswerForPuzzleNumber(0)` again still returns `bused`.
- `WordBank.getAnswerForPuzzleNumber(1)` returns `plumb` since that is the 1st word in the file (counting the lines using 0-indexing).

It assumes that the input is limited to $$0 \le$$ `puzzleNumber` $$<$$ the number of lines (words) in `answers.txt`.

This method will be used to select the answer word that the player will try to guess. At the start of each game, the player will pick which puzzle number they want to play.

### checkInDictionary

The provided method signature is:

```java
public static boolean checkInDictionary(String proposed) throws FileNotFoundException { ... }
```

Implement the method such that it returns whether `proposed` is one of the words in the file `dictionary.txt`.

Examples:

- `WordBank.checkInDictionary("hello")` returns `true`.
- `WordBank.checkInDictionary("asdfg")` returns `false`.

{: .note }
This method will be used to only allow Wordle guesses that are real words.

{: .tip }
Before moving on, check your implementation using `Tester.java` and then submit to Gradescope and verify that all "0 - Word Bank" test cases pass (on the "Comprehensive Lab 3 CHECK-IN" assignment submission). In your terminal, run `javac *.java` to compile all the Java files at once, and then run `java Tester` to execute the program starting from the `main()` method in `Tester.java`.

## WordleLetter

The `WordleLetter` class will represent a single letter placed on our Wordle game board. Each of up to 6 turns, the player will guess another 5-letter word, and each of these letters will be represented as instances of  `WordleLetter`.

### toString (provided)

The `toString()` method for the `WordleLetter` class is already provided to you in the starter code. **Remove the comment markers to add this code in.** Besides that, do not modify this method. 

This method specifies our intended formatted String representation of our class. Here the provided code's String representation of a `WordleLetter` is the letter, surrounded by a single space before and after it, and with special characters surrounding it that change the color of the letter to be either green, yellow, or red based upon what the `color` attribute value is. By including this method called `toString()` in our class, it allows `WordleLetter` instances to be printed via `System.out.println`:

```java
WordleLetter w = ...;
System.out.println(w);
```

Examples:

![](r.png)

![](o.png)

![](e.png)

### (to implement)

In `WordleLetter.java` make additions so that it has all of the following:

1. Private attributes for a single `letter` represented as a char and a `color` represented as a String.

2. Exactly one constructor, which takes in a `letter` and sets it.

3. A setter for `color` called `setColor`. You may assume that the arguments it will be called with are limited to `"green"`, `"yellow"`, and `"red"`.

4. A method called `isColorSet` that takes no arguments and returns a `boolean` indicating whether the `color` attribute has been set yet.

5. A method called `isGreen` that takes no arguments and returns a `boolean` indicating whether the `color` attribute has been set to `"green"`.

{: .important }
Make sure to follow the above instructions carefully! For any names written in `code font`, you must use the same name (including spelling and capitilization; do not abbreviate or use similar names). The autograder will not be able to grade your submission otherwise.

{: .recall }
> - String equality checking from [CLab 1](../../../clabs/1/spec).
> - Classes, constructors, getters, and setters from [Lab 11](../../../labs/11/spec).

### Tester.java

Check your implementation by adding print statements to test your `WordleLetter` code in `Tester.java`. Clearly label with comments this section of the `Tester.java` file as tests for `WordleLetter`; make sure all methods you wrote are exercised by these tests. These tests will be manually reviewed and graded.

{: .tip }
In your terminal, run `javac *.java` to compile all the Java files at once, and then run `java Tester` to execute the program starting from the `main()` method in `Tester.java`. Once you have tested it throughly locally, submit to Gradescope and verify that all "1 - Wordle Letter" test cases pass (on the "Comprehensive Lab 3 CHECK-IN" assignment submission). If the autograder crashes, it is likely due to the method signatures described above not being defined correctly.

{: .recall }
> - Testing and debugging techniques from [Lab 2](../../../labs/2/spec), [Lab 10 - main method](../../../labs/10/spec/#main-method), [Clab 2](../../../clabs/2/spec).

## WordleGame

The `WordleGame` class will represent a single game. In `WordleGame.java` make additions so that it has all of the following (you will need to add attributes or more methods to help you implement these).

{: .tip }
Consider introducing an attribute that is a 2D array (6 rows, 5 cols) of `WordleLetter`s, to track and represent the guesses made so far in the game.

{: .recall }
> - Classes, constructors, getters, and setters from [Lab 11](../../../labs/11/spec).
> - 2D arrays from [Lab 9](../../../labs/9/spec).
> - Loops from [Lab 3](../../../labs/3/spec), [Lab 4](../../../labs/4/spec), [Lab 5](../../../labs/5/spec).

### Constructor

Exactly one constructor, which takes in an `int puzzleNumber`. This `puzzleNumber` must make the corresponding word provided by `WordBank.getAnswerForPuzzleNumber(puzzleNumber)` the answer of this game that the player must try to guess.

### getAnswer

A getter method called `getAnswer` that takes no arguments and returns the answer String based upon the `puzzleNumber` used to construct this instance. 

### guess

A method called `guess` that takes in a single `String guessWord` representing the guess that the player would like to make and updates the `WordleGame` instance attributes accordingly (nothing will be returned; the return type is `void`).

You may assume that when this method is called, that `guessWord` will be valid. This means that you may assume here that `guessWord` obeys all of the following:

- it is an allowed word in the dictionary
- it is of length 5
- it is all lowercase

The method should create 5 instances of `WordleLetter`, representing each letter in the `guessWord`. It should set the letter and color of each instance. The colors of each letter clue in the player on how close they are to guessing the correct answer.

The color of each letter is determined as follows:

- If a letter in the guess exactly matches a letter in the answer (same letter and correct position), the letter will be marked `"green"`.

- If a letter in the guess almost matches a letter in the answer (same letter, but incorrect position), the letter will be marked `"yellow"`.

- If a letter in the guess doesn’t match a letter in the answer (guessed letter doesn’t exist in answer), the letter will be marked `"red"`. (The real game uses gray, but we will use red for clarity.)

**IMPORTANT:** You may assume that the answer and all guesses made by the player do not contain any duplicate letters!! There is some nuance in letter coloring if duplicate letters are allowed. For example, "algae" would not be a possible answer (assume that puzzle number will not be played) and we can assume that a player will not guess that, because it contains two 'a's.

For example, if the secret answer is "towel" and the user guesses "lower", the color assignments should be:

- l - "yellow" (in the answer but wrong position)
- o - "green" (correct letter and position)
- w - "green" (correct letter and position)
- e - "green" (correct letter and position)
- r - "red" (not in the answer)

You will need to use the `charAt` method of the String class. Here is the [documentation for this method](https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F%2F/java/lang/String.html#charAt(int)). Example of how to use it:

```java
String s = "argon";

System.out.println(s.charAt(0));  // 'a'
System.out.println(s.charAt(1));  // 'r'
System.out.println(s.charAt(2));  // 'g'
System.out.println(s.charAt(3));  // 'o'
System.out.println(s.charAt(4));  // 'n'

char c = s.charAt(0);  // c receives the value 'a'
```

{: .note }
**Extra credit:** For 5 points of extra credit, disregard the above simplifying assumption that duplicate letters can be disallowed in both the answer and in guesses. Read [this blog article](https://nerdschalk.com/wordle-same-letter-twice-rules-explained-how-does-it-work/) explaining the details of how duplicate letters should be handled. Incorporate these additional requirements into your `guess` method implementation.

### getNumberGuessesSoFar

A getter method called `getNumberGuessesSoFar` that takes no arguments and returns an `int` indicating how many guesses have been made in the game so far.

Examples:

- When the game has just started and no guesses have been made, `getNumberGuessesSoFar()` should return `0`.
- After the first guess has been made, `getNumberGuessesSoFar()` should return `1`.

### getGuess

A getter method called `getGuess` that takes a single `int guessNumber` argument and returns an ARRAY of the 5 `WordleLetter`s that represent the spelled out word that was made in the specified `guessNumber`. The `guessNumber` should count starting from `0`.

Examples:

- After the first guess has been made, `guessNumber(0)` should return the `WordleLetters` spelling out that first word guessed.
- After the second guess has been made, `guessNumber(1)` should return the `WordleLetters` spelling out that second word guessed.
- After the last (sixth) guess has been made, `guessNumber(5)` should return the `WordleLetters` spelling out that last word guessed.

### isGameOver

A method called `isGameOver` that takes no arguments and returns a `boolean` indicating whether the game has ended.

The game is over if **at least one** of these conditions is met:

- the player has successfully guessed the correct answer OR
- 6 guesses have already been made and the player did not win

### isGameWin

A method called `isGameWin` that takes no arguments and returns a `boolean` indicating whether the player has won the game.

The player has won the game if the latest guess was the answer word. If the game is not over yet (or has not started yet), return `false`.

{: .note }
If the player has guessed the correct word, it must be the latest guess. It cannot be the case that the correct word was guessed but there were more guesses that were wrong, because the game should have ended immediately after the correct answer was successfully guessed.

### toString (provided)

The `toString()` method for the `WordleGame` class is also already provided to you in the starter code. **Remove the comment markers to add this code in.** Besides that, do not modify this method.

Note that there are two `toString` methods provided to you: this `toString` method in the `WordleGame` class and the `toString` in the `WordleLetter` class.

This `toString` method in the `WordleGame` class provides the String representation of the current game board state. This will be each guess made so far, each on a new line. Read the code and the comments to understand how it works.

By including this method called `toString()` in our class, it allows `WordleGame` instances to be printed via `System.out.println`:

```java
WordleGame g = ...;
System.out.println(g);
```

Example output:

![](toString.png)


### Tester.java

Check your implementation by adding print statements to test your `WordleGame` code in `Tester.java`. Clearly label with comments this section of the `Tester.java` file as tests for `WordleGame`; make sure all methods you wrote are exercised by these tests. These tests will be manually reviewed and graded.

{: .tip }
In your terminal, run `javac *.java` to compile all the Java files at once, and then run `java Tester` to execute the program starting from the `main()` method in `Tester.java`. Once you have tested it throughly locally, submit to Gradescope and verify that all "2 - Wordle Game" (and "4 - Extra credit", if applicable) test cases pass (on the "Comprehensive Lab 3" assignment submission). If the autograder crashes, it is likely due to the method signatures described above not being defined correctly.

{: .recall }
> - Testing and debugging techniques from [Lab 2](../../../labs/2/spec), [Lab 10 - main method](../../../labs/10/spec/#main-method), [Clab 2](../../../clabs/2/spec).

## Main

`Main.java` serves as the entry-point into our code and facilitates user interaction with the game. The `main()` method is completed already and should not be modified. Implement the remaining methods as described below.

{: .important }
Prompt for user input only when directed, no more, no less! If your code requests the wrong number of user inputs, the autograder will not expect that.

{: .important }
Do not instantiate any more scanners via `new Scanner(System.in)`. Use the single scanner that has already been created and is available through the method argument.

{: .tip}
In your terminal, run `javac *.java` to compile all the Java files at once, and then run `java Main` to execute the program starting from the `main()` method in `Main.java`.

{: .recall }
> - Static methods from [Lab 7](../../../labs/7/spec).
> - Scanner user input from [Lab 1](../../../labs/1/spec).

### startGame

Implement this method provided in the starter code.

```java
public static WordleGame startGame(Scanner scanner) throws FileNotFoundException { ... }
```

This method should:

1. Prompt the user to enter an integer for which puzzle number they would like to play (between 0 and 2315).

2. Instantiate a new `WordleGame` instance using this integer user input  as the puzzle number.

3. Return the newly created `WordleGame` instance.

### playGame

Implement this method provided in the starter code.

```java
public static void playGame(Scanner scanner, WordleGame game) throws FileNotFoundException { ... }
```

While the game is not over, the method for each of the player's turns should:

1. Prompt the user to enter a 5 letter guess (String).

2. If the guess is not in the dictionary according to `WordBank.checkInDictionary`, go back to step 1 and prompt the user again.

3. Once we have a valid guess, make this guess on the game.

4. Print out the game state as provided by the `WordleGame`'s `toString` method.

### reportGameOutcome

Implement this method provided in the starter code.

```java
public static void reportGameOutcome(WordleGame game) { ... }
```

Assume that this method will be called only after the game is over.

The method should:

- Print exactly the phrase `"You won!"` if the game was won.
- Print exactly the phrase `"The answer was "` followed by the answer if the game was not won.

### Tester.java

Check your implementation by adding print statements to test your `Main` code in `Tester.java`. Clearly label with comments this section of the `Tester.java` file as tests for `Main`; make sure all methods you wrote are exercised by these tests. These tests will be manually reviewed and graded.

{: .tip }
In your terminal, run `javac *.java` to compile all the Java files at once, and then run `java Tester` to execute the program starting from the `main()` method in `Tester.java`. Once you have tested it throughly locally, submit to Gradescope and verify that all "3 - Main" test cases pass (on the "Comprehensive Lab 3 CHECK-IN" assignment submission). If the autograder crashes, it is likely due to the method signatures described above not being defined correctly.

{: .recall }
> - Testing and debugging techniques from [Lab 2](../../../labs/2/spec), [Lab 10 - main method](../../../labs/10/spec/#main-method), [Clab 2](../../../clabs/2/spec).

## FAQ

This section will be updated with answers to Frequently Asked Questions as they arise.

- If the autograder results are not showing up or as you expect, please reach out to your lab TA or visit office hours in advance of the deadline. Getting the autograder working for your code is an important step as it offers a lot of guidance to help you with the project requirements. Also see the debugging guide: https://utepcs1.org/gradescope-debug-guide/

- In WordleLetter, the letter attribute should be a character type, not a String.

- Methods that involve file reading need to announce the possibility of a FileNotFoundException, which can happen if the file path specified does not exist. If you see an error that says `error: unreported exception FileNotFoundException; must be caught or declared to be thrown`, that means that method involves a file reading operation or calls upon another method that does. Add `throws FileNotFoundException` to the end of the method signature to fix this. See the examples in WordBank. Don't forget to import it if needed.

- If you see a NullPointerException from calling WordleLetter methods (such as an autograder result), this means that the code is attempting to call a method on null, which is not allowed since non-static methods must be called on an object instance. Notably, this can happen with `color.equals(...)` if `color` is null when the method is called. Add code to either prevent this expression from being called in the null case, or rewrite the expression such that the String to the left of the `.equals` is guaranteed not to be null.
