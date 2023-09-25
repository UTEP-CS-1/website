---
layout: page
title: Lab 5
nav_exclude: true
search_exclude: true
---

# Lab 5: Nested loops
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


In this lab, first we will be completing a worksheet in class. Afterwards, for the coding portion, we will be printing out patterns of star characters similar to the front page of the worksheet. 

The exercises here build up to the last exercise (Black diamond), which is to create the following star pattern:

```
   *
  ***
 *****
*******
 *****
  ***
   *
```

Shown above is a size 4 pattern, because from the center to a corner, there are 4 stars. The solutions in these exercises should generate patterns of the size specified by the user via console Scanner input.

The exercises break down this problem into smaller subproblems that are more approachable to begin with, which is a good problem solving strategy in general. Specifically, the first exercise (Green) will deal with the top right quadrant of the diamond, and the second exercise (Blue) will deal with the top left quadrant.

Your submission will be scored based upon:
- The code compiles and runs.
- Correctly following the instructions and completing the code accordingly.
- Variables should be given descriptive names. Variable names should be written in camel case (all letters lowercase except the first letter of each word besides the first word), whichIsLikeThis.
- Comments are used to label sections and keep your code organized.

## Green

Green will be the top right quadrant, not including the center column. Shown below is this quadrant in size 4:
```

*
**
***
```

Notice that the first line is empty, and that a triangle with sides of length 3 is created.

In `Green.java`, ask the user for the size through the console input using the Scanner. Then generate this pattern such that it is the specified size.

Make sure to add comments to label sections and keep your code organized.

{: .tip }
You will need to use both `System.out.println()` as well as `System.out.print()`. The difference is that the former prints the content and then moves to the next line, while the latter prints the content but remains on the next line so that the next print statement continues on that same line.

## Blue

Blue will be the top left quadrant, including the center column. Shown below is this quadrant in size 4:
```
   *
  **
 ***
****
```

Notice that in order to right align the stars, space characters are printed in the row before it.

In `Blue.java`, ask the user for the size through the console input using the Scanner. Then generate this pattern such that it is the specified size.

Make sure to add comments to label sections and keep your code organized.

## Black diamond

Now we will create the full diamond. Shown below is the pattern in size 4:
```
   *
  ***
 *****
*******
 *****
  ***
   *
```

The top half will be very similar to the previous two exercises. The quadrants in the bottom half will need to be solved in a similar manner (but note that the largest middle row is not repeated).

In `BlackDiamond.java`, ask the user for the size through the console input using the Scanner. Then generate this pattern such that it is the specified size.

Make sure to add comments to label sections and keep your code organized.

## Grading criteria

| **Criteria**                             |   **Pts** |
|:-----------------------------------------|----------:|
| Worksheet                                |        20 |
| Coding exercise correctness              |        70 |
| Coding exercise code style and formatting|        10 |
| **_Total_**                              | **_100_** |

The deadline is as posted on Gradescope.
Assignments will be accepted up to three days late (72 hours) and will have scores reduced by 10% for each day (24 hours) of tardiness.