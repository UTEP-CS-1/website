---
layout: page
title: Lab 11
nav_exclude: true
search_exclude: true
---

# Lab 11: Classes and Objects - The Car Class
{:.no_toc}

In this lab, you'll delve into the world of classes and objects in Java, using a `Car` class as your primary example.

Learning objectives:
- Understand and apply the concepts of classes and objects in Java.
- Define attributes and methods in a class.
- Create objects using constructors and setters.
- Implement user input to dynamically create objects.

{: .important }
Before you begin, make sure to read this entire document thoroughly. If any instructions or requirements are unclear, promptly seek assistance from your instructor, TAs, IAs, or Googlers. The office hours schedule is posted on the lab website and Blackboard.

## Table of contents
{: .no_toc .text-delta }

- TOC
{:toc}

## Before you begin

In this lab, you will be implementing everything from scratch. There is no starter code provided. Create a new Java project in your IDE (such as Eclipse or IntelliJ) and create a new Java class named `Car`. All the exercises will build upon this class. Make sure to create a separate `Main` class for testing your `Car` class.

Ensure that your working directory is organized and that your Java files are correctly named and saved in the appropriate project folder.

## Exercises

### 1) Completing the Car Class
Complete the `Car` class by adding the following:
- Private attributes: `make`, `model`, `year`, `color`, `isElectric`, `cost`.
- A default constructor that initializes all attributes to default values.
- A constructor that accepts `make`, `model`, and `year`.
- Public getter methods for each attribute.
- Public setter methods for each attribute.

### 2) Display Method
Implement a `displayInfo` method in the `Car` class that prints all the car's details in a readable format.

### 3) Creating Cars Using Constructors
In your `Main` class:
- Create at least two `Car` objects using different constructors.
- Display their information using the `displayInfo` method.

### 4) Modifying Car Attributes
For one of the `Car` objects you created:
- Use the private setter methods to change at least two attributes.
- Display the updated information.

### 5) User-Input Car Creation
Implement a method in the `Car` class that:
- Asks the user to input car details.
- Creates a `Car` object using this input.
- Displays the new car's information.

Your submission will be graded based on:
- Whether the code compiles and runs.
- Adherence to the instructions and correct completion of the tasks.
- Use of descriptive variable names and adherence to Java naming conventions.
- Clear organization and use of comments.

{: .warning }
> The following are not allowed:
> - Java libraries, except the standard ones.
> - External Java frameworks or libraries.
> - Use of generative AI (e.g., ChatGPT).

## Grading criteria

| **Criteria**                             |   **Pts** |
|:-----------------------------------------|----------:|
| Correctness of the coding exercises      |        85 |
| Coding style and use of comments         |        15 |
| **_Total_**                              | **_100_** |

The deadline is as posted on Gradescope. Assignments will be accepted up to three days late (72 hours) and will have scores reduced by 10% for each day (24 hours) of tardiness.

