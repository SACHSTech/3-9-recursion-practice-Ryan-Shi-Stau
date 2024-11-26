package recursion;

public class maxOfArray {

    public static int findMax(int[] arr, int n) {
        if (n == 0) {
            return arr[0];
        }
        if (arr[n] > arr[n - 1]) {
            arr[n - 1] = arr[n];
        }
        return findMax(arr, n - 1);

    }

    public static void main(String[] args) {
        int[] intarr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] randarr = { 9, 1, 6, 2, 10, 1, 6, 1, 3 };
        System.out.println(findMax(intarr, 7));
        System.out.println(findMax(randarr, 7));
    }
}
