package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListExample {

    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        System.out.println(myList);
        // addFirst
        myList.addFirst("Z");
        //addLast
        myList.addLast("Z.1");
        System.out.println(myList);

        // get
        System.out.println(myList.get(0));
        myList.set(0,"Nurdan");
        System.out.println(myList);
        myList.removeLast();
        System.out.println(myList);
        myList.remove(2);
        System.out.println(myList);
        System.out.println("-------using advance for loop------------");
        //how to iterate all elements
        for(String each :myList){
            System.out.println(each + "--");
        }

        System.out.println("-------using iterator------------");

              Iterator<String> iter=   myList.iterator();
              while (iter.hasNext()){
                  System.out.println(iter.next());

              }
        System.out.println("-------using while------------");
              // how print with while loop
               int num = 0;
                while (myList.size() >num){
                    System.out.println(myList.get(num));
                    num++;
                }

    }

}
