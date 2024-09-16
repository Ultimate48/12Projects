import java.util.Scanner;

public class Evil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int rem, c = 0;
        while (n != 0) {
            rem = n % 2;
            n /= 2;
            c += rem;
        }

        if (c % 2 == 0) {
            System.out.println("The number is Evil.");
        } else {
            System.out.println("The number is Not Evil.");
        }

    }
}
