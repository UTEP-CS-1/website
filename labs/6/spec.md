---
layout: page
title: Lab 6
nav_exclude: true
search_exclude: true
---

# Lab 6: Methods
{:.no_toc}

Now that you're here, let's work with Java methods!

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

<a href="https://github.com/UTEP-CS-1/website/raw/main{{page.url|relative_url}}../lab5_starter.zip" class="btn btn-green">Download starter code</a>

In this lab, we will be creating a calculator!

Your submission will be scored based upon:
- The code compiles and runs.
- Correctly following the instructions and completing the code accordingly.
- Variables should be given descriptive names. Variable names should be written in camel case (all letters lowercase except the first letter of each word besides the first word), whichIsLikeThis.
- Comments are used to label sections and keep your code organized.
- Operations are computed correctly.

{: .warning }
The following are not allowed:
> - Other Java libraries aside from Scanner, Files and FileExceptions.
> - The use of Java lists, arrays, linked-lists and other data structures.
> - Use of generative AI (i.e., ChatGPT).
> - Posting any assignment (or any of its parts) online in any form.
> - Any type of plagiarism. 

## Calculator 

For this lab you won't be reading user input to do arithmetic operations, instead you will read from the file `operations.txt` to retrieve what operations your calculator will be doing.

For this, you will **create a method for each of the arithmetic operators you see in `operations.txt`**.

`operations.txt` is set up such that each line contains an arithmetic operation of **integers**. The arithmetic operator is the last element of each line.

Some examples lines of the file are:

```
4 9 *
```

This represents `4 * 9` and thus your multiplication method should print `36`.

```
5 !
```

This represents `5!` and thus your multiplication method should print `120`.

Notice that the there is a single space in between each of the elements within a row. Also, there might be operations where a single integer is being computed so don't assume that your calculator will only compute operations with two integers.


## Grading criteria

| **Criteria**                             |   **Pts** |
|:-----------------------------------------|----------:|
| Coding exercise correctness              |        85 |
| Coding exercise code style and formatting|        15 |
| **_Total_**                              | **_100_** |

The deadline is as posted on Gradescope.
Assignments will be accepted up to three days late (72 hours) and will have scores reduced by 10% for each day (24 hours) of tardiness.