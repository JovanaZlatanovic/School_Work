package p_23_12_2021;

public class Task_4 {

	public static void main(String[] args) {
		/*
		 * Write a method that prints a Slack message with reactions. The following
		 * parameters are accepted: 
		 * Username 
		 * User last name
		 * Message text
		 * A series ofreactions, e.g. reactions = {“lol”, “sunglasses”, “like”, “heart”}; 
		 * Number of repetitions for each reaction. e.g.: repetitions = {1, 2, 0, 4}
		 *  Print example: 
		 *  Full name Some message lol (1) sunglasses (2) like (0) | heart (4)
		 */
		String[] reactions = { "lol", "smile", "sunglasses", "heart" };
		int[] numberReaction = { 1, 2, 3, 4 };
		String name = "John";
		String surname = "Smith";
		String text = "Hello World!";

		slack(name, surname, text, reactions, numberReaction);
	}

	public static void slack(String name, String surname, String text, String[] reactions, int[] numberReaction) {

		System.out.println(name + " " + surname);
		System.out.println(text);
		for (int i = 0; i < reactions.length; i++) {
			System.out.print(reactions[i] + " (" + numberReaction[i] + ") | ");
		}

	}

}
