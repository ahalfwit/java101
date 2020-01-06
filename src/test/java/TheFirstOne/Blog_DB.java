package TheFirstOne;

import java.util.ArrayList;
import java.util.Arrays;

public class Blog_DB {

	public static void main(String[] args) {
		
		// This method gets an ArrayList of String Arrays(ArrayList<String[]>) from a database, 
		// each row from the database table is represented by a position in the ArrayList. 
		// each ArrayList position holds a string array that holds the row data. 
		// The database table columns are : id(string), title(string), content(string).
		// ArrayList<String[]> row example. 
		// Each item in ArrayList is a String ArrayList row = 
		// [ ["1","title","content1"],	["2","another title","content2"], ["3","yet another title","content3"] ]
		// The String id argument of blog_DB method is referring to a row from the table the ArrayList holds.
		// You need to loop through each element in the ArrayList and find the matching String[] with that id.
		// Then return the title and content. TheThirdOne: blog_DB(al,"1") --> title1 ... content1
		
		ArrayList<String[]> al = new ArrayList<String[]>();
		al.add(new String[] {"1", "title1", "content1"});
		al.add(new String[] {"2", "title2", "content2"});
		al.add(new String[] {"3", "title3", "content3"});
	
		System.out.println(blog_DB(al,"1"));
	}
	
	public static String blog_DB(ArrayList<String[]> al, String id) {
		
		// To print all String arrays...
		for(String[] strArr: al) {
			System.out.println(Arrays.toString(strArr));
		}
		
		String result = "";
		
		for(int i = 0; i < al.size(); i++) {
			for(int j = 1; j < al.get(i).length; j++) {
				if(al.get(i)[0].equals(id))
					result = al.get(i)[1] + " ... " + al.get(i)[2];
			}
		}
		return result;
		
	}

}
