import java.util.Scanner;
public class DecimalToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        sc.close();
        String hex = "";
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'};
        while (decimal > 0) {
            int rem = decimal % 16;
            hex = hexChars[rem] + hex;
            decimal = decimal / 16;
        }
        System.out.println(hex);
    }
}