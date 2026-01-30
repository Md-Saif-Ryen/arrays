public class mountainArray {
    public static void main(String[] args) {

    }

    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;

        int i = 0;

        // 1️⃣ Walk up (strictly increasing)
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // Peak cannot be first or last
        if (i == 0 || i == n - 1) return false;

        // 2️⃣ Walk down (strictly decreasing)
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        // If reached end, it's a valid mountain
        return i == n - 1;
    }

}
