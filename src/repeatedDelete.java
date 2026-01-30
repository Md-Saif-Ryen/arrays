import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class repeatedDelete {
    public static void main(String[] args) {
int[] arr={0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(Arrays.toString(deleteRepeated(arr)));
    }
    public static int[] deleteRepeated(int[] arr){
        if(arr.length<2){
            return arr;
        }
        HashSet<Integer> set = new LinkedHashSet<>();
        for(int num:arr){

            set.add(num);
        }
        int[] result = new int[set.size()];
        int i =0;
        for(int n:set){
            result[i]= n;
            i++;
        }
        return result;
    }
}
