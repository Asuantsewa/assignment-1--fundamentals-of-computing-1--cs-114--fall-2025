// public class Assignment1Program2 {
//   public static void main(String[] args) {

//   }
// }
import java.util.Scanner;

public class Assignment1Program2 {

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

// 1. Get the base-10 number and the target base from the user
  System.out.print("Enter a base-10 number to convert: ");
    int base10Number = scanner.nextInt();

  System.out.print("Enter the target base (between 2 and 36): ");
  int targetBase = scanner.nextInt();

// Validate the base
  if (targetBase < 2 || targetBase > 36) {
    System.out.println("Invalid base. Please enter a base between 2 and 36.");
  return;
}

// 2. Convert the base-10 number to the target base
  String convertedNumber = convertToBase(base10Number, targetBase);
    System.out.println("Converted number: " + convertedNumber);

// 3. Calculate the largest 4-digit number in the given base
  int largest4DigitNumber = (int) Math.pow(targetBase, 4) - 1;
    System.out.println("Largest 4-digit number in base " + targetBase + ": " + largest4DigitNumber);
}

// Method to convert a base-10 number to a different base (2 to 36)
  public static String convertToBase(int number, int base) {
// Base case for recursion: when the number is 0, return an empty string
  if (number == 0) {
  return "";
}

// Calculate the current digit (remainder of division by base)
int remainder = number % base;
        
// If remainder is greater than 9, use letters A-Z
  char digit = (remainder < 10) ? (char) ('0' + remainder) : (char) ('A' + remainder - 10);
        
// Recur with the quotient
  return convertToBase(number / base, base) + digit;
 }
}
