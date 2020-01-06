package TheFirstOne;

public class Divide_Whitout_Division {

	public static void main(String[] args) {
		
		// Create a method that can divide two positive numbers without using division operators and Math class. 
		
		devide_Without_Divison(15, 5);
	}
	
	public static void devide_Without_Divison(int a, int b) {
		
		if(b == 0) {
			System.out.println("The division is NOT possible or infinity.");
			System.exit(0);
		}
		
		int count = 0;
		for (  ; a - b >= 0 ; ) {
			a -= b;
			count ++;
		}
		System.out.println("Quotient is a/b = " + count);
	}

}
