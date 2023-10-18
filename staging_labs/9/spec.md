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

{
    {15, 83, 52, 36, 44},
    {99, 32, 78, 64, 9},
    {45, 58, 12, 67, 38},
    {3, 96, 89, 71, 27},
    {24, 7, 91, 0, 5}
}

### 1) rowSum

Think of this method as adding up the values in a scorecard. Every row is a player/team and every column is an event.
This method will go through each row and add up all the elements as it traverses. When it's at the end of the row, add the sum
to an array. This array should be created at the beginning of the method.

- Input: a 2D array (`int[][]`).
- Output: a **new** 1D array (`int[]`) where each value is the total sum of the corresponding row in the 2D array.

For instance, if the first row has `{15, 83, 52, 36, 44}`, its sum is `230`. Therefore, the first value in the returned array should be `230`.

### 2) columnSum

Imagine dripping paint from the top of each column in the grid to the bottom. This method calculates how much paint is in each column.

- Input: a 2D array (`int[][]`).
- Output: a **new** 1D array (`int[]`) where each value is the total sum of the corresponding column in the 2D array.

For example, for the first column `{15, 99, 45, 3, 24}`, the sum is `186`. Thus, the first value in the returned array should be `186`.

### 3) diagonalSums

In this method, think about drawing two lines on your grid. One line goes from the top-left to the bottom-right, and the other from the top-right to the bottom-left. 

- Input: a 2D array (`int[][]`).
- Output: a **new** 1D array (`int[]`) with just two values. The first is the sum of the main diagonal (top-left to bottom-right) and the second is the sum of the secondary diagonal (top-right to bottom-left).

The main diagonal is {15, 32, 12, 71, 5} with a sum of 135. The secondary diagonal is {44, 64, 12, 96, 24} with a sum of 240. Therefore, the returned array should be {135, 240}.

### 4) traverseBackwards

Imagine you took a photo of your grid and then flipped it horizontally and vertically. This method should return your 2D array looking like that flipped photo.

- Input: a 2D array (`int[][]`).
- Output: a **new** 2D array where both the rows and the values within each row are in reverse order compared to the original.

## Grading criteria

| **Criteria**                             |   **Pts** |
|:-----------------------------------------|----------:|
| Correctness of the coding exercises      |        85 |
| Coding style and use of comments         |        15 |
| **_Total_**                              | **_100_** |

The deadline is as posted on Gradescope. Assignments will be accepted up to three days late (72 hours) and will have scores reduced by 10% for each day (24 hours) of tardiness.

