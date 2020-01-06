package TheThirdOne.Pages;

import java.util.HashMap;
import java.util.Map;

public class IntegerMap {


    public static void main(String[] args) {

        Integer[] dublicate = new Integer[]{1, 11, 1, 1, 1, 1, 1, 1, 111, 1, 11, 1, 111, 2};
        System.out.println(remove(dublicate));

    }

    public static Map<Integer, Integer> remove(Integer[] a) {

        Map<Integer, Integer> myAllMap = new HashMap<>();
        for (Integer each : a) {
            int count = 0;
            if (myAllMap.get(each) != null)
                count = myAllMap.get(each);

            myAllMap.put(each, count + 1);
        }
        return myAllMap;
    }
}
