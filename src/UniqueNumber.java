import java.util.Scanner;
public class UniqueNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a and b: \na = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        int c = 0;
        if(a > 300 || b > 500)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        System.out.println("The Unique-digit Integers are:");
        for(int i = a; i <= b; i++)
        {
            if(isUnique(i)) {
                System.out.print(i + ", ");
                c++;
            }
        }
        System.out.println("\b\b\nFrequency of the Unique-digit numbers is " + c);
        sc.close();
    }
    static boolean isUnique(int n){
        String str = Integer.toString(n);
        for(int i = 0; i < str.length(); i++)
        {
            for(int j = i + 1; j < str.length(); j++)
            {
                if(str.charAt(i) == str.charAt(j))
                    return false;
            }
        }
        return true;
    }
}