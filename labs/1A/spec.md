---
layout: page
title: Lab 1A
nav_exclude: true
---

# Lab 1A: Setup and Hello World!
{:.no_toc}

Welcome to your first CS 1 lab! In this lab we will be completing setup steps needed so that you can use your personal computer for coursework. In the end, you will run your first Java program and submit the code for grading.

Going through setup can be tricky! Please make sure to carefully read each section to ensure steps aren't being skipped. If there are error messages or if the outcome of a step does not match what it says here, please don't hesitate to flag down a TA/IA for help.

## Table of contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## Text editor installation

First we will need a text editor, which will enable you to type out your Java programs. Text editors you may have used for English essays include Microsoft Word, Google Docs, notepad, etc. While these could be used for coding as well, there are text editors specifically designed for coding which will provide more relevant features such as coloring of different pieces of code, auto-completion of common code, and more.

We will use the [Sublime Text](https://www.sublimetext.com/) text editor in this course. Go to the website and download/install it to your machine.

## Terminal setup

Next you will need a terimal. Like in the movies, programmers can use the terminal to issue typed-out commands to the computer. There are many powerful commands, including some with the ability to permanently delete entire folders from your computer, mess with settings, or install and execute unwanted malware. Thus, do not run commands found on the internet without fully understanding them first!

### Mac users

Macs come with terminal already. Open spotlight search (Cmd + Space) and type "Terminal".

### Windows users

We will use GitBash.

1. Download the [Git for Windows installer](http://git-scm.com/download/).\
\
![](git_download.png)

2. Run the installer and click Next until reaching the "Select Components" screen. Uncheck/check the options to match what is shown below.\
\
![](git_install_components.png)

3. Click Next on the next few screens until reaching "Adjust your PATH environment". Select the middle, recommended option as shown below.\
\
![](git_path_install.png)

4. Click Next for the remaining screens and finish the installation.


## Java installation

### Mac users

1. To install Java, we will need to install [Homebrew](https://brew.sh/) first. Run the following command in your terminal to install it. When prompted, enter your computer password and hit enter to authorize the installation.\
\
```shell
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```
\
The result should look similar to this:\
\
![](homebrew-install.png)

2. There is a suggestion at the bottom of that output to run the following; this will let what you just installed be accessible with just the word `brew` by putting the installation location into the list of PATHs to check.\
\
```shell
eval "$(/opt/homebrew/bin/brew shellenv)"
```

3. Now we can install Java; run the following and there should a long output of successful installations.\
\
```shell
brew install java
```

4. Next, the following will create a link for your computer to know to find the Java installation in the Homebrew location, where by default it looks in the `Library` directory. You will need to type your password and hit Enter, and there will not be any further output.\
\
```shell
sudo ln -sfn $(brew --prefix)/opt/openjdk/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk.jdk
```

5. Finally, test that Java installed properly by typing:\
\
```shell
java -version
```
\
You should see an output like:\
\
![](java-version.png)

### Windows users

1. Download the pre-built Java from [Adoptium](https://adoptium.net/temurin/releases/?version=20) (version 20). Select the downloadable for `Windows`, `x64`, `.msi`.

2. Run the installer.\
\
**Important:** The installer will give you the following four options:\
\
![](openJDK_install_1.png)\
\
You should click the small red Xs and change it from “Entire feature will be unavailable” to “Will be installed on local hard drive” as shown below:\
\
![](openJDK_install_2.png)\
\
When you’ve done this, it should look like the following:\
\
![](openJDK_install_3.png)\
\
Click next until everything is installed.

3. Check that it is installed properly by running the following in your terminal:
```shell
javac --version
```
You should see a message indicating javac version `20.0.2+9` or higher.

## Hello World

We will now compile and run your first Java program! By tradition, we will create a program that displays "hello world" to the screen.

1. Create a folder on your computer for your coursework (call it `cs1`). Create another folder inside of it called `lab1A`.

2. Create a new file inside the `lab1A` folder called `Main.java`.

3. Open this file in Sublime.

4. Paste the following contents into the file and save it.
```java
class Main {
	public static void main(String[] args) {
		System.out.println("hello world");
	}
}
```

5. Open the terminal such that it is at the `lab1A` directory. This can be done by opening your `cs1` folder and right-clicking (or Ctrl + click) on the `lab1A` folder and selecting...
	- on Mac, select `New Terminal at Folder`.
	- on Windows, select `Git Bash Here`.\
\
The path to the `lab1A` directory should be visible before your cursor in the terminal window that opens.\
![](terminal-location.png)

6. All Java programs need to be **COMPILED** before being **RUN**.\
\
Compile the program:\

```shell
javac Main.java
```\
\
Run the program (note that there is no `.java` here!):\
\
```shell
java Main
```

## Submission setup on GradeScope

---
_Setup instructions adapted from [UC Berkeley CS 61B data structures course, lab 1, Spring 23](https://sp23.datastructur.es/materials/lab/lab01/)._
