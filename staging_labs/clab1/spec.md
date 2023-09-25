---
layout: page
title: Comprehensive Lab 1
nav_exclude: true
search_exclude: true
---

# Comprehensive Lab 1: UtepTube
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
>	- Posting any assignment (or any of its parts) online in any form
>	- Sharing assignments outside of the course (i.e., to other students)
>	- Copy/pasting any code from anywhere other than from Instructor/TA/IA. This includes copy/pasting code snippets (or entire assignments) from online resources such as, but not limited to: stackoverflow.com, Chegg, Course Hero, ChatGPT/Bard.
>	- Sharing your code with other students.
>	- Reading code from other students.
>	- Look at another student’s code
>	- Debug another student’s code
>
> The following are allowed:
>	- Communicating with the instructors/TAs/IAs/Googlers
>	- Searching for basic syntax online
>	- Using examples from reference materials (slides, practice problems, etc.) distributed by your instructor/TA/IA
>
> When in doubt, ask. It is better to ask if something is permitted, rather than doing something that is not permitted and causing issues later.


## Deliverables

{: .important }
TODO add due date or date range and policy on missing meetings

- Check-in meeting: you will be emailed an assigned appointment time in which you will review the check-in milestone materials (described in separate section below) with a TA, IA, or Googler.
- Final demo meeting: similarly, you will be emailed an assigned appointment time in which you will demonstrate the full functionality of your completed project to a TA, IA, or Googler, and answer questions about the code.
- Code submission on Gradescope.

Code submission will be accepted up to three days late (72 hours) and will have scores reduced by 10% for each day (24 hours) of tardiness.

## Objective

Students will be able to use their problem solving skills by implementing variable
declaration, conditional statements, loops, file reading, and user input.

## Overview

You are the computer scientist responsible for implementing the playlist feature on UtepTube, a popular ad-supported video streaming platform. In short, users will be able to add videos to a playlist from those listed in the corpus, customize their ads experience, and view or clear the playlist.

{: .important }
> Here are some guidelines that apply to the entire project.
>
> On user input:
> - You may prompt for user input only when described in the spec. Do not add additional prompts for user input.
> - When the user inputs a value listed or described in the spec, it must perform the described action.
> - When the user inputs a value not listed or described in the spec, the behavior is undefined. That means in that scenario, your program can react however you wish. It means that state of the program is out of scope for our requirements and will not be tested; it is acceptable for the program to crash with an error.
>
> On the verbage of text printed to the console:
> - Unless otherwise stated, you may customize the words displayed to your liking.
> - When stated, the required lines of text must be printed EXACTLY, including all spacing and other details (puncutation, capitilization, etc.). This is required for the autograder to detect the current state of your program.


## Main menu

Your program will begin with a welcome message that will include all 5 options
the user can take. Entering the integers `1`, `2`, `3`, `4`, or `5` must result in the actions described in the corresponding section below in the spec.

Entering any other integer must result in the main menu being displayed again and the user prompted again for one of these 5 options.

For example:

```
Welcome to UtepTube! Please select an option below to continue:
	1. List videos in corpus
	2. Add video to playlist
	3. View playlist
	4. Clear playlist
	5. Close UtepTube
> 
```

## 1. List videos in corpus

If the user selects this option, you will display the list of available videos in the corpus to the
user onto the terminal.

To do this, you need to read the file `corpus.csv` and display each line of it.

{: .important }
The output must match the following format *EXACTLY*, including the dividers and spacing.

```
+--------------------------------------------------------------------------------------------------+
|                                         UtepTube corpus                                          |
+-------------+---------------------------------------------------+---------------------+----------+
| VIDEO ID    | VIDEO TITLE                                       |             CREATOR |  MIN:SEC |
+-------------+---------------------------------------------------+---------------------+----------+
| 5Fg9oZk-5uA | I Bought Everything In 5 Stores                   |             MrBeast |    14:14 |
+-------------+---------------------------------------------------+---------------------+----------+
| oNCs4C2SMjo | Apple Watch Series 9 & Ultra 2: What Are We Wa... |    Marques Brownlee |    10:29 |
+-------------+---------------------------------------------------+---------------------+----------+
| XKu_SEDAykw | How to: Work at Google — Example Coding/Engine... |      Life at Google |    24:02 |
+-------------+---------------------------------------------------+---------------------+----------+
| ZAfAud_M_mg | Halsey - Without Me                               |              Halsey |     3:57 |
+-------------+---------------------------------------------------+---------------------+----------+
| GnJAqV3VMUE | LA MORNING ROUTINE LOL                            |    emma chamberlain |    25:09 |
+-------------+---------------------------------------------------+---------------------+----------+
```

