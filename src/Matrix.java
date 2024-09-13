import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.print("Enter the number of rows (M): ");
        m = sc.nextInt();
        System.out.print("Enter the number of columns (N): ");
        n = sc.nextInt();

        if(m <= 0 || m >= 10 || n <= 2 || n >= 6){
            System.out.println("OUT OF RANGE");
            System.exit(0);
        }

        int[][] matrix = new int[m][n];
        int[] octal = new int[m];

        for(int i = 1; i <= m; i++){
            System.out.println("Enter elements for row " + i + ": ");
            for(int j = 0; j < n; j++){
                int temp = matrix[i-1][j] = sc.nextInt();
                if(temp < 0 || temp > 7){
                    System.out.println("INVALID INPUT");
                    System.exit(0);
                }
            }
        }

        sc.close();

        for(int i = 0; i < m; i++){
            int sum = 0;
            for(int j = n - 1; j >= 0; j--){
                sum += (int) (matrix[i][j] * Math.pow(8, n - 1 - j));
            }
            octal[i] = sum;
        }

        System.out.println("FILLED MATRIX\t\tDECIMAL EQUIVALENT");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\t\t\t" + octal[i]);
        }
    }
}
