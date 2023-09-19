---
layout: page
title: Lab 4
nav_exclude: true
search_exclude: true
---

# Lab 4: while loops
{:.no_toc}

While you're here today, let's talk about `while` loops.

Learning objectives:
- Students will understand and practice `while` loops.
- Converting between `for` and `while` loops.
- Use the `Scanner` to read input.

## Table of contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## Before you begin

Download the starter code zip file, unzip it / extract all, and place the contents in `cs1` under a new `lab4` directory. Open it in Sublime.

<a href="https://github.com/UTEP-CS-1/website/raw/main{{page.url|relative_url}}../lab4_starter.zip" class="btn btn-green">Download starter code</a>


Your submission will be scored based upon:
- The code compiles and runs.
- Correctly following the instructions and completing the code accordingly.
- Variables should be given descriptive names. Variable names should be written in camel case (all letters lowercase except the first letter of each word besides the first word), whichIsLikeThis.

## Not your average joe!

{: .note }
This is the same question as in Lab 3, except requiring the use of a `while` loop instead of a `for` loop. Feel free to use your previous code as a starting point. Make sure to keep separate copies and properly submit the correct version of the code to each corresponding lab assignment on Gradescope.

{: .note }
You must use a `while` loop in your solution, and no loops of any other kind.

Create a program called `Average.java` that computes the average of the first `N` positive integers, based upon the input `N`.

This would be the result of adding up the all the postive integers up to and including `N`, and then dividing that total by the number of items `N`.

$$ \frac{1 + 2 + \cdots + N}{N}$$

For example, for the input `N = 5`, the calculation would be:

$$ \frac{1 + 2 + 3 + 4 + 5}{5} = \frac{15}{5} = 3$$

Here is an example of the completed functionality:
```
Find the average of the first N positive integers, where N is: 5
Result is: 3.0
```

## Word.

{: .note }
This is the same question as in Lab 3, except requiring the use of a `while` loop instead of a `for` loop. Feel free to use your previous code as a starting point. Make sure to keep separate copies and properly submit the correct version of the code to each corresponding lab assignment on Gradescope.

{: .note }
You must use a `while` loop in your solution, and no loops of any other kind.

Create a program that can count the number of words in a specified file, using the starter code in `WordCount.java`. Here, a word is defined as characters delimited (separated) by whitespace characters.

To take in input to be processed, you will need to use the `Scanner`, which you've caught glimpses of in labs 1 and 2. Look back at the usages of `scanner.nextBoolean()` and `scanner.nextInt()`, for example. They evaluate to a boolean value and an int value, respectively. In this exercise, you will use a similar approach but to get the next word from the input as a String, by using `scanner.next()`.

Invoking one of the above if there were no next boolean, int, or word String will result in an error, as you may have seen when you previously entered an invalid response when prompted in the terminal. For `scanner.next()` which reads in the next String, it is not a matter of the input being the wrong type (since any characters can be represented in a String), but rather a matter of running out of words. If you knew how many words there would be, you could make sure to call it just the right amount of times to prevent running out of words and causing an error. However we do not have that information available, as that is in fact our goal here, to count the number of words in the input. Therefore, to check if there is another word remaining, use `scanner.hasNext()` which evalutes to a boolean value (either `true` or `false`).

Once completed, test your answer using `poem.txt`. It contains 13 words:

	Balloons dance in sky,
	I give my dog a cookie,
	We walk together.

Here is an example of the completed functionality:
```
Enter the name of the file to read: poem.txt
13 words
```

The output must be of the format "# words" as shown above.

{: .note }
Try using your word counter out in the wild! The [Project Gutenberg website](https://www.gutenberg.org/browse/scores/top) contains the full text of many classic books available in the public domain. Pick one, download the "Plain Text" format, then try feeding that into your program!

## Reflection

Open `reflection.txt`, which is a file you can type a plain-text answer. Briefly write your answer to these questions in the file:

1. For the Average question, which of your implementations (from lab 3 or lab 4) do you prefer? Justify your answer using advantages and/or disadvantages to using a `for` loops vs a `while` loop in this context.

2. How about for the Word Count question? State your preference and justify your answer in the same way.

## Collatz sequence

We define the Collatz sequence for any positive integer `x` to be the following:
- The first element in the sequence is `x`
- The second element in the sequence is:
	- $x/2$ if `x` is even.
	- $3x+1$ if `x` is odd.
- The third element in the sequence follows the same formula, but using the value of the second element instead of the value of the first element.
- And so on, each time applying the formula on the previous element to generate the next element after it.

So, the Collatz sequence for 3 would be 3, 10, 5, 16, 8, 4, 2, 1, 4, 2, 1, ...

Notice that the sequence eventually loops forever at 4, 2, 1. The (unproven) Collatz conjecture
asserts that the Collatz sequence will eventually converge to 1 for all positive integers.
To date this has been shown to be true for all integers up to 295,147,905,179,352,825,856.

Add your implementation to `Collatz.java` to do the following:

1. Accept user input from the terminal for the value of `x`, the starting element of the Collatz sequence to compute.
2. Print out each element of the Collatz sequence from `x` to the first occurence of the element `1`.
3. Print out the number of steps (or elements) in the Collatz sequence between (and including) `x` to the first occurence of the element `1`.

Example:

```
Enter the start of the Collatz sequence x (positive int): 3
3
10
5
16
8
4
2
1

Number of steps: 8
```

## Submit

Turn in your completed worksheet to your TA before the end of your lab session.

Upload these files to the Lab 4 assignment on Gradescope.

- `Average.java`
- `WordCount.java`
- `reflection.txt`
- `Collatz.java`

The autograder will run some simple checks to guide you towards the right track. However, these preliminary checks may not be comprehensive; making all the test cases turn green does not imply that your code is 100% correct. You may resubmit as many times as you like prior to the deadline posted on Gradescope to improve your submission. After the deadline, your active submission will be further graded by a course staff member and/or additional autograder test cases.

## Grading criteria

| **Criteria**                             |   **Pts** |
|:-----------------------------------------|----------:|
| Worksheet                                |        40 |
| Coding exercise correctness              |        50 |
| Coding exercise code style and formatting|        10 |
| **_Total_**                              | **_100_** |

The deadline is as posted on Gradescope.
Assignments will be accepted up to three days late (72 hours) and will have scores reduced by 10% for each day (24 hours) of tardiness.