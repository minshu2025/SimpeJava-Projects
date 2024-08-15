package SimplePrograms;
import java.util.Scanner;

public class prog2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Kilometers:");
        double km = sc.nextDouble();
        double mile = km * 0.62137;
        System.out.printf("The miles is: %.2f%n", mile);
    }
}


