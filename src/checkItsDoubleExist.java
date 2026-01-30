public class checkItsDoubleExist {

    public static void main(String[] args) {
int[] arr = {101,2,5,3};

        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {

        if(arr.length < 2) {
            return false;
        }
        for(int i = 0; i<arr.length;i++){
            int num = arr[i];
            for(int j = 0; j< arr.length;j++){
                if(num == 2*arr[j]){
                    return  true;
                }
            }
        }

        return false;
    }
}
