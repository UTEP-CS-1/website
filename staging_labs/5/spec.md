---
layout: page
title: Lab 5
nav_exclude: true
search_exclude: true
---

# Lab 5: More conditionals and loops
{:.no_toc}

Its been awhile since we started! If you're ready, its time for some more practice!

Learning objectives:
- Conditionals, for loops, while loops.
- Nested loops.
- Use the `Scanner` to read input.

## Table of contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## Before you begin

Download the starter code zip file, unzip it / extract all, and place the contents in `cs1` under a new `lab5` directory. Open it in Sublime.

<a href="https://github.com/UTEP-CS-1/website/raw/main{{page.url|relative_url}}../lab5_starter.zip" class="btn btn-green">Download starter code</a>


Your submission will be scored based upon:
- The code compiles and runs.
- Correctly following the instructions and completing the code accordingly.
- Variables should be given descriptive names. Variable names should be written in camel case (all letters lowercase except the first letter of each word besides the first word), whichIsLikeThis.

## Prime Factorize

In `PrimeFactorize.java`, implement a program that takes a positive integer as user input from the terminal and prints out the prime factorization of this number.

A prime number is a number that is not divisible by any other number besides 1 and itself (2, 3, 5, 7, ...).

The prime factorization of a number is writing it as the product of only prime numbers.

For example, the prime factorization of $$126$$ is $$2*3*3*7$$ because all of those factors are prime, and their product is $$126$$.

Expected program usage:
```
Enter a positive integer to find its prime factorization: 126
2
3
3
7
```

{: .tip }
First try solving the simpler problem of checking whether a number is prime or not.
If you're stuck with that, refer to section 5.14 in the lecture textbook.

## Explore El Paso

The I-10 highway stretches west to east across El Paso, and the exits are numbered according to the mile markers.
It starts with New Mexico to the west at exit 0, cuts through El Paso with UTEP at exit 18, and goes to Socorro to the east at exit 35.

As a spontaneous traveler, I'd like to explore El Paso by starting at mile 18 (UTEP) of the I-10 highway. Every hour, I will choose to drive 1 mile on the highway either west or east. The direction of this step taken every hour will be decided randomly. My journey is completed when I ventured out of El Paso, arriving at either exit 0 or exit 35.

In `ExploreElPaso.java`, create a program that will simulate this travel plan and repeat this simulation according to the number of trials inputted by the user on the terminal. The starting point, and west/east boundaries should also be configurable by the user input via the terminal. It should report the results of all those simulations, namely the number of steps taken on the average journey, the fraction of trials in which the journey was completed by ending up on the west boundary, and the same of the east boundary.

Expected program usage:
```
Enter start (int): 18
Enter west end (int): 0
Enter east end (int): 35
Enter number of trials (positive int): 100000

Average steps: 305.7249800000103
Average chance of exiting west: 0.4839200000003432
Average chance of exiting east: 0.5160799999996568
```

## Submit

Turn in your completed worksheet to your TA before the end of your lab session.

Upload these files to the Lab 5 assignment on Gradescope.

- `PrimeFactorize.java`
- `ExploreElPaso.java`

The autograder will run some simple checks to guide you towards the right track. However, these preliminary checks may not be comprehensive; making all the test cases turn green does not imply that your code is 100% correct. You may resubmit as many times as you like prior to the deadline posted on Gradescope to improve your submission. After the deadline, your active submission will be further graded by a course staff member and/or additional autograder test cases.

## Grading criteria

| **Criteria**                             |   **Pts** |
|:-----------------------------------------|----------:|
| Worksheet                                |        20 |
| Coding exercise correctness              |        70 |
| Coding exercise code style and formatting|        10 |
| **_Total_**                              | **_100_** |

The deadline is as posted on Gradescope.
Assignments will be accepted up to three days late (72 hours) and will have scores reduced by 10% for each day (24 hours) of tardiness.