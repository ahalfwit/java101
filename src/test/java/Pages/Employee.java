package Pages;

import java.util.Arrays;
import java.util.List;

public class Employee {

    private String name ;
    private int age;
    private int salary;

    public String getName() { return name; }

    public int getAge() { return age; }

    public void setName(String name) { this.name = name; }

    public void setAge(int age) { this.age = age; }

    public void setSalary(int salary) { this.salary = salary; }

    public int getSalary() { return salary; }


    public Employee(String name , int age){

        setAge(age);
        setName(name);
        setSalary(20000);

        }

        public Employee(String name , int age, int salary){
                setSalary(salary);
              //  this(name, age);
        }


        public void printDetails(){
            System.out.println(name + " : "+ age+" : " +salary);
        }

    public static void main(String[] args) {

       // Employee e1 = new  Employee();
        Employee e2 = new  Employee("jack",50);
        Employee e3 = new  Employee("Donald",60);






//        String arr [] = {"Hi"+ "How"+ "Are"+ "You"};
//        List<String> arrList = Arrays.asList(arr);
//        if(arrList.removeIf(s -> ( args.length()<=2)));
//

    }
}
