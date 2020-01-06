package TheFirstOne;

public class Sandwich {

	public static void main(String[] args) {
		
		// TheThirdOne.Technical.A sandwich is two pieces of bread with something in between.
		// Print the string that is between the first and last appearance of "bread" in the string, 
		// or return string "nothing" if there are not two pieces of bread.
		
		String str = "sflskjflajfl-bread-ozkanayata-bread-mtl";
		System.out.println(printSandwich(str));
	}
	
	public static String printSandwich(String str) {
		
		String result = "";
		
		int firstIndex = str.indexOf("bread");
		int lastIndex = str.lastIndexOf("bread");
		
		if(firstIndex == lastIndex)
			result = "nothing";
		else
			result = str.substring(firstIndex + 5, lastIndex);
		
		return result;
	}

}
