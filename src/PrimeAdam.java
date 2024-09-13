import java.util.Scanner;

public class PrimeAdam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.print("Enter the value of m: ");
        m = sc.nextInt();
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();

        sc.close();
        if(m >= n){
            System.out.println("INVALID INPUT");
            System.exit(0);
        }

        int c = 0;

        System.out.println("THE PRIME ADAM NUMBERS ARE: ");

        for(int i = m; i <= n; i++){
            if(isPrime(i)){
                int rev = reverse(i);
                if((i*i) == reverse(rev*rev)){
                    System.out.print(i + " ");
                    c++;
                }
            }
        }

        if(c == 0)
            System.out.println("NIL");

        System.out.println("FREQUENCY OF PRIME-ADAM NUMBERS IS: " + c);
    }

    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    static int reverse(int n)
    {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
}
