import java.util.Arrays;
import java.util.HashMap;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int n = removeDuplicate(arr);
        System.out.println(n);
    }

    public static int removeDuplicate(int[] nums) {
        if (nums.length == 0) return 0;

        int index = 1; // points to next position for unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index; // number of unique elements
    }

}
