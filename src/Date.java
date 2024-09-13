import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        int day, month, year;
        System.out.println("Enter you date of birth in the format dd/mm/yyyy");
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            days[1] = 29;
        }
        if(month < 1 || month > 12 || day < 1 || day > days[month - 1] || year < 1 || year > 9999) {
            System.out.println("Invalid date");
        } else {
            System.out.println("Valid date");
        }

        int daysPassed = 0;
        for (int i = 0; i < month - 1; i++) {
            daysPassed += days[i];
        }
        daysPassed += day;
        System.out.println("The day number of the year: " + daysPassed);
    }
}
