---
layout: page
title: Lab 3
nav_exclude: true
search_exclude: true
---

# Lab 3: `for` loops
{:.no_toc}

Today our time will be for `for` loops.

Learning objectives:
- Students will understand and practice for loops.
- Use the `Scanner` to read input.

## Table of contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## Before you begin

Download the starter code zip file, unzip it / extract all, and place the contents in `cs1` under a new `lab3` directory. Open it in Sublime.

<a href="https://github.com/UTEP-CS-1/website/raw/main{{page.url|relative_url}}../lab3_starter.zip" class="btn btn-green">Download starter code</a>


Your submission will be scored based upon:
- The code compiles and runs.
- Correctly following the instructions and completing the code accordingly.
- Variables should be given descriptive names. Variable names should be written in camel case (all letters lowercase except the first letter of each word besides the first word), whichIsLikeThis.

## Word.

{: .note }
You may only use `for` loops in your solution, not loops of any other kind.

Create a program that can count the number of words in a specified file, using the starter code in `WordCount.java`. Here, a word is defined as characters delimited (separated) by whitespace characters.

To take in input to be processed, you will need to use the `Scanner`, which you've caught glimpses of in labs 1 and 2. Look back at the usages of `scanner.nextBoolean()` and `scanner.nextInt()`, for example. They evaluate to a boolean value and an int value, respectively. In this exercise, you will use a similar approach but to get the next word from the input as a String, by using `scanner.next()`.

Invoking one of the above if there were no next boolean, int, or word String will result in an error, as you may have seen when you previously entered an invalid response when prompted in the terminal. For `scanner.next()` which reads in the next String, it is not a matter of the input being the wrong type (since any characters can be represented in a String), but rather a matter of running out of words. If you knew how many words there would be, you could make sure to call it just the right amount of times to prevent running out of words and causing an error. However we do not have that information available, as that is in fact our goal here, to count the number of words in the input. Therefore, to check if there is another word remaining, use `scanner.hasNext()` which evalutes to a boolean value (either `true` or `false`).

Once completed, test your answer using `poem.txt`. It should contain 13 words.

{: .note }
Try using your word counter out in the wild! The [Project Gutenberg website](https://www.gutenberg.org/browse/scores/top) contains the full text of many classic books available in the public domain. Pick one, download the "Plain Text" format, then try feeding that into your program!

## Not your average joe!

Create a program that repeatedly accepts another numerical value and prints out the updated running average, using the starter code in `RunningAverage.java`.

Recall that to compute the average, take the sum of all the values and divide by how many values there are:
$$ \frac{\texttt{input}_1 + \texttt{input}_2 + \cdots + \texttt{input}_{N}}{N}$$

To add another number into the running average, add it to the numerator and update the denominator to be one greater than before:
$$ \frac{\texttt{input}_1 + \texttt{input}_2 + \cdots + \texttt{input}_{N} + \texttt{input}_{N+1}}{N+1}$$

The program should repeat the following infinitely:

1. Ask for input from the terminal using `scanner.nextDouble()`. Refer to the code from lab 1 or 2 for a reminder of how to do that.
2. Print out the running average.

{: .tip }
When running the program in the terminal, press `Ctrl + c` to kill the remainder of the program if you wish to exit back to the terminal prompt.

Here is an example of the completed functionality:
```
Enter another number to add to the running average: 1
Running average is: 1.0
Enter another number to add to the running average: 2
Running average is: 1.5
Enter another number to add to the running average: 2.3
Running average is: 1.7666666666666666
Enter another number to add to the running average: 
```

## Submit

Turn in your completed worksheet to your TA before the end of your lab session.

Upload your code file to the Lab 3 assignment on Gradescope.

- `WordCount.java`
- `RunningAverage.java`

The autograder will run some simple checks to guide you towards the right track. However, these preliminary checks may not be comprehensive; making all the test cases turn green does not imply that your code is 100% correct. You may resubmit as many times as you like prior to the deadline posted on Gradescope to improve your submission. After the deadline, your active submission will be further graded by a course staff member and/or additional autograder test cases.

## Grading criteria

| **Criteria**                             |   **Pts** |
|:-----------------------------------------|----------:|
| Worksheet                                |        40 |
| Coding exercise correctness              |        55 |
| Coding exercise code style and formatting|         5 |
| **_Total_**                              | **_100_** |

The deadline is as posted on Gradescope.
Assignments will be accepted up to three days late (72 hours) and will have scores reduced by 10% for each day (24 hours) of tardiness.