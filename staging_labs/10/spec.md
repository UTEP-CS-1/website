---
layout: page
title: Lab 10
nav_exclude: true
search_exclude: true
---

# Lab 10: Recursion
{:.no_toc}

Today's topic is recursion cursion ursion rsion ...

Learning objectives:
- Students will understand recursive methods with respect to repetition
- Students will practice using recursion and loops in class

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

<a href="https://github.com/UTEP-CS-1/website/raw/main{{page.url|relative_url}}../lab10_starter.zip" class="btn btn-green">Download starter code</a>

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

## Overview

Today we will be revisiting the implementations of some of the Calculator methods you implemented in lab 8. You will be asked to implement them using iteration and again using recursion.

The Scanner portions are not necessary to be replicated in this lab. You are free to format your `main` method however you like. You are recommended to call upon each method with various inputs in the `main` method to check their correctness.

{: .tip }
Don't forget to check base cases for correctness as well!

We have already covered factorial in lecture and the worksheet. We will now re-implement some of the other operations.

## 1) power

- Input: two ints `x` and `y`
- Output: $$x^y$$
- You may assume that:
	- `y` is non-negative (it can be 0 or positive).
	- `x` and `y` will be small, so as not to expect an answer that causes `int` overflow.

{: .tip }
$$x^y$$ is equivalent to $$x*x*...*x$$ done $$y$$ times.

{: .tip }
> For the recursive solution, let's break down an example. Can you draw a recursive tree to represent these equivalent breakdowns of a power?
>
> $$\begin{align*}2^4 &= 2 * 2^3 &= 2 * 2 * 2^2 &= 2 * 2 * 2 * 2^1 &= 2 * 2 * 2 * 2 * 2^0 &= 2 * 2 * 2 * 2 * 1 \end{align*}$$

In `powerLoop`, implement this using any kind of loop (recursion may not be used).
In `powerRecursive`, implement this using recursion (loops may not be used).

{: .note }
You must use multiplication to solve this. You may not use `Math.pow` or similar pre-existing solutions. If you have already solved this using iteration/loops in lab 8, you may re-use your own solution here for that part.

## 2) multiply

- Input: two ints `x` and `y`
- Output: $$x*y$$
- You may assume that:
	- Both `x` and `y` are non-negative (they can be 0 or positive).
	- `x` and `y` will be not be too large, so as not to expect an answer that causes `int` overflow.

**You may NOT use multiplication `*` or division `/` operators to solve this.**

{: .tip }
$$x*y$$ is equivalent to $$x+x+...+x$$ done $$y$$ times.

In `multiplyLoop`, implement this using any kind of loop (recursion may not be used).
In `multiplyRecursive`, implement this using recursion (loops may not be used).

{: .note }
**Challenge:** (not required, but not for extra credit either) adapt your implementation to remove the assumption that `x` and `y` must be non-negative (`x` and `y` may be negative).

## 3) divide

- Input: two ints `x` and `y`
- Output: $$x/y$$ (the result of integer division)
- You may assume that:
	- `x` is non-negative (it can be 0 or positive).
	- `y` is positive (it will not be negative and it will not be 0).

**You may NOT use multiplication `*` or division `/` operators to solve this.**

{: .tip }
$$x/y$$ is equivalent to the number of times $$y$$ can be taken away from $$x$$.

In `divideLoop`, implement this using any kind of loop (recursion may not be used).
In `divideRecursive`, implement this using recursion (loops may not be used).

{: .note }
**Challenge:** (not required, but not for extra credit either) adapt your implementation to remove the assumption that `x` and `y` must be non-negative (`x` and `y` may be negative). You can still assume that `y` will not be 0.


## Grading criteria

| **Criteria**                             |   **Pts** |
|:-----------------------------------------|----------:|
| Coding exercise correctness              |        84 |
| Coding exercise code style and formatting|        16 |
| **_Total_**                              | **_100_** |

The deadline is as posted on Gradescope.
Assignments will be accepted up to three days late (72 hours) and will have scores reduced by 10% for each day (24 hours) of tardiness.

Points awarded by the autograder will be reversed during manual review if the stated restrictions for a question were not followed.