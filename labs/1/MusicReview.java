import java.util.Scanner;

class MusicReview {
	public static void main(String[] args) {
		//----------
		// Example
		//----------
		String myName = "Paydirt Pete";  // TODO: Change to your own name.
		System.out.println("Hi, my name is " + myName + ".");

		//----------
		// Q1
		//----------

		// TODO: declare and intialize variables to fill in the two FIXMEs in the following print.

		System.out.println("I love listening to " + "FIXME" + " by " + "FIXME" + ".");

		//----------
		// Q2
		//----------

		// TODO: declare and initialize variables to fill in the FIXMEs.
		// You may not declare any strings or doubles for this question.
		// Each variable type declared in this question can only be used once.

		System.out.println("The song was released in year " + "FIXME" + ".");
		System.out.println("On Spotify, the song has been played " + "FIXME" + " times.");
		// Below FIXME should be a single variable including dollars and some cents.
		System.out.println("A vinyl copy might sell for $" + "FIXME" + "!");
		// Below FIXME should be S, A, B, C, D, or F.
		System.out.println("Overall, this artist's songs should be considered " + "FIXME" + " tier.");

		//----------
		// Q3
		//----------
		// This is provided code for receiving input from the command line.
		System.out.println("\nThree questions to determine if I will go to the next concert...");
		Scanner scanner = new Scanner(System.in);
		// Program will print each prompt and await either true or false to be entered by the user.
		System.out.print("Is the next concert expensive? (type true or false): ");
		boolean isExpensive = scanner.nextBoolean();

		System.out.print("Will the concert be worth it? (type true or false): ");
		boolean worthIt = scanner.nextBoolean();

		System.out.print("Are my friends going to the concert? (type true or false): ");
		boolean areFriendsGoing = scanner.nextBoolean();
		// boolean variables isExpensive, worthIt, and areFriendsGoing
		// are now initialized with values entered by the user from the command line.

		// TODO: Replace initialization with boolean expression using above three boolean variables.
		boolean willAttendConcertResult = false;  // FIXME

		System.out.println("Will I go to the next concert? The answer is " + willAttendConcertResult + ".\n");
		
		//----------
		// Q4
		//----------

		// TODO: update the previous play count variable, incrementing it by 1, and fill in the FIXME.

		System.out.println("Oops, I just played the song again! Make that " + "FIXME" + " times.");
	}
}