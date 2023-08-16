import java.util.*;

public class AdvancedPatterns {
    public static void butterfly(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            for (int space = 2 * (rows - i); space > 0; space--) {
                System.out.print(" \t");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        for (int i = rows; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*\t");
            }
            for (int space = 1; space <= 2 * (rows - i); space++) {
                System.out.print(" \t");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int space = rows - i; space > 0; space--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numberPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int space = rows - i; space > 0; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void palindromeNumbersPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int space = rows - i; space > 0; space--) {
                System.out.print("\t");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + "\t");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    public static void diamond(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int space = rows - i; space > 0; space--) {
                System.out.print("\t");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        for (int i = rows; i >= 1; i--) {
            for (int space = rows - i; space > 0; space--) {
                System.out.print("\t");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter Rows : ");
            int rows = input.nextInt();
            // butterfly(rows);
            // solidRhombus(rows);
            // numberPyramid(rows);
            // palindromeNumbersPyramid(rows);
            diamond(rows);
        }
    }
}
