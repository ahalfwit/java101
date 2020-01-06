package TheFirstOne;

import java.util.Scanner;

public class Until_You_Get_YES_or_Negative_Number {

	public static void main(String[] args) {

		// Write a method where ask a question and until you get YES, you keep asking.
		Until_You_Get_YES();
		until_You_Get_A_Negavite();
	}

	public static void Until_You_Get_YES() {

		Scanner scan = new Scanner(System.in);

		String answer = "";

		for (; ! answer.equalsIgnoreCase("yes");) {

			System.out.println("Do you love Java?" + "\n" + "Please Answer!");
			answer = scan.nextLine();
		}
		System.out.println("Finally");
	}

	// Write a method where u return the total until user enters a negative.

	public static void until_You_Get_A_Negavite() {

		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int num = 0;

		for (System.out.println("Enter a number"); num >= 0; System.out.println("Keep Entering")) {

			num = scan.nextInt();
			if (num < 0)
				break;
			sum += num;

		}
		System.out.println("Now you just entered a negative number so \nyour total is = " + sum);

	}

}
