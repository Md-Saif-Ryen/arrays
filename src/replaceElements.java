import java.util.Arrays;

public class replaceElements {
    public static void main(String[] args) {
        int[] arr={0,5,3,6,8,3};
//        ans {8,8,8,8,-1}
        System.out.println(Arrays.toString(replaceElement(arr)));

    }
    public static int[] replaceElement(int[] arr) {

        int[] result = new int[arr.length];
        if(arr.length<2){
            return new int[]{-1} ;
        }
        for(int i=0; i<arr.length-1;i++){ //0,5,3,6,8,3
            int max=0;

            for(int j=i+1;j<arr.length;j++){
                if(max<arr[j]){
                    max = arr[j];
                }
            }
            result[i] = max;
            result[arr.length-1]= -1;
        }
        return  result;
    }
}
