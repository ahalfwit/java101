package TheFirstOne;

public class Nested_Static {
	
	static class StaticClass {
		
	      static String str = "Inside Class StaticClass";
	      
	}

	public static void main(String args[]) {
	      StaticClass.str = "Inside Class Nested_Static";
	      System.out.println("String stored in str is- " + StaticClass.str);
	}


}

