import java.util.Scanner;
public class Days {
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         int date, year, day, i = 0;

         do {
             System.out.print("Enter date:  ");
             date = sc.nextInt();
             year = date % 10000;
             day = date / 10000;
         } while (year < 1900 || year > 3000 || day < 1 || day > 366 && isLeapYear(year) || day > 365 && !isLeapYear(year));

        sc.close();
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] days = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while(day > 31)
            day -= days[i++];

        System.out.println(day + " " + months[i] + " " + year);
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}