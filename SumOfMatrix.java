
import java.util.Scanner;

public class SumOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row of  matrices:");
        int n = sc.nextInt();
        System.out.println("enter column of  matrices:");
        int m = sc.nextInt();
        int[][] matrix1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("enter element of FRIST matrix[" + i + "][" + j + "]");
                matrix1[i][j] = sc.nextInt();
            }
        }

        int[][] matrix2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("enter element of  SECOND matrix[" + i + "][" + j + "]");
                matrix2[i][j] = sc.nextInt();
            }
        }

        int[][] SumOfMatrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                SumOfMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Sum of two matrices is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + SumOfMatrix[i][j] + "]" + "\t");
            }
            System.out.println("");
        }
    }
}
