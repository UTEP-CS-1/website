---
layout: page
title: Lab 3
nav_exclude: true
search_exclude: true
---

# Lab 3: for loops
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

## Not your average joe!

{: .note }
You may only use `for` loops in your solution, not loops of any other kind.

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

## Submit

Turn in your completed worksheet to your TA before the end of your lab session.

Upload your code file to the Lab 3 assignment on Gradescope.

- `WordCount.java`
- `Average.java`

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