package TheFirstOne;

public class Smallest_Number_And_Second_Smallest_Number {

	public static void main(String[] args) {
		
		 int[] numbers = {5, -15, -8, 4, 2, 10, 30, -3, 99, 3};
		 
		    int smallest = 0;
		    int secondSmallest = 0;
		    
			for (int i = 0; i < numbers.length; i++) {
				
				if(numbers[i] == smallest) {
					secondSmallest = smallest;
					
				} else if(numbers[i] < smallest) {
					secondSmallest = smallest;
					smallest = numbers[i];
					
				} else if(numbers[i] < secondSmallest) {
					secondSmallest = numbers[i];
				}
					
			}
		    
		    System.out.println("TheSecondOne smallest: " + secondSmallest);
		    System.out.println("Smallest: " + smallest);

	}

}
