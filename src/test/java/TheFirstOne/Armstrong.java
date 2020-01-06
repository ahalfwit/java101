package TheFirstOne;

public class Armstrong {

	public static void main(String[] args) {
		
		// Write a method that verifies the number whether it is arm-strong,
		// (it is a number that is equal to the sum of cubes of its digits) number or not?
		
		boolean b = isArmstrong(153);
		System.out.println("Is Armstrong: " + b );
	}
	
	public static boolean isArmstrong(int num) {
		
		int temp = num;
		int sum = 0;
		
		while(num > 0) {
			int eachDigit = num % 10;
			sum += eachDigit * eachDigit * eachDigit;
			num = num / 10;
		}
		if(sum == temp) {
			return true;
		}
			
		return false;
	}

}
