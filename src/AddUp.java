import java.util.Scanner;

public class AddUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter M and N: ");
        int m = sc.nextInt(), n = sc.nextInt();
        sc.close();
        if (m < 100 || m > 10000 || n > 100) {
            System.out.println("Invalid Input");
            return;
        }
        int num, digits = 0;
        do {
            num = 0;
            for (int i = m; i > 0; i /= 10) {
                num += i % 10;
            }
            m++;
        } while (num != n);
        System.out.println("The required number = " + (m - 1));
        while (m > 0) {
            digits++;
            m /= 10;
        }
        System.out.println("The total number of digits = " + digits);
    }
}