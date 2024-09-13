import java.util.Scanner;
public class Arrangement{
    public static void rearrange(int n){

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];

        int target, temp;

        System.out.println("Enter the elements of the array sorted by size: ");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        sc.close();

        for(int i = 0; i < n; i=i+2){
            target = i/2;
            for(int j = i; j > target; j--){
                temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }

        for(int i = 0; i < (arr.length - 3)/2; i++){
            target = (arr.length + 1)/2;
            for(int j = arr.length - 1; j > target + i; j--){
                temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }

        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        rearrange(n);
        sc.close();
    }
}