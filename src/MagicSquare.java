import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the magic square: ");
        int n = sc.nextInt();
        int[][] magicSquare = new int[n][n];
        
        int[] iniDigits = new int[n];
        for (int i = 0; i < n; i++) {
            iniDigits[i] = i + 1;
        }
        int[] secDigits = new int[n];
        secDigits[0] = 0;
        for(int i = 1; i < n; i++) {
            secDigits[i] = secDigits[i - 1] + n;
        }

        int[] l1, l2;

        for(int i = 0; i < n; i++){
            l1 = iniDigits;
            l2 = secDigits;

        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.println();
        }

    }

    static boolean check(int[][] square, int number){

        for(int i = 0; i < square.length; i++){
            for(int j = 0; j < square.length; j++){
                if(square[i][j] == number){
                    return false;
                }
            }
        }

        return true;
    }
}
