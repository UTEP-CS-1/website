---
layout: page
title: Extra Credit Lab
nav_exclude: true
search_exclude: true
---

# Extra Credit Lab: CineMejia
{:.no_toc}

## Table of contents
{: .no_toc .text-delta }

- TOC
{:toc}

{: .important }
Before you get started, read this entire document. If anything is unclear, do not
hesitate to come to your instructor, TAs, IAs, and Googlers for help or clarification. We will be happy to help
you. The office hours schedule is posted on the lab website and Blackboard.

{: .warning }
> Generative AI use is prohibited. Plagiarism detection analysis will be performed on all submissions. Please review the course syllabus for the full standards of conduct. Below is an exerpt on the definition of collaboration.
>
> The following are not allowed:
> - Posting any assignment (or any of its parts) online in any form
> - Sharing assignments outside of the course (i.e., to other students)
> - Copy/pasting any code from anywhere other than from Instructor/TA/IA. This includes copy/pasting code snippets (or entire assignments) from online resources such as, but not limited to: stackoverflow.com, Chegg, Course Hero, ChatGPT/Bard.
> - Sharing your code with other students.
> - Reading code from other students.
> - Look at another student’s code
> - Debug another student’s code
>
> The following are allowed:
> - Communicating with the instructors/TAs/IAs/Googlers
> - Searching for basic syntax online
> - Using examples from reference materials (slides, practice problems, etc.) distributed by your instructor/TA/IA
> When in doubt, ask. It is better to ask if something is permitted, rather than doing something that is not permitted and causing issues later.


## Deliverables

- Final code submission on Gradescope. You should submit the following files:
	- `Movie.java`
	- `FileReader.java`
	- `Main.java`
	- Do not submit the `csv` file.


## Objective

You will implement a movie ticket purchasing system that uses conditionals, iterations, file reading, methods, and objects.

## Overview

Your program will allow a user to purchase tickets for movies. For each movie, the user will be able to view the name of the movie, the genre, as well as the number of available seats. Additionally, users will be able to prepurchase concession items online using the ticketing system.

{: .tip }
Throughout this project, you are free to add additional helper methods, constructors, or attributes to help you achieve the requirements. This can be an effective strategy to help you stay organized, to prevent redundant calculations, or to avoid repeating logic. Make sure though, that (1) the required method and constructor signatures are still present and left unchanged, and that (2) your program works as required when these required methods/constructors are invoked. The idea is that the required methods and constructors are known as the interface of your class; these methods and constructors are the ones that other code that uses your class should know about and use. Any additional methods or constructors are the behind-the-scenes inner workings of your class, that may be called by the body of your required ones as part of your implementation, but users typically should not be expected to interact with them. You can make these additional methods and constructors `private` to signify this.


Download the starter code zip file, unzip it / extract all, and place the contents in the `cs1` directory under a new `ec` folder. Open it in Sublime.

<a href="https://github.com/UTEP-CS-1/website/raw/main{{page.url|relative_url}}../ecLab_starter.zip" class="btn btn-green">Download starter code</a>


## Movie.java

The Movie class has the following private attributes:
- movieName
- genre
- numTicketsAvailable
- ticketPrice
- popcornPrice
- sodaPrice
- candyPrice


The Movie class should also have the following methods:
- Setters and Getters for each attribute

- Default constructor and other constructors you believe you need

- ticketsAreAvailable:
    o This method takes in the number of tickets the user requested to purchase
    o This method should return true if there are enough tickets available for purchase at this movie, and false otherwise.
    
- purchaseTickets:
    o This method should take in the number of tickets that will be purchased.
    o This method should adjust the number of tickets available after purchase. 
        ▪ For example, if there are 40 tickets available and the user purchases 5 tickets, there should be 35 tickets available. The user should not be allowed to purchase more tickets than there are available.
    o This method should return the amount spent. Otherwise, return 0.0.
        ▪ For example, if I buy 5 tickets at $20.0 each, the method should return 100.0.
        
- printMovieDetails:
    o This method should print the main attributes of a movie (movieName, genre, ticketPrice, and numTicketsAvailable) in a nicely formatted way.

- printConcessionDetails:
    o This method should print the remaining attributes of a movie (popcornPrice, sodaPrice, and candyPrice) in a nicely formatted way


## FileReader.java

The FileReader class should have the following attribute: 
- String filename

The FileReader class should have the following constructors:
- Default Constructor
- Constructor that takes in fileName

The FileReader class should also have the following methods:

- public Setter and Getter for the file name attribtue
    
- countNumMovies:
    o This method should return the number of movies in the file. (In other words it should count the number of rows in the provided file. Do not count the column name row in the csv.)
    
- readMovies:
    o readMovies should read the file given to the class by filename and then it should return an array of type Movie that holds all movies from the file.
    ▪ HINT: The size of your array should be the output you get from countNumMovies 


## Main

Your program should do the following:

1. Initialize an array of Movie objects by reading a csv file. This file is provided as movie-info.csv
2. The program will display a menu with 3 options to the users
    a. View Movies
        i. This menu option will print all movie attributes, excluding concessions information
    b. View Concessions
        i. This menu option will print all movie names and concessions information
    c. Purchase tickets and concessions
        i. This menu option will allow users to select a movie and then purchase tickets for that movie
            If the user attempts to buy more tickets than are available at the movie it will print an error message and ask them to try again
        ii. CineMejia also allows users to reserve concession items before the movie starts. Once the system knows the ticket purchase is valid, it will then ask the user if they would like to buy concessions
            If the user selects yes, it will prompt them with another menu that shows the price of the concessions and the associated item. This menu will loop until the user tells the system they no longer want any concession items
            If the user enters an incorrect name, the system will ask them to enter it again
        iii. Once the user is done selecting concession items, the system will ask the user to enter a credit card
            If the user enters an invalid credit card number, then the program will also print an error message and ask the user to try again
            If the user enters a valid credit card number, it will take them back to the starting menu

- public static void main(String[] args)
    o Your main method.
    
- isCreditCardNumberValid:
    o This method takes a String as a credit card number and it will return true if the credit card number is valid (is 16 digits long and contains only numbers) and false otherwise o 
    ▪ HINT: Use the built in Character.isDigit() method when determining if a credit card number is valid. Feel free to research this built-in method 
        
- viewAllMovieNames:
    o This method will take an array of movies as a parameter and will iterate through each movie and print all of their info using the printMovieDetails() method in the Movie class.


- viewAllConcessions:
    o This method will take an array of movies as a parameter and will iterate through each movie and print all of the info of their concessions using the printConcessionDetails() method in the Movie class.


