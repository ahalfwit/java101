package TheFirstOne;

public class Reverse_A_Number {

	public static void main(String[] args) {
		
		System.out.println(reverseANumber(1234));

	}
	
	
	public static String reverseANumber(int num) {
		
		String reversed = "";
		
		if(num == 0) 
			return "0";
		
		while(num > 0) {
			reversed += num % 10;
			num /= 10;
		}
		return reversed;
	}

}
