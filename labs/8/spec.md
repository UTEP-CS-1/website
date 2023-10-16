---
layout: page
title: Lab 8
nav_exclude: true
search_exclude: true
---

# Lab 8: Arrays
{:.no_toc}

Today we will be raising our attention on arrays!

Learning objectives:
- Students will understand and practice arrays.
- Declare and initialize arrays.
- Traverse/Iterate through arrays.
- Access elements of an array.
- Modify Arrays.
- Strengthen their skills on methods and loops.

{: .important }
Before you get started, read this entire document. If anything is unclear, do not
hesitate to come to your instructor, TAs, IAs, and Googlers for help or clarification. We will be happy to help
you. The office hours schedule is posted on the lab website and Blackboard.

## Table of contents
{: .no_toc .text-delta }

- TOC
{:toc}

## Before you begin

Download the starter code zip file, unzip it / extract all, and place the contents in cs1 under a new lab8 directory. Open it in Sublime.

<a href="https://github.com/UTEP-CS-1/website/raw/main{{page.url|relative_url}}../lab8_starter.zip" class="btn btn-green">Download starter code</a>

Your starter code will already have every method signature needed. Each section below will describe the requirements for each method.


Your submission will be scored based upon:
- The code compiles and runs.
- Correctly following the instructions and completing the code accordingly.
- Variables should be given descriptive names. Variable names should be written in camel case (all letters lowercase except the first letter of each word besides the first word), whichIsLikeThis.
- Comments are used to label sections and keep your code organized.

{: .warning }
> The following are not allowed:
> - Other Java libraries aside from Scanner, Files and FileExceptions.
> - The use of Java lists, linked-lists and other data structures other than arrays.
> - Use of generative AI (i.e., ChatGPT).
> - Posting any assignment (or any of its parts) online in any form.
> - Any type of plagiarism. 

## 1) printCharArray

- Input: a `char[]` array to be modified and printed.
- Output: `void`

The purpose of this method is to: 
1. Modify the array to replace any `'x'` chars with `'_'` chars.
2. Print all the contents of the modified array.

For example, if the letters of `evilxstopsxdesserts` were spelled out as individual letters (characters) and put into a character array, the printed output when iterating over the modified array should be the characters in `evil_stops_desserts`.

In your `main` method, initialize this character array and call upon `printCharArray` to test your implementation by verifying the printed output is as expected.


## 2) reverseCharArray

- Input: a `char[]` array
- Output: a **new** `char[]` array containing the original array but in reverse order

For example, with the modified char array after the previous example with the letters of `evil_stops_desserts`, the returned array when iterating over the modified array should be the characters in `stressed_spots_live`.

In your `main` method, pass in the character array after it was modified by `printCharArray` and call upon `reverseCharArray` to test your implementation by verifying the printed output is as expected. You can call `printCharArray` again to print the contents to the screen.
     

## 3) sumDoubleArray

- Input: a `double[]` array
- Output: the sum of all the elements in the array, as a `double`.

Example:
$$100.50, 200.25, 333.33, 400.11, 200.37 \implies 1234.56$$

In your `main` method, create this double array and call upon `sumDoubleArray` to test your implementation by verifying the returned value is as expected.


## 4) findMinMax

- Input: a `int[]` array to search and a `String` that you can assume will either take on the value `"min"` or `"max"` only.
- Output: the minimum or maximum value found in the given array, depending on which is specified by the String parameter, as an `int`.

{: .hint }
First check if find is equal to `"min"` or `"max"` and then perform the needed operations.

Example for input array containing `-3, 72, 39, -94, 5`:
- If `"min"`: -94
- If `"max"`: 72

In your `main` method, create this int array and call upon `findMinMax` each way to test your implementation by verifying the returned values are as expected.


## Grading criteria

| **Criteria**                             |   **Pts** |
|:-----------------------------------------|----------:|
| Coding exercise correctness              |        85 |
| Coding exercise code style and formatting|        15 |
| **_Total_**                              | **_100_** |

The deadline is as posted on Gradescope.
Assignments will be accepted up to three days late (72 hours) and will have scores reduced by 10% for each day (24 hours) of tardiness.