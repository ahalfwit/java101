package TheFirstOne;

public class Numbers_for_Multiple_X_and_Y {

	public static void main(String[] args) {
		
		// Write a method that prints out the numbers from 1 to 30, 
		// but for numbers which are multiple of 3 prints FIN instead of number, 
		// and for numbers multiple by 5 prints RA instead of number, 
		// and for numbers multiple both by 3 and 5 prints FINRA
		
		print_FINRA();
	}
	
	public static void print_FINRA() {
		
		for (int i = 1; i <= 30; i++) {
			if(i % 15 == 0)
				System.out.println("FINRA");
			else if(i % 3 == 0)
				System.out.println("FIN");
			else if(i % 5 ==0)
				System.out.println("RA");
			else
				System.out.println(i + " ");
		}
	}

}
