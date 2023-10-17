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

## Exercises

Consider the example 2D array:

{
    {15, 83, 52, 36, 44},
    {99, 32, 78, 64, 9},
    {45, 58, 12, 67, 38},
    {3, 96, 89, 71, 27},
    {24, 7, 91, 0, 5}
}

## 1) rowSum

- Input: a `int[][]` 2D array
- Output: a **new** `int[]` array containing the sum of numbers in each row of the 2D array.

Expected Output:

{230, 282, 220, 286, 127}

### 2) columnSum

- Input: a `int[][]` 2D array
- Output: a **new** `int[]` array containing the sum of numbers in each column of the 2D array.

Expected output:

{186, 276, 322, 238, 123}

### 3) diagonalSums

- Input: a `int[][]` 2D array
- Output: a **new** `int[]` array containing the sums of the main and secondary diagonals of the 2D array.

Expected output:

{161, 270}


### 4) traverseBackwards

- Input: a `int[][]` 2D array 
- Output: a **new** `int[][]` 2D array that is a mirror image of the original. Rows and the elements within rows should both be in reverse order.

Expected output:

{
    {5, 0, 91, 7, 24},
    {27, 71, 89, 96, 3},
    {38, 67, 12, 58, 45},
    {9, 64, 78, 32, 99},
    {44, 36, 52, 83, 15}
}


## Grading criteria

| **Criteria**                             |   **Pts** |
|:-----------------------------------------|----------:|
| Coding exercise correctness              |        85 |
| Coding exercise code style and formatting|        15 |
| **_Total_**                              | **_100_** |





