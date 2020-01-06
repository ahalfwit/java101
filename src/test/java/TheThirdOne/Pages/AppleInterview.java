package TheThirdOne.Pages;

import java.util.HashMap;
import java.util.Map;

public class AppleInterview {

    public static void main(String[] args) {

        // System.out.println(new String[] {"2", "1", "3","1"});
        String str = "my my my name is solomon";
        Map<String, Integer> map = AppleInterview.dublicateCount(str);
        System.out.println(map);
        // TheThirdOne.Pages.AppleInterview.dublicateCount(my);

        dublicateCount2(new String [] {"2", "1", "3","1"});



    }

    public static Map<String, Integer> dublicateCount(String sentences) {

        String str[] = sentences.split(" ");

        //split("\\s");

        Map<String, Integer> myMap = new HashMap<String, Integer>();

        for (String each : str) {

            if (!myMap.containsKey(each)) {
                myMap.put(each, 1);

            } else {
                myMap.put(each, myMap.get(each) + 1);
            }
        }
        // System.out.println(myMap);

        return myMap;
    }

    public static void dublicateCount2(String []sentences) {

        Map<String, Integer> myMap = new HashMap<String, Integer>();

        for (String each : sentences) {

            if (!myMap.containsKey(each)) {
                myMap.put(each, 1);

            } else {
                myMap.put(each, myMap.get(each) + 1);
            }

            for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey() + " ");
                }
            }

        }


    }


}


