---
layout: page
title: Lab 9
nav_exclude: true
search_exclude: true
---

# Lab 9: 2D Arrays
{:.no_toc}

In this lab, you'll get hands-on experience with two-dimensional arrays in Java!

Learning objectives:
- Understand and apply the concepts of 2D arrays.
- Declare, initialize, and traverse 2D arrays.
- Access and modify elements of a 2D array.
- Develop methods that manipulate 2D arrays.

{: .important }
Before you begin, read this entire document carefully. If any instructions or requirements are unclear, ask your instructor, TAs, IAs, or Googlers for assistance. The office hours schedule is posted on the lab website and Blackboard.

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

## 1) rowSum

- Input: a `int[][]` 2D array
- Output: a **new** `int[]` array containing the sum of numbers in each row of the 2D array.

For instance, given the 2D array:

