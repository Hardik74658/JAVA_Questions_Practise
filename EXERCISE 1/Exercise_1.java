import java.util.Scanner;

/*
1. Enter 3 numbers from the user & make a function to print their average.
2. Write a function to print the sum of all odd numbers from 1 to n.
3. Write a function which takes in 2 numbers and returns the greater of those two.
4. Write a function that takes in the radius as input and returns the circumference of a circle.
5. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
6. Write an infinite loop using do while condition.
7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
8. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
9. Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
10.Write a program to print Fibonacci series of n terms where n is input by user :
   0 1 1 2 3 5 8 13 21 ..... 
   In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
   (BONUS) 
*/
public class Exercise_1 {
   public static float avg(int n1, int n2, int n3) {
      return (n1 + n2 + n3) / 3;
   }

   public static int oddSum(int n) {
      int sum = 0;
      for (int i = 1; i < n; i++) {
         if (i % 2 != 0) {
            sum += i;
         }
      }
      return sum;
   }

   public static int greatest(int n1, int n2) {
      if (n1 >= n2) {
         return n1;
      } else {
         return n2;
      }
   }

   public static double circumference(float radius) {
      return 2 * Math.PI * radius;
   }

   public static void voteEligibility(int age) {
      if (age > 18) {
         System.out.println("Person Is Eligible For Vote.");
      } else {
         System.out.println("Person is Not Eligible For Vote.");
      }
   }

   public static void countNumbers() {
      int positive = 0, negative = 0, zero = 0;
      System.out.println("Enter -1 for quit(Exit).");
      System.out.println("Enter Numbers: ");
      do {
         try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();
            if (num == -1) {
               break;
            } else if (num > 0) {
               positive++;
            } else if (num < 0) {
               negative++;
            } else {
               zero++;
            }
         }
      } while (true);
      System.out.println("Positive Numbers : " + positive);
      System.out.println("Negative Numbers : " + negative);
      System.out.println("Zero Numbers     : " + zero);
   }

   public static float power(int n1, int n2) {
      float power = 1;
      for (int i = 0; i < n2; i++) {
         power *= n1;
      }
      return power;
   }

   public static void main(String[] args) {
      countNumbers();
   }
}
