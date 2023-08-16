import java.util.Scanner;

public class SortedChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers[] = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        boolean isSorted = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (!(numbers[i] < numbers[i + 1])) {
                isSorted = false;
            }
        }
        if (isSorted == true) {
            System.out.println("Array Is Sorted");
        } else {
            System.out.println("Array is not Sorted");
        }
    }
}
