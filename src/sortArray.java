import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
//int[] arr={3,1,2,4};
        int[] arr={0,2,4,1,6};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }

    public static  int[] sortArrayByParity(int[] nums) {
        int k = 0;
        int start = 0;
        int end =nums.length-1;
        if (nums.length < 2) {
            return nums;
        }
       while(start<end){ //0,2,4,1,6
           while (start < end && nums[end] % 2 != 0) {
               end--;
           }
           while(start<end && nums[start]%2==0){
               start++;
           }

           if(start<end){
               int temp = nums[start];
               nums[start] = nums[end];
               nums[end] = temp;
               start++;
               end--;
           }
       }
        return nums;
    }
}
