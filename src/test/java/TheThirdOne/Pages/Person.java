package TheThirdOne.Pages;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Person {

    String name;
   static int age;

    public Person(String n, int a) {
        name = n;
        age = a;

    }

    public String getName() {
        return name;

    }

    public static int getAge() {
        return age;

    }


    public static void checkAge(List<Person> personList, Predicate<Predicate> predicate) {


        for (Person person : personList) {

            if (predicate.test((Predicate) person)) {

                System.out.println(person.name + " ");


            }
        }
    }


    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(new Person("Hank", 25),
                new Person("Nurdan", 30),
                new Person("AffetBeni", 54));


        checkAge(personList, person-> getAge()>40);
    }

}








