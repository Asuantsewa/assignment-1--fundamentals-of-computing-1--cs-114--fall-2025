// Import the Scanner class for user input
import java.util.Scanner;

// Import the Random class to generate a random number
import java.util.Random;

// This is the main class that holds everything
public class Assignment1Program1 {

// The main method is where the program starts
public static void main(String[] args) {
        
// 1. Print initials in big block letters
printInitials();  // We call a method below to print initials
        
// 2. Set up scanner so we can get input from the user
Scanner scanner = new Scanner(System.in);

// Ask the user to enter a 5-character string
System.out.print("\nEnter a 5-character string: ");
String input = scanner.nextLine();

// Check if the input is exactly 5 characters long
if (input.length() != 5) {
  System.out.println("Invalid input. Please enter exactly 5 characters.");
  
  return; // Stop the program if it's not 5 characters
}

// Remove the first and last characters, and reverse the middle three
String middle = input.substring(1, 4); // Get characters at index 1, 2, 3
String reversedMiddle = new StringBuilder(middle).reverse().toString();
System.out.println("Processed string: " + reversedMiddle);

// 3. Ask for temperature in Fahrenheit and convert to Celsius
System.out.print("Enter a temperature in Fahrenheit: ");
double fahrenheit = scanner.nextDouble();

// Formula to convert Fahrenheit to Celsius
double celsius = (fahrenheit - 32) * 5 / 9;
System.out.printf("Temperature in Celsius: %.2f\n", celsius);

// 4. Generate a random number between 32 and 16,384

Random rand = new Random();
int randomNumber = rand.nextInt(16384 - 32 + 1) + 32;
System.out.println("Random number (32 to 16,384): " + randomNumber);
System.out.println("/n Random number generated.");
System.out.println("/n Your new string is: "+celsius + reversedMiddle + randomNumber);
}

//5. A concactenation of answers from 2-4
// {
// System.out.println("Concatenation:");
// System.out.print(celsius);
// System.out.prinln(word.charAt(3));
// System.out.println(word.charAt(2));
// }


// print initials
public static void printInitials() {
System.out.println("JJJJJ      EEEEE");
System.out.println("  J        E    ");
System.out.println("  J        EEEE ");
System.out.println("J J        E    ");
System.out.println(" J         EEEEE");
}

}
