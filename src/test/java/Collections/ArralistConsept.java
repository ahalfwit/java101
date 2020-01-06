package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArralistConsept {

    /*
    These are Interface
    Set
    List
    Queue
    Deque

   these are class
   ArrayList
   Vector
   LinkedList
   TreeSet
   PrioritySet

     */


    public static void main(String[] args) {

        int a[] = new int[3]; // this is static array
        // if you try to reach different size like a[4] we will get Array index bound exception
        //dynamic array
        /*
        1. ArrayList is sorted insertion order
        2. ArrayList is not synchronized
        3. allows random access to fetch element because it stores values in base of indexes


         */
        ArrayList arrayList = new ArrayList();
        arrayList.add(12);
        arrayList.add("12");
        arrayList.add("345");
        arrayList.add("65");
        arrayList.add(12);
        arrayList.add(true);
        arrayList.add('a');

        for(int idk = 0 ; idk <arrayList.size();idk++){
            System.out.println(arrayList.get(idk));
        }
        Employee e1 = new Employee("Solomon", 29, "SDET");
        Employee e2 = new Employee("Nurdan", 43, "SDET");
        Employee e3 = new Employee("yigitAli", 30, "Teacher");
        ArrayList<Employee> myEmployee = new ArrayList<>();
        myEmployee.add(e1);
        myEmployee.add(e2);
        myEmployee.add(e3);
        Iterator<Employee>iterator =myEmployee.iterator();
        while(iterator.hasNext()){
           Employee emp= iterator.next();
            System.out.print(emp.age);
            System.out.print(emp.dept);
            System.out.print(emp.name);
        }

        System.out.println("-----------------------------");
        ArrayList<String>  myArray = new ArrayList<>();
        myArray.add("Ali");
        myArray.add("Ahmet");
        myArray.add("Huseyin");
        ArrayList<String>  myArray2 = new ArrayList<>();
        myArray2.add("Ali");
        myArray2.add("Ayse");
        myArray2.add("Fatma");
        myArray2.add("FAdime");
        myArray2.add("Husniye");
        myArray2.retainAll(myArray);


        for(int i = 0 ; i<myArray2.size();i++){
            System.out.println(myArray2.get(i));
        }


    }
}
