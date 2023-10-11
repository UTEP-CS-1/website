---
layout: page
title: Lab 7
nav_exclude: true
search_exclude: true
---

# Lab 7: Methods
{:.no_toc}

Today we will methodically practice methods!

Learning objectives:
- Students will understand and practice methods.
- Create method calls.
- Practice more with file reading in Java.
- Strengthen their skills on loops.

{: .important }
Before you get started, read this entire document. If anything is unclear, do not
hesitate to come to your instructor, TAs, IAs, and Googlers for help or clarification. We will be happy to help
you. The office hours schedule is posted on the lab website and Blackboard.

## Table of contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## Before you begin

Download the starter code zip file, unzip it / extract all, and place the contents in cs1 under a new lab6 directory. Open it in Sublime.

<a href="https://github.com/UTEP-CS-1/website/raw/main{{page.url|relative_url}}../lab7_starter.zip" class="btn btn-green">Download starter code</a>

In this lab, we will be creating a calculator!

Your submission will be scored based upon:
- The code compiles and runs.
- Correctly following the instructions and completing the code accordingly.
- Variables should be given descriptive names. Variable names should be written in camel case (all letters lowercase except the first letter of each word besides the first word), whichIsLikeThis.
- Comments are used to label sections and keep your code organized.
- Operations are computed correctly.

{: .warning }
> The following are not allowed:
> - Other Java libraries aside from Scanner, Files and FileExceptions.
> - The use of Java lists, arrays, linked-lists and other data structures.
> - Use of generative AI (i.e., ChatGPT).
> - Posting any assignment (or any of its parts) online in any form.
> - Any type of plagiarism. 

## Calculator 

For this lab you won't be reading user input to do arithmetic operations, instead you will read from the file `operations.txt` to retrieve what operations your calculator will be doing.

For this, you will create a method for each of the following arithmetic operations (make sure to name your methods exactly as specified below! Otherwise the autograder will fail and you will lose points!):

- **calculate**: takes in two **integer** values and a **String** operation symbol. The purpose of this method is to determine which operation should take place. It returns the result of that operation.

	For example:
	`calculate(1,2,"+")` means that an addition should be performed, so this method will call `add(1,2)` and return the result.

	Similarly, `calculate(2,3,"*")` means that a multiplication should be performed, so calculate will call `multiply(3,2)` and return the result.

- **add**: takes in two **integer** values and returns the sum.

- **subtract**: takes in two **integer** values and returns the difference.

- **multiply**: takes in two **integer** values and returns the product.

- **divide**: takes in two **integer** values and returns the quotient. This division will be an integer division, no need to worry about decimals!

- **power**: takes in two **integer** values and returns the results of the first integer value to the power of the second integer value. 

	Ex:
	`power(3,2)` means 3^2, and should return 9

- **factorial**: takes in **one integer** value and returns the factorial of this integer. A factorial of an integer is the product of that integer and all the integers below it, up to 1. 

	Ex:
	`factorial(5)` means 5! which is 5 * 4 * 3 * 2 * 1, and should return 120

File reading should be performed in the main method. Here you will read the file, passing in the values of each line to the calculate method as specified above. **You should then print the value returned by calculate.**

`operations.txt` is set up such that each line contains an arithmetic operation of **integers**. The arithmetic operator is the last element of each line.

Some examples lines of the file are:

```
4 9 *
```

This represents `4 * 9` and thus your multiplication method should print `36`.

Factorials are a special case. Each row will contain two numbers.
Only the first number should be passed into your factorial method, the second number should be ignored!

```
5 0 !
```

This represents `5!` and thus your multiplication method should print `120`. Notice how the `0` should be ignored!

Notice that the there is a single space in between each of the elements within a row. Also, there might be operations where a single integer is being computed so don't assume that your calculator will only compute operations with two integers.

Here is an example run of what your output should look like given the following file:
```
1 2 +
3 2 *
4 2 ^
5 0 !
```
Example expected output:
```
3
6
16
120
```

## Grading criteria

| **Criteria**                             |   **Pts** |
|:-----------------------------------------|----------:|
| Coding exercise correctness              |        85 |
| Coding exercise code style and formatting|        15 |
| **_Total_**                              | **_100_** |

The deadline is as posted on Gradescope.
Assignments will be accepted up to three days late (72 hours) and will have scores reduced by 10% for each day (24 hours) of tardiness.
