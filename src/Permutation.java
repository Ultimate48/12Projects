import java.util.*;
public class Permutation {
    static int combinations = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from 2 to 5: ");
        int n = sc.nextInt();
        sc.close();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        permute(arr, 0, n - 1);
        System.out.println("Total combinations: " + combinations);
    }
    public static void permute(int[] arr, int l, int r) {
        if(l == r) {
            for (int j : arr)
                System.out.print(j + " ");
            System.out.println();
            combinations++;
        } else {
            for(int i = l; i <= r; i++) {
                swap(arr, l, i);
                permute(arr, l + 1, r);
                swap(arr, l, i);
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
