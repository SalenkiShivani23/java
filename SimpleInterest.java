package javapractice;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Principle:");
		int p=scan.nextInt();
		System.out.println("Enter the timeperiod:");
		int t=scan.nextInt();
		System.out.println("Enter the rate:");
		int r=scan.nextInt();
		System.out.println("Simple Interest:"+(p*t*r)/100);
		// TODO Auto-generated method stub

	}

}
