 package javapractice;
 import java.util.Scanner;

public class Calculatorswitc {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number:");
		int n1=scan.nextInt();
		System.out.println("enter second number:");
		int n2=scan.nextInt();
		System.out.println("MENU");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:System.out.println(n1+n2);
		break;
		case 2:System.out.println(n1-n2);
		break;
		case 3:System.out.println(n1*n2);
		break;
		case 4:System.out.println(n1/n2);
		break;
		default:System.out.println("Invalid choice");
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
