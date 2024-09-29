import java.util.Scanner;
public class sample{
    public static void main(String args[]){
        System.out.println("Enter string:");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println("Merged String is:\n");
        System.out.println(s1+s2);
}
}