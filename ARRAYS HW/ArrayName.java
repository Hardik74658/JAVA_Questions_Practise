import java.util.*;

public class ArrayName {

    public static void main(String[] args) {
        String names[] = new String[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            names[i] = input.nextLine();
        }

        System.out.println("Names In Array Are : ");

        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + "-" + names[i]);
        }
    }
}
