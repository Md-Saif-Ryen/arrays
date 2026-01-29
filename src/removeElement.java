import java.util.Arrays;

public class removeElement {
    public static void main(String[] args) {
        int[] arr ={0,1,2,2,3,0,4,2};
        System.out.println(removeElements(arr,2));
    }

    public static int removeElements(int[] nums, int val) {
        int k = 0; // ye index hai jahan pe non-val elements aayenge

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // non-val element ko aage shift karo
                k++; // agle position pe jaao
            }
        }

        System.out.println(Arrays.toString(nums));
        return k; // k hi count hai valid elements ka
    }
}
