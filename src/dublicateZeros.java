//Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
//
//Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
//
//
//
//        Example 1:
//
//Input: arr = [1,0,2,3,0,4,5,0]
//Output: [1,0,0,2,3,0,0,4]
//Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
//Example 2:
//
//Input: arr = [1,2,3]
//Output: [1,2,3]
//Explanation: After calling your function, the input array is modified to: [1,2,3]


import java.util.Arrays;

public class dublicateZeros {
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        System.out.println(Arrays.toString(duplicate(arr)));
    }

    public static int[] duplicate(int[] arr) {

        int[] temp = new int[arr.length];
        int length = 0;
        for (int i = 0; i < arr.length && length<arr.length; i++) {
            if (arr[i] == 0) {
                temp[length] = 0;
                length++;
                temp[length] = arr[i];
                length++;
            } else {
                temp[length] = arr[i];
                length++;
            }

        }
        return temp;
    }

}
