---
layout: page
title: Lab 1
nav_exclude: true
search_exclude: true
---

# Lab 1: Variables and data types
{:.no_toc}

Welcome back! Today you will make your first code changes!
Today's lab will feel a little like you're playing [Mad Libs](https://en.wikipedia.org/wiki/Mad_Libs),
but instead of filling in blanks for different categories of words,
we will complete the code to practice using different data types for variables.

Learning objectives:
- Understand variables and data types, and how to use them in practice.
- Basic arithmetic.
- Use input from Scanner (when code is provided).
- Propositional (boolean) logic.

## Table of contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## Before you begin

Download the starter code zip file, unzip it, and place the contents in `cs1` under a new `lab1` directory. Open it in Sublime.

<!-- <a href="https://github.com/UTEP-CS-1/website/raw/main{{page.url|relative_url}}../lab01_starter.zip" class="btn btn-green">Download starter code</a> -->


Your submission will be scored based upon:
- The code compiles and runs.
- Correctly following the instructions and completing the code accordingly.
- Variables should be given descriptive names. Variable names should be written in camel case (all letters lowercase except the first letter of each word besides the first word), whichIsLikeThis.

{: .tip }
In your terminal, use `javac MusicReview.java` to ensure your code compiles. Then run your code using `java MusicReview` to ensure the output matches what is required.

## Example: hello world 2.0

```java
//----------
// Example
//----------
String myName = "Paydirt Pete";  // TODO: Change to your own name.
System.out.println("Hi, my name is " + myName + ".");
```

Observe that:
- A string variable is initialized to be `"Paydirt Pete"`.
- It is given a descriptive name called `myName` since it represents the name of the author of the printed text. This variable name is written in camel case.
- The variable's value is concatenated with some hard-coded strings and printed out.

Change the code so that the variable is initialized to your own name.

Compile and run the program and you should see this line in the output:
```text
Hi, my name is Paydirt Pete.
```
(except with your name.)

{: .tip }
The program may appear to hang after printing "Is the next concert expensive? (type true or false):". It is awaiting input that will be used in Q3. For now, press `Ctrl + c` to kill the remainder of the program.

## Q1: Your turn with string variables

Following the example, initialize two more string variables with values of your choice.
- The first should represent the name of a song.
- The second should represent the name of the artist who wrote that song.

Replace the two `"FIXME"` in the print statement to use the two variables.

Compile and run the program and you should see this line in the output:
```text
I love listening to 7 rings by Ariana Grande.
```
(except with your chosen song and artist.)

## Q2: Variable variable types

Initialize 4 more variables with values of your choice. However, there are some additional restrictions for the purposes of this exercise:
1. The String variable type may NOT be used in this question.
2. Each of the 4 variables must be a UNIQUE type (i.e. each variable type may only be used once).

The 4 variables should represent, respectively:
1. The year that the song was released.
2. The number of times the song has been played, according to Spotify.
3. A hypothetical cost of a vinyl copy, which must cost a few dollars and a non-zero amount of cents.
4. Your overall tier rating for the artist's songs in general. A tier rating is one of the following: `S`, `A`, `B`, `C`, `D`, or `F`.

Add a comment above each of the 4 lines where you initialized a variable, briefly justifying why you chose that variable type.
Comments are denoted by starting a line with `//`.

Replace the `"FIXME"` in the print statements to use the variables.

Compile and run the program and you should see these lines in the output:
```text
The song was released in year 2019.
On Spotify, the song has been played 2060555864 times.
A vinyl copy might sell for $9.99!
Overall, this artist's songs should be considered S tier.
```
(except with your chosen values.)

## Q3: To go or not to go...that is the boolean expression

Several lines of code are provided. It creates a `Scanner` that will be able to collect
user input from the terminal through `System.in` (i.e. system input). Three times, it prints
a prompt and then collects the `nextBoolean()` by waiting for the user to type either `true` or `false` and hitting Enter.
A boolean variable is initialized to save the user's entered value.

```java
// This is provided code for receiving input from the command line.
System.out.println("\nThree questions to determine if I will go to the next concert...");
Scanner scanner = new Scanner(System.in);
// Program will print each prompt and await either true or false to be entered by the user.
System.out.print("Is the next concert expensive? (type true or false): ");
boolean isExpensive = scanner.nextBoolean();

System.out.print("Will the concert be worth it? (type true or false): ");
boolean worthIt = scanner.nextBoolean();

System.out.print("Are my friends going to the concert? (type true or false): ");
boolean areFriendsGoing = scanner.nextBoolean();
// boolean variables isExpensive, worthIt, and areFriendsGoing 
// are now initialized with values entered by the user from the command line.
```

Your task is to initialize the boolean variable `willAttendConcertResult`
to be the result of a boolean expression made up of the three boolean variables.
Write the boolean expression according to the following logic:
- I will attend the concert only if (1) it makes sense financially AND (2) my friends are going too.
- Regarding (1), it makes sense financially if at least one of the following are satisfied:
    - The concert is NOT expensive (`isExpensive` is `false`).
    - The concert is worth it (`worthIt` is `true`).
- Regarding (2), my friends are going when `areFriendsGoing` is `true`.

For example, when all three input variables are `true`, the result should be `true` because it is worth it and my friends are going.
```text
Three questions to determine if I will go to the next concert...
Is the next concert expensive? (type true or false): true
Will the concert be worth it? (type true or false): true
Are my friends going to the concert? (type true or false): true
Will I go to the next concert? The answer is true.
```

{: .tip }
> There are 8 possible combinations of inputs. Check your work by creating a table in which you determine the expected result for each set of inputs, then testing your program to ensure that the outputs are correct.

> | isExpensive   | worthIt     | areFriendsGoing     | willAttendConcertResult     |
|:---------------:|:-----------:|:-------------------:|:---------------------------:|
| T               | T           | T                   | T                           |
| ...             | ...         | ...                 | ...                         |

## Q4: One final touch

Reassign the value of the song play count variable you initialized in Q2 to be 1 higher than it was before.
Write this line of code such that if next week you went back to update the original initialization value of the variable in Q2, no change would be necessary on this line for it to still correctly increment that revised initialization value by 1.
Do not initialize a new variable; update the pre-existing variable.

Replace the `"FIXME"` in the print statements to use the variable.

```text
On Spotify, the song has been played 2060555864 times.
...
Oops, I just played the song again! Make that 2060555865 times.
```

## Submit to Gradescope

Upload your submission to the Lab 1 assignment on Gradescope. The autograder will run some simple checks to guide you towards the right track. However, these preliminary checks are not comprehensive; making all the test cases turn green does not imply that your code is 100% correct. You may resubmit as many times as you like prior to the deadline posted on Gradescope to improve your submission. After the deadline, your active submission will be further graded by a course staff member and/or additional autograder test cases.

## Grading criteria

| **Criteria**                            |   **Pts** |
|:----------------------------------------|----------:|
| Released autograder tests               |        40 |
| Q1 code correctness (additional review) |         5 |
| Q2                                      |        20 |
| Q3                                      |        15 |
| Q4                                      |         5 |
| Code style and formatting               |        15 |
| **_Total_**                             | **_100_** |

The deadline is as posted on Gradescope.
Assignments will be accepted up to three days late (72 hours) and will have scores reduced by 10% for each day (24 hours) of tardiness.
