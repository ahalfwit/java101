package javaCoding;

public class CountingElements {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4};
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


}

