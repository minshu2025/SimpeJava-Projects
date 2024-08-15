package SimplePrograms;
import java.util.Scanner;
public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the name of Student");
		Scanner sc = new Scanner(System.in);
		String student = sc.nextLine();
		System.out.println("The Student name is:" + student);
		
		System.out.println("Enter the marks of Maths:");
		int s1 = sc.nextInt();
		System.out.println("Enter the marks of English:");

		int s2 = sc.nextInt();
		System.out.println("Enter the marks of Hindi:");

		int s3 = sc.nextInt();
		System.out.println("Enter the marks of Computer:");

		int s4 = sc.nextInt();
		System.out.println("Enter the marks of Sanskrit:");

		int s5 = sc.nextInt();
		
		float percentage = (s1 + s2 + s3 + s4 + s5)/5;
		System.out.println("The Percentage of this Sudent is:" +percentage);
	}

}
