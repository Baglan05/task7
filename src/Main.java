import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sec = new Scanner(System.in);
        int n = sec.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sec.nextInt();
        }

        func(n, arr);

    }

    /**
     * This recursive function prints the elements of an integer array in reverse order.
     *
     * @param n   The number of elements to print (starting from the last element).
     * @param arr The input integer array.
     */
    public static void func(int n, int[] arr) {
        if (n == 0) {
            return; // Base case: Stop recursion when n reaches 0
        } else {
            System.out.print(arr[n - 1] + " "); // Print the current element
            func(n - 1, arr); // Recursively call func with n-1
        }
    }

}