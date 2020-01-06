package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class HowManyManyWayToIterateArrayListIteration {

    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<>();

        myArrayList.add("Game of Thrones");
        myArrayList.add("Breaking Bad");
        myArrayList.add("The Big Bang Theory");
        myArrayList.add("Walking Dead");
        myArrayList.add("Prison Break");

        // 1. way we are iterating with forEach functional programing
        myArrayList.forEach(each -> {
            System.out.println(each);
        });

        System.out.println("-----------1----------------");

        // 2. Iterator object
        Iterator<String> stringIterator = myArrayList.iterator();
        while (stringIterator.hasNext()) {

            System.out.println(stringIterator.next());
        }
        System.out.println("-----------2----------------");

        //3.using iterator for each remaining method
        stringIterator = myArrayList.iterator();
        stringIterator.forEachRemaining(each1 -> {
            System.out.println(each1);
        });

        //4. ListIterator with reverse order

        ListIterator<String> listIterator = myArrayList.listIterator(myArrayList.size());
        while (listIterator.hasPrevious())
            // String reverse = listIterator.previous()
            System.out.println(listIterator.previous());
    }

}
