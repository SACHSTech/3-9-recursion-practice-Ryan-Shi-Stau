package recursion;

public class sumOfArray {
    public static int sumArray(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return arr[n - 1] + sumArray(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] intarr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(sumArray(intarr, 5));

    }
}
