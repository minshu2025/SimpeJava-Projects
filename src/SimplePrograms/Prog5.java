package SimplePrograms;
import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Calculate the cgpa of given three subjects marks");
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter 1st Subject Mark: ");
		    float s1 = sc.nextFloat();
		    System.out.println("Enter 2nd Subject Mark: ");
		    float s2 = sc.nextFloat();
		    System.out.println("Enter 3rd Subject Mark: ");
		    float s3 = sc.nextFloat();
		    float cgpa = ((s1+s2+s3)/3)/10;
		    System.out.println("The cgpa of three subjects is: " +cgpa);
	}

}
