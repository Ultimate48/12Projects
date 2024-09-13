public class NumberNames {
    public static String main(int number){
        if (number == 0) return "Zero";
        if (number == 10000) return "Ten Thousand";

        String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] teens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        String name = "";

        name += (number >= 1000) ? ones[number / 1000] + " Thousand " : "";
        number %= 1000;

        name += (number >= 100) ? ones[number / 100] + " Hundred " : "";
        number %= 100;

        name += (number >= 10) ?
                ((number % 10 == 0) ? tens[number / 10] :
                        ((number / 10 == 1) ? teens[number % 10] :
                                tens[number / 10] + " " + ones[number % 10])) :
                ones[number];

        return name;
    }

    public static void main(String[] args) {
        System.out.println(main(8943));
    }
}
