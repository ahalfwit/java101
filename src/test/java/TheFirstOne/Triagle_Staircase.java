package TheFirstOne;

public class Triagle_Staircase {

	public static void main(String[] args) {
		
		triagle_StairCase(5);
		formTriangleWithAlphabet();

	}

	public static void triagle_StairCase(int count) {
		
//		for (int i = 1; i <= count; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		String result = "";
		
		for (int i = 1; i <= count; i++) {
			result += "* ";
			System.out.println(result);
		}
		
	}
	
	// Print TheThirdOne.Technical.A-Z  3 times in 26 rows
	// TheThirdOne.Technical.A
	// AB
	// ABC....Z
	public static void formTriangleWithAlphabet() {
		
		// Do the same action below n times...
		for(int a = 1; a < 2; a++) {
			for(int i = 65; i <= 90; i++) {
				for(int j = 65; j <= i; j++) {
					System.out.print((char)j);
				}
			System.out.println();
			}
		}
		
//		for(int i = 65; i <= 90; i++) {
//			for(int j = 65; j <= i; j++) {
//				System.out.print((char) j);
//			}
//		System.out.println();
//		}
			
	}
	
}
