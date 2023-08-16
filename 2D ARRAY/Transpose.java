import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, columns;
        System.out.println("Enter Rows : ");
        rows = sc.nextInt();
        System.out.println("Enter Columns : ");
        columns = sc.nextInt();
        int matrix1[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose Matrix : ");

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix1[j][i] + " ");
            }
            System.out.println();
        }
    }
}
