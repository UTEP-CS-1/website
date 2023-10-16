---
layout: page
title: Lab 8
nav_exclude: true
search_exclude: true
---

# Lab 8: Arrays
{:.no_toc}

Today we will be practicing arrays!

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

1. TOC
{:toc}

## Before you begin

Download the starter code zip file, unzip it / extract all, and place the contents in cs1 under a new lab8 directory. Open it in Sublime.

<a href="https://github.com/UTEP-CS-1/website/raw/main{{page.url|relative_url}}../lab8_starter.zip" class="btn btn-green">Download starter code</a>


Your submission will be scored based upon:
- The code compiles and runs.
- Correctly following the instructions and completing the code accordingly.
- Variables should be given descriptive names. Variable names should be written in camel case (all letters lowercase except the first letter of each word besides the first word), whichIsLikeThis.
- Comments are used to label sections and keep your code organized.
- Operations are computed correctly.

{: .warning }
> The following are not allowed:
> - Other Java libraries aside from Scanner, Files and FileExceptions.
> - The use of Java lists, linked-lists and other data structures other than arrays.
> - Use of generative AI (i.e., ChatGPT).
> - Posting any assignment (or any of its parts) online in any form.
> - Any type of plagiarism. 

## Array Practice

Your started code will already have every method signature needed. This is what you are expected to do with each:

- **main**:
1. Initialize an integer array called **intArray**that contains the values: -3, 72, 39, -94, 5
2. Initialize a char array called **charArray** that contains the values: e,v,i,l,x,s,t,o,p,s,x,d,e,s,s,e,r,t,s
3. Initialize a double array called **doubleArray** that contains the values: 100.50, 200.25, 333.33, 400.11, 200.37
4. Print the results of Method #1 in the following format: Char array: (your output)
5. Print the results of Method #2 in the following format: Reversed char array: (your output) *HINT* Method #2 will return an array, therefore to print its contents you can utilize a method you have already created.
6. Print the results of Method #3 in the following format: Sum of Double array: (your output)
7. Print the results of Method #4 using find = "min" in the following format: Minimum value in intArray: (your output)
8. Print the results of Method #4 using find = "max" in the following format: Maximum value in intArray: (your output)


- **printCharArray**: takes in a **char[]** array called array. The purpose of this method is to: 
1. Modify the array to replace any char 'x' with char '_' and,
2. Print all the contents of the given array.

	For example:
    If given the array char[] example = {'h', 'i', 'x', 'q'}
	`printCharArray(example)` will modify the array to have the contents:
     {'h', 'i', '_', 'q'}.
     and will print each element.

- **reverseCharArray**: takes in a **char[]** array and will return a new char[] array containing the original array in reverse order.
    For example:
    If given the array char[] example = {'h', 'o', 'l', 'a'}
	`reverseCharArray(example)` will modify the array to have the contents:
     {'a', 'l', 'o', 'h'}.
     
- **sumDoubleArray**: takes in a **double[]** array and returns the sum of all the elements in the array.

- **findMinMax**: takes in an **integer** array and a String called find that will determine if we want to find the minimum or maximum value found in the given array. This method will return the minimum or maximum integer in the array.

    *HINT* First check if find is equal to "min" or "max" and then perform the needed operations.


Example expected output:
```
Char array: evil_stops_desserts
Reversed char array: stressed_spots_live
Sum of Double array: 1234.56
Minimum value in intArray: -94
Maximum value in intArray: 72
```

## Grading criteria

| **Criteria**                             |   **Pts** |
|:-----------------------------------------|----------:|
| Coding exercise correctness              |        85 |
| Coding exercise code style and formatting|        15 |
| **_Total_**                              | **_100_** |

The deadline is as posted on Gradescope.
Assignments will be accepted up to three days late (72 hours) and will have scores reduced by 10% for each day (24 hours) of tardiness.