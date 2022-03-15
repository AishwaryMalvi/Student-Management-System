package Student_Data;

import java.util.Scanner;

public class Management {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
		System.out.println("Enter the Number of Student to Enroll");
		Scanner scan = new Scanner(System.in);
		int numOfStudent = scan.nextInt();
		Student[] students = new Student[numOfStudent];

		for (int ctr = 0; ctr < numOfStudent; ctr++) {
			System.out.println("\nEnter the Infomation of Student ");
			students[ctr] = new Student();
			students[ctr].courseEnrollfees();
			students[ctr].otherExpencefess();
			students[ctr].pay_fees();
			students[ctr].marking();
			students[ctr].attend();
			students[ctr].facult_name();
		}
		for (int ctr = 0; ctr < numOfStudent; ctr++) {
			System.out.println("\nInformation of Student");
			System.out.println(students[ctr].toString());
		}
		
	}
		catch(Exception e) {
			System.out.print("Exception");  
            System.out.println(" handled in main try-block");  
		}
		finally {
			System.out.println("finally block is always executed");
		}
	}
	
}
