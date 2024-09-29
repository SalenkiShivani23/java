import java.util.Scanner;

public class SimplePalindromeCheck {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        // Reverse the string
        String reversedString = new StringBuilder(originalString).reverse().toString();

                if (originalString.equals(reversedString)) {
            System.out.println(originalString + " is a palindrome.");
        } else {
            System.out.println(originalString + " is not a palindrome.");
        }

        
        scanner.close();
    }
}