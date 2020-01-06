package Collections;

import Collections.Employee;

import java.util.HashMap;
import java.util.Map;

public class MapExample {


    public static void main(String[] args) {

        /*
        HashMap is a class implements Map interface abstract class
        it maintains no order
        it might have one null key value, and multiple null values
        it stores only unique elements

        *****IMPORTANT *******    FAIL FAST CONDITION & CONCURRENT EXCEPTION

        non synchronized --> we can use multiple threading interact but it is not thread safe
        What is that mean is Let's assume you are working one object & also we have multiple thread that
        updating our current object, so every time when object is updated we are getting updated version of object.
        another scenario is fail fast condition. Let's assume that if you modify the object multi threading environment, so if one of the
        thread remove or delete a part of the object then the other thread try to access deleted or removed one. in this case jvm throws
        and exception this is the only weakness of the HashMap conception. programmers are called this issue fail fast condition
        EXCEPTION --> CONCURRENT MODIFICATION ---> FAIL FAST EXCEPTION

        WHAT IS SYNCHRONIZED MEAN ?

        SYNCHRONIZED means everything is happening consecutively, so we don't have any conflict compiling source code

         */
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Ramazan");
        myMap.put(2, "Saniye");
        myMap.put(3, "Suleyman");
        myMap.put(4, "Hafize");
        myMap.put(5, "Ismail Olcay");
        myMap.put(6, "Nurdan");

        System.out.println(myMap.get(1));
        for (Map.Entry each : myMap.entrySet()) {
            // System.out.println(each); we can directly print this & we can get Key Value format  or
            System.out.println("{ " + each + " }");
            // System.out.println(" this is HashMap : " + each.getValue()); --> we can get just values here
            System.out.println(" this is HashMap : " + each.getKey());

        }

        HashMap<Integer, Employee> hm = new HashMap<>();
        Employee employee1 = new Employee("Mehmet", 40, "Manager");
        Employee employee2 = new Employee("ALi", 42, "QA");
        Employee employee3 = new Employee("Ramazan", 34, "Scrum Master");
        Employee employee4 = new Employee("Ilker", 32, "BA");
        Employee employee5 = new Employee("Suleyman", 22, "Po");
        Employee employee6 = new Employee("Nurdan", 22, "SDET");

        hm.put(1, employee1);
        hm.put(2, employee2);
        hm.put(3, employee3);
        hm.put(4, employee4);
        hm.put(5, employee5);

        for (Map.Entry<Integer, Employee> each : hm.entrySet()) {
            int keys = each.getKey();
            Employee e = each.getValue();
            if (e.name.equalsIgnoreCase("Ilker")) {
                System.out.println(keys + " info ");
                System.out.println(e.name + " " + e.age + " " + e.dept);
                break;
            }
        }
    }
}
