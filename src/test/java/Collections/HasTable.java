package Collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HasTable {

    /*
    HashMap is not synchronized that means it executing at the same time
    synchronized { executing one by one }
    it is smilier to hashtable but synchronized
    key --> object -- hashcode --value
    java create some hashcode -->
    when you create an object jvm give some hashCode number --> 32 bit int
    jvm os providing unique number so java is given some number for objects
    whenever you compare two obj you have to overwrite equals method
    <34564345, "Tom">

    one execution happening at one time, so executing is slow
     */
    public static void main(String[] args) {

        Hashtable h1 = new Hashtable();
       h1.put(0,"Suleyman");
        h1.put(1,"Nurdan");
        h1.put(2,"?");
        h1.put(3,"!!");
        h1.put(4,"@@@");
        h1.put(4,"Akbar");

        Hashtable h2 = new Hashtable();

        h2 = (Hashtable) h1.clone();
       // System.out.println(h2);

        /*
        we have to use Enumeration values with hashtable for iteration
        & we can create an object for each of them.
        no null key and values. { so null key and null values not allows } if you pass null value you will get an null pointer exception

         */

        Enumeration e = h2.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

      Set set = h2.entrySet();
        System.out.println(set);


        if(h1.equals(h2)){
            System.out.println("both are equal");

        }
    }

}
