import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();

        char[][] square = new char[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if((i == 0 || i == n - 1) && (j != 0 && j != n - 1)){
                    square[i][j] = '#';
                }
                else if((i != 0 && i != n - 1) && (j == 0 || j == n - 1)){
                    square[i][j] = '$';
                }
                else
                    square[i][j] = '@';
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }
}
