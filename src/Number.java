public class Number {
    public static void main(int a, int b, int c) {
        int largest = a > b ? (Math.max(a, c)) : (Math.max(b, c));
        int smallest = a < b ? (Math.min(a, c)) : (Math.min(b, c));
        System.out.println("Largest: " + largest + "\nSmallest: " + smallest);
    }
}
