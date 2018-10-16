package lab7;

import java.util.Scanner;

public class Lab7Validator {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		String userName = Validator.getStringMatchingRegex(scan, "Please enter a name: ", "[a-zA-z]+");

		String userPhone = Validator.getStringMatchingRegex(scan, "Please enter a phone number: ",
				"\\d{3}-\\d{3}-\\d{4}");

		String userEmail = Validator.getStringMatchingRegex(scan, "Please enter an email: ",
				"^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$");

		String userDate = Validator.getStringMatchingRegex(scan, "Please enter a date: ", "\\d{2}/\\d(2}/\\d{4}");

	}

}

//	public static String getString(Scanner scan, String prompt) {
//		System.out.print(prompt);
//		String input = scan.next(); // read user entry
//		scan.nextLine(); // discard any other data entered on the line
//		return input;
//	}
//
//	public static String getStringMatchingRegex(Scanner scan, String prompt, String regex) {
//		boolean isValid = false;
//		String input;
//
//		do {
//			input = getString(scan, prompt);
//			if (input.matches(regex)) {
//				isValid = true;
//			} else {
//				System.out.println("Input must match the right format: ");
//				isValid = false;
//			}
//		} while (!isValid);
//
//		return input;
//	}
//
//}
