package SimplePrograms;
import java.util.Scanner;

public class Prog4 {

    public static void main(String args[])
    {
    	System.out.println("The Sum of Three Numbers");
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd Number: ");
        int num3 = sc.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println("The sum of Three numbers is: " +sum);
}
}
