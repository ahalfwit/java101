package TheThirdOne.Pages;

import java.util.*;

public class RemoveElement {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4};

        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                count++;
            }
        }


        System.out.println(count);


        int[] arr2 = {1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4};

     System.out.println(removeDuplicates(arr));

    }


    public static int removeDuplicates(int[] nums) {

        int k = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[k]) {
                k++;
                nums[k] = nums[j];
                System.out.println(nums[k]);
            }
        }

        return k + 1;

    }


    public static int remove2(int[] arr) {

        Set<Integer> mySet = new HashSet<>();
        for (Integer each : arr) {
            mySet.add(each);
        }
        System.out.println(mySet);
        return mySet.size();
    }

}


