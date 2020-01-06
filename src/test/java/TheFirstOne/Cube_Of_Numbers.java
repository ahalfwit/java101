package TheFirstOne;

import java.util.Scanner;

public class Cube_Of_Numbers {

	public static void main(String[] args) {
		
		// Ask user for a  number, print the cube of the number, 
		// do this repeatedly until user enters a negative number
		
		cube_Of_Numbers();

	}
	
	public static void cube_Of_Numbers() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number!");
		
		int num = scan.nextInt();
				
			while(num >= 0) {
				System.out.println(num*num*num);
				System.out.println("Enter another one!");
				num = scan.nextInt();
			}
				
			System.out.println("Sorry you messed up by entering a negavite");
		}
}
