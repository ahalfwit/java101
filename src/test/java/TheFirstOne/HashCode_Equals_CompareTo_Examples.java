package TheFirstOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashCode_Equals_CompareTo_Examples {

	/*
	 * How do you sort objects that you created ? 
	 * I implement Comparable interface and override compareTo method. 
	 * Then whenever I store my objects into a List then use Collections.Sort. 
	 * I can also store my objects into a TreeSet or TreeMap.
	 */

	public static void main(String[] args) {

		Employee emp1 = new Employee(500);
		Employee emp2 = new Employee(100);
		Employee emp3 = new Employee(110);

		System.out.println("emp1 equals emp2: " + emp1.equals(emp2));

		List empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		Collections.sort(empList);
		System.out.println("Sorted Emplist: " + empList);
		
		for (Object object : empList) {
			System.out.println(object);
		}
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);

		System.out.println("i1 and i2: " + i1 + " - " + i2);
		System.out.println("i1 hashcode: " + i1.hashCode());
		System.out.println("i2 hashcode: " + i2.hashCode());
		System.out.println("i1 == i2:: " + (i1 == i2));
		System.out.println("i1 equals i2:: " + i1.equals(i2));

		Set<Employee> set = new HashSet<>();
		set.add(emp1);

		set.add(emp1);
		set.add(emp2);
		set.add(emp3);

		System.out.println("Set size: " + set.size());

	}

}

class Employee implements Comparable<Employee> {

	private int id;

	public Employee(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object other) {
		return this.id == ((Employee) other).id;
	}

	@Override
	public int compareTo(Employee emp) {
		if (this.id > emp.id) {
			return 1;
		} else if (this.id < emp.id) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return id + "";
	}
	
}
