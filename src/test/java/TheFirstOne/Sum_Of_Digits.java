package TheFirstOne;

import java.util.Scanner;

public class Sum_Of_Digits {

	public static void main(String args[]) {
		
		// ============ SUM OF THE DIGITS ===============
		
		int number, digit, sum = 0;
		boolean oddDigit;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your number: ");
		number = s.nextInt();
		
		while(number > 0) {
			digit = number % 10;
			System.out.println("Digits: " + digit);
			sum = sum + digit;
			number = number / 10;
		}
		
		System.out.println("Sum of Digits: " + sum);
		
		// ============ SUM OF THE ODD DIGITS ===============
		
		int num, dgt, total = 0;
		boolean isOdd;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number: ");
		num = input.nextInt();
		
		while(num > 0) {
			dgt = num % 10;
			System.out.println("Digits: " + dgt);
			
			if(dgt % 2 != 0) {
				total = total + dgt;
			}
			num = num / 10;
		}
		
		System.out.println("Sum of Digits: " + total);
		
		// ============ SUM OF THE DIGITS IN TheThirdOne.Technical.A STRING ===============
		
		String str = "12345as1dnjg1233veli456";
		
		int sumOfDigits = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char each = str.charAt(i);
			if(each >= '0' && each <= '9') {
				String value = "" + each;
				sumOfDigits += Integer.parseInt(value);
			}
		}

		System.out.println("Sum of digits in a String: " + sumOfDigits);
		
    }
}
