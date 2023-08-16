package PATTERNS;

import java.util.*;

/*
 * Patterns
 * 
 * 1-Solid Rectangle
 * 2-Hollow Rectangle
 * 3-Half Pyramid
 * 4-Inverted Half Pyramid
 * 5-MirroredHallfPyramid
 * 6-Half Pyramid With Numbers
 * 7-Inverted Half Pyramid With Numbers
 * 8-Floyd's Triangle (counting triangle)
 * 9-_01 Triangle
 */

class Patterns {
    public static void solidRectangle(int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void hollowRectangle(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }

    public static void halfPyramid(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void invertHalfPyramid(int rows) {
        for (int i = rows; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void mirroredHalfPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int space = rows - i; space > 0; space--) {
                System.out.print(" \t");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void halfNumbersPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    public static void invertHalfNumbersPyramid(int rows) {
        for (int i = rows; i > 0; i--) {
            for (int j = i, count = 1; j > 0; j--, count++) {
                System.out.print(count + "\t");
            }
            System.out.println();
        }
    }

    public static void floydsTriangle(int rows) {
        int count = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count + "\t");
                count++;
            }
            System.out.println();
        }
    }

    public static void _01Triangle(int rows) {
        int count = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count + "\t");
                if (count == 1) {
                    count = 0;
                } else {
                    count = 1;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int rows, columns;
            System.out.println("Enter Rows : ");
            rows = input.nextInt();
            System.out.println("Enter Columns : ");
            columns = input.nextInt();
            solidRectangle(rows, columns);
            System.out.println();
            System.out.println();
            hollowRectangle(rows, columns);
            System.out.println();
            System.out.println();
            halfPyramid(rows);
            System.out.println();
            System.out.println();
            invertHalfPyramid(rows);
            System.out.println();
            System.out.println();
            mirroredHalfPyramid(rows);
            System.out.println();
            System.out.println();
            halfNumbersPyramid(rows);
            System.out.println();
            System.out.println();
            invertHalfNumbersPyramid(rows);
            System.out.println();
            System.out.println();
            floydsTriangle(rows);
            System.out.println();
            System.out.println();
            _01Triangle(rows);
        }
    }
}
