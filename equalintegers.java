import java.util.Scanner;

public class EqualIntegers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter four integers:");

       
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        
        if (num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.println("All numbers are equal.");
        } else {
            System.out.println("Numbers are not equal.");
        }

        
        scanner.close();
}
}