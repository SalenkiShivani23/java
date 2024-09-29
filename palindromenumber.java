import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int originalNumber = scanner.nextInt();

     
        int temp = originalNumber;
        int reversedNumber = 0;

        
        while (temp != 0) {
            int lastDigit = temp % 10;           
            reversedNumber = reversedNumber * 10 + lastDigit;  
            temp = temp / 10;                     
        }

        // Check if the original number is equal to the reversed number
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }

        
        scanner.close();
    }
}