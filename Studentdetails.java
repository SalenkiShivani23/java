package javapractice;
import java.util.Scanner;

public class Studentdetails {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Scanner scan1=new Scanner(System.in);
		System.out.println("enter your name:");
		String s=scan.nextLine();
		System.out.println("enter your rollno:");
		int s1=scan.nextInt();
		System.out.println("enter your branch:");
		String s3=scan1.nextLine();
		System.out.println("My name is:"+s);
		System.out.println("My rollno is:"+s1);
		System.out.println("My branch is:"+s3);
		
	}

}
