package TheFirstOne;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Duplicate_Element_in_Array {

	public static void main(String[] args) {
		
		// How can you find the dublicates element in the array? Apple Questions:
		dublicateElements(new String[] {"1","1","2","2","3","4","5","5",});
	}
	
	public static void dublicateElements(String[] strArr) {
		
		System.out.println(Arrays.toString(strArr));
		
		Map<String, Integer> myMap = new HashMap<>();
		
		for(String each : strArr) {
			
			int count = 0;
			
			if(! myMap.containsKey(each)) 
				myMap.put(each, 1);
			else 
				myMap.put(each, myMap.get(each)+1);
			
		}
		
		for(Entry<String, Integer> entry : myMap.entrySet()) {
			if(entry.getValue() > 1) 
				System.out.print(entry.getKey() + "  ");	
		}
	}
		
}


