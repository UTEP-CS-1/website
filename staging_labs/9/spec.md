---
layout: page
title: Lab 9
nav_exclude: true
search_exclude: true
---

# Lab 9: 2D Arrays
{:.no_toc}

In this lab, you'll dive deep into two-dimensional arrays in Java!

Learning objectives:
- Understand and apply the concepts of 2D arrays.
- Declare, initialize, and traverse 2D arrays.
- Access and modify elements of a 2D array.
- Develop methods that manipulate 2D arrays.

{: .important }
Before you dive in, ensure you read this entire document carefully. If any instructions or requirements are unclear, promptly seek assistance from your instructor, TAs, IAs, or Googlers. The office hours schedule is posted on the lab website and Blackboard.

## Table of contents
{: .no_toc .text-delta }

- TOC
{:toc}

## Before you begin

Download the starter code zip file, unzip it / extract all, and place the contents in the `cs1` directory under a new `lab9` folder. Open it in Sublime.

<a href="https://github.com/UTEP-CS-1/website/raw/main{{page.url|relative_url}}../lab9_starter.zip" class="btn btn-green">Download starter code</a>

Your starter code will have the method signatures already defined. Each section below describes the requirements for each method.

Your submission will be graded based on:
- Whether the code compiles and runs.
- Adherence to the instructions and correct completion of the tasks.
- Use of descriptive variable names written in camel case.
- Clear organization and use of comments.

{: .warning }
> The following are not allowed:
> - Java libraries, except those specifically mentioned.
> - Java data structures apart from arrays.
> - Use of generative AI (e.g., ChatGPT).
> - Posting the assignment or parts of it online.
> - Any form of plagiarism.

Before you start, remember not to hard code your answers! Another array will be used when grading your assignment so your solutions should work with any array.

## Exercises

Consider the example 2D array (This is given to you in the starter code):
<pre>
{
    {15, 83, 52, 36, 44},
    {99, 32, 78, 64, 9},
    {45, 58, 12, 67, 38},
    {3, 96, 89, 71, 27},
    {24, 7, 91, 0, 5}
}
</pre>
### 1) print1dArray

For this method, you'll print a 1D array in a single line. Each element should be separated by a tab. You will use this method to print the 
results of your answers in other methods.

- Input: a 1D array (int[]).
- Action: Display each element of the array separated by a tab.

For instance, if the input array is {15, 83, 52, 36, 44}, the output on the console should look like:
<pre>
15	83	52	36	44
</pre>

### 2) print2dArray

Your task here is to print the entire 2D array such that it appears in a matrix-like format. Each element should be separated by a tab, and each row should start on a new line. This will provide a clear visual representation of your 2D array.

- Input: a 2D array (int[][]).
- Action: Display each row of the array on a new line with its elements separated by a tab.

For the example 2D array that was given should print out:
<pre>
15	83	52	36	44
99	32	78	64	9
45	58	12	67	38
3	96	89	71	27
24	7	91	0	5
</pre>

### 3) rowSum

Compute the sum of elements in each row. Your method should return a 1D array where each element represents the sum of a particular row from the input 2D array.

- Input: a 2D array (`int[][]`).
- Output: a **new** 1D array (`int[]`) where each value is the total sum of the corresponding row in the 2D array.

For instance, if the first row has `{15, 83, 52, 36, 44}`, its sum is `230`. Therefore, the first value in the returned array should be `230`.

### 4) columnSum

This time, compute the sum of elements in each column. Return a 1D array where each element denotes the sum of a specific column from the input 2D array.

- Input: a 2D array (`int[][]`).
- Output: a **new** 1D array (`int[]`) where each value is the total sum of the corresponding column in the 2D array.

For example, for the first column `{15, 99, 45, 3, 24}`, the sum is `186`. Thus, the first value in the returned array should be `186`.

### 5) diagonalSums

For a square 2D array, there are two main diagonals. Calculate the sum for each diagonal and return the results in a 1D array. The first element should represent the sum of the main diagonal (top-left to bottom-right), and the second element should represent the sum of the secondary diagonal (top-right to bottom-left).

- Input: a 2D array (`int[][]`).
- Output: a **new** 1D array (`int[]`) with just two values. The first is the sum of the main diagonal (top-left to bottom-right) and the second is the sum of the secondary diagonal (top-right to bottom-left).

The main diagonal is {15, 32, 12, 71, 5} with a sum of 135. The secondary diagonal is {44, 64, 12, 96, 24} with a sum of 240. Therefore, the returned array should be {135, 240}.

### 6) traverseBackwards

Create a new 2D array that represents the original array but in reverse order. Both the rows and the elements within those rows should be in reverse order.

- Input: a 2D array (`int[][]`).
- Output: a **new** 2D array where both the rows and the values within each row are in reverse order compared to the original.

## Grading criteria

| **Criteria**                             |   **Pts** |
|:-----------------------------------------|----------:|
| Correctness of the coding exercises      |        85 |
| Coding style and use of comments         |        15 |
| **_Total_**                              | **_100_** |

The deadline is as posted on Gradescope. Assignments will be accepted up to three days late (72 hours) and will have scores reduced by 10% for each day (24 hours) of tardiness.

