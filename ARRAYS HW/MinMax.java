import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers[] = new int[5];
        System.out.println("Enter 5 Numbers : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // int min = Integer.MIN_VALUE;
        // int max = Integer.MAX_VALUE;

        int min = numbers[0], max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}