{: .note }
> If the video entries in `corpus.csv` were to change, your code should still be able to use it. However, you may assume that:
> - The header and columns will not change.
> - Video ids will always be 11 characters long.
> - Video titles will always be <50 characters long.
> - Creator names will always be <20 characters long.
> - A single video's duration will always be <1 hour long.
> - Commas will never be used except for the purpose of separating columns.

## 2. Add video to playlist

Prompt the user to enter a video ID to add the video to the playlist.

If the video ID is not found in the corpus (must match EXACTLY, capitilization matters), display a message informing the user and return to the main menu.

Otherwise, print out the video title and creator name by themselves on their own line. You may print out other text on other lines if you like. For example, if the user entered `GnJAqV3VMUE`:
```
Excellent choice!
LA MORNING ROUTINE LOL
emma chamberlain
```

Upon selecting a video, we will also determine the ads to be shown. We have three different kinds of ads, each of which may either be shown or not shown for the video:

	- **Pre-roll ads**: This would be a 30 sec long ad to be shown before the video plays. This ad will only be shown on a video if it is marked `true` for "pre-roll ad" in `corpus.csv`.

	- **Mid-roll ads**: This would be either a 2 min long ad, or a 10 sec ad if the user decides to skip after 10 sec. This ad will only be shown on a video if it is marked `true` for "mid-roll ad" in `corpus.csv`. If and only if a mid-roll ad is to be shown, prompt the user asking if they would like to skip the ad after 10 seconds.
		- If the user enters `true`, they will have the 10 second mid-roll ad. 
		- If the user enters `false`, they will have the 2 minute mid-roll ad. 
		- If the user enters an invalid boolean, then prompt them again.

	- **Post-roll ads**: This would be a 5 sec long ad to be shown after the video plays. This ad will only be shown on a video if it is marked `true` for "post-roll ad" in `corpus.csv`.

Finally return back to the main menu.

{: .tip }
In this step, you will accumulate the play time of each video and the selected ads into a variable. This is also where you will update your playlist by updating your playlist value that will store all the videos the user has selected and other video metadata to be shown under the "View playlist" option.

{: .note }
A user may add the same video to the playlist multiple times. Each instance can have its own configuration of ads to be shown.

## 3. View playlist

If the playlist is empty, then output the following EXACTLY:

```
------------- YOUR PLAYLIST ------------
Total play time: 0:00:00
```

If there are videos in the playlist, output them following this format EXACTLY:

```
------------- YOUR PLAYLIST ------------
 1. https://youtu.be/5Fg9oZk-5uA | 14:14 ( +30s preroll +2m midroll )
 2. https://youtu.be/oNCs4C2SMjo | 10:29 ( +30s preroll +5s postroll )
 3. https://youtu.be/XKu_SEDAykw | 24:02 ( no ads )
 4. https://youtu.be/ZAfAud_M_mg | 03:57 ( +30s preroll +10s midroll +5s postroll )
 5. https://youtu.be/ZAfAud_M_mg | 03:57 ( +30s preroll +2m midroll +5s postroll )
 6. https://youtu.be/GnJAqV3VMUE | 25:09 ( no ads )
Total play time: 1:28:13
```

Notice that:
- Each item is numbered. Single digit numbers begin with an extra space, whereas double digit numbers do not and thus the period that follows will all be aligned.
- `https://youtu.be/` is added to the video ID to produce the URL to the video.
- The video length is that of the video without any ads added on yet.
- Any ads applied are listed afterwards in parentheses. Take note of the spacing.
- The ads are listed in order (pre-roll, mid-roll, post-roll) if applicable, otherwise it is omitted.
- If there are no ads, then it says `( no ads )` instead.
- Total play time is the sum of all video lengths and all ads they have been applied. Seconds are shown as a value between `00` and `59`, carrying over to the minutes value as needed. Same with carrying minutes over to hours.

After printing, return back to the main menu.

## 4. Clear playlist

This will erase all progress and items added to the playlist, after the user confirms that they wish to proceed.

Display a message asking the user to confirm if they wish to lose their progress. Accept user input:

- If the user enters `true`, then clear the playlist and return to the main menu.

- If the user enters `false`, then return to the main menu.

- If the user enters an invalid boolean, then prompt them again.

## 5. Close UtepTube

If the user selects the exit option, all playlist items and progress done throughout the
program is lost and will exit the user out of the program.

First display a goodbye message.

Afer that, the program should then terminate without error. Do NOT use `System.exit()` to do this.

## FAQ

This section will be updated with answers to Frequently Asked Questions as they arise.

(none yet)

