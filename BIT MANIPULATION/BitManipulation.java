/*
 * Bit Manipulation
 * 
 * Get Bit
 * import java.util.*;
 * 
 * 
 * public class Bits {
 * public static void main(String args[]) {
 * int n = 5; //0101
 * int pos = 3;
 * int bitMask = 1<<pos;
 * 
 * 
 * if((bitMask & n) == 0) {
 * System.out.println("bit was zero");
 * } else {
 * System.out.println("bit was one");
 * }
 * }
 * }
 * 
 * 
 * 
 * 
 * Set Bit
 * import java.util.*;
 * 
 * 
 * public class Bits {
 * public static void main(String args[]) {
 * int n = 5; //0101
 * int pos = 1;
 * int bitMask = 1<<pos;
 * 
 * 
 * int newNumber = bitMask | n;
 * System.out.println(newNumber);
 * }
 * }
 * 
 * Clear Bit
 * import java.util.*;
 * public class Bits {
 * public static void main(String args[]) {
 * int n = 5; //0101
 * int pos = 2;
 * int bitMask = 1<<pos;
 * int newBitMask = ~(bitMask);
 * int newNumber = newBitMask & n;
 * System.out.println(newNumber);
 * }
 * }
 * 
 * 
 * 
 * 
 * Update Bit
 * 
 * import java.util.*;
 * 
 * 
 * public class Bits {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * int oper = sc.nextInt();
 * // oper=1 -> set; oper=0 -> clear
 * int n = 5;
 * int pos = 1;
 * 
 * int bitMask = 1<<pos;
 * if(oper == 1) {
 * //set
 * int newNumber = bitMask | n;
 * System.out.println(newNumber);
 * } else {
 * //clear
 * int newBitMask = ~(bitMask);
 * int newNumber = newBitMask & n;
 * System.out.println(newNumber);
 * }
 * 
 * }
 * }
 * 
 * 
 * 
 * Homework Problems
 * Write a program to find if a number is a power of 2 or not.
 * Write a program to toggle a bit a position = “pos” in a number “n”.
 * Write a program to count the number of 1’s in a binary representation of the
 * number.
 * Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a
 * number from one number system to another. [BONUS]
 */
