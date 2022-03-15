package Student_Data;

import java.util.Scanner;

public class Student {
	private String first_name;
	private String last_name;
	private String section;
	private String sex;
	private String stu_id;
	private String course;
	private String remark;
	private String faculty;
	private int grade;
	private int tutionfees;
	private int externalfees;
	private float marks;
	private int payment;
	private int remaningfees;
	private int attendence;
	private static int activity_fees = 15000;
	private static int id = 1000;

	@SuppressWarnings("resource")
	public Student() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Details of the Student Of Grade 9th ,10th ,11th ,12th");
		
		System.out.println("Enter the First Name");
		this.first_name = scan.nextLine().toUpperCase();

		System.out.println("Enter the Last Name");
		this.last_name = scan.nextLine().toUpperCase();

		System.out.println("Enter the Sex Press\nM for Male\nF for Female\nO for Others ");
		this.sex = scan.nextLine().toUpperCase();

		System.out.println("Enter the Grade Only for 9th ,10th ,11th ,12th Student");
		this.grade = scan.nextInt();

		set_studentid();

		System.out.println("Name:-" + first_name + " " + last_name);
		System.out.println("Class:-" + grade);
		System.out.println("StudentID:-" + stu_id);

		id++;
	}

	private void set_studentid() {
		this.stu_id = grade + sex + id;
	}

	@SuppressWarnings("resource")
	public void courseEnrollfees() {
		System.out.println("Select The Course");
		System.out.println("Enter 1 for Science ,2 for Commerce,3 for Arts,4 for Home Science");
		Scanner scan = new Scanner(System.in);
		int ctr;
		ctr = scan.nextInt();
		switch (ctr) {
		case 1:
			course = "Science";
			System.out.println("\nEnrolled in: - Science");
			System.out.println("Course fees: -" + 15000);
			tutionfees = activity_fees + 15000;
			System.out.println("Total fees:-" + tutionfees);
			break;
		case 2:
			course = "Commerce";
			System.out.println("\nEnrolled in: - Commerce");
			System.out.println("Course fees: -" + 10000);
			tutionfees = activity_fees + 10000;
			System.out.println("Total fees:-" + tutionfees);
			break;
		case 3:
			course = "Arts";
			System.out.println("\nEnrolled in: - Arts");
			System.out.println("Course fees: -" + 10000);
			tutionfees = activity_fees + 10000;
			System.out.println("Total fees:-" + tutionfees);
			break;
		case 4:
			course = "HomeScience";
			System.out.println("\nEnrolled in: - HomeScience");
			System.out.println("Course fees: -" + 8000);
			tutionfees = activity_fees + 8000;
			System.out.println("Total fees:-" + tutionfees);
			break;
		default:
			course = "Science";
			System.out.println("\nInvalid option retry");
		}

	}

	@SuppressWarnings("resource")
	public void otherExpencefess() {
		System.out.println("Other Charges");
		System.out.println("Enter 1 for Mess\n,2 for Bus\n,3 for Both\n,4 for none of them");
		Scanner scan = new Scanner(System.in);
		int ctr;
		ctr = scan.nextInt();
		if (ctr == 1) {
			System.out.println("\nOnly for Mess");
			System.out.println("Mess fees: -" + 5000);
			externalfees = 5000;
			tutionfees += externalfees;
			System.out.println("Updated fees:-" + tutionfees);
		}

		else if (ctr == 2) {
			System.out.println("\nOnly for Bus");
			System.out.println("Bus fees: -" + 4000);
			externalfees = 4000;
			tutionfees += externalfees;
			System.out.println("Updated fees:-" + tutionfees);
		} else if (ctr == 3) {
			System.out.println("Both Mess And Buss");
			System.out.println("Mess + Bus fees: -" + 9000);
			externalfees = 9000;
			tutionfees += externalfees;
			System.out.println("Updated fees:-" + tutionfees);
		} else if (ctr == 4) {
			System.out.println("None Of Them");
			tutionfees += 0;
			System.out.println("Updated fees:-" + tutionfees);
		} else {
			System.out.println("unvalid option try again");

		}
	}

	@SuppressWarnings("resource")
	public void marking() {
		float sum;
		System.out.println("\nMaring Score");
		if (course == "Science") {
			int mathematics, science, computer;
			System.out.println("Enter The Mathematics Marks");
			Scanner scan = new Scanner(System.in);
			mathematics = scan.nextInt();

			System.out.println("Enter The science Marks");
			science = scan.nextInt();

			System.out.println("Enter The Computer Marks");
			computer = scan.nextInt();

			sum = mathematics + science + computer;

			marks = (sum / 300) * 100;

			System.out.println("Percentage Obtained:-" + marks);
			remarks();
			System.out.println("Remark:-" + remark);
		}

		else if (course == "Commerce") {
			int accounts, bussiness, economic;
			System.out.println("Enter The accounts Marks");
			Scanner scan = new Scanner(System.in);
			accounts = scan.nextInt();

			System.out.println("Enter The bussiness Marks");
			bussiness = scan.nextInt();

			System.out.println("Enter The economic Marks");
			economic = scan.nextInt();

			sum = accounts + bussiness + economic;

			marks = (sum / 300) * 100;

			System.out.println("\nPercentage Obtained:-" + marks);
			remarks();
			System.out.println("Remark:-" + remark);
		}

		else if (course == "Arts") {
			int history, civis, geography;
			System.out.println("Enter The civis Marks");
			Scanner scan = new Scanner(System.in);
			civis = scan.nextInt();

			System.out.println("Enter The history Marks");
			history = scan.nextInt();

			System.out.println("Enter The geography Marks");
			geography = scan.nextInt();

			sum = civis + history + geography;

			marks = (sum / 300) * 100;

			System.out.println("Percentage Obtained:-" + marks);
			remarks();
			System.out.println("Remark:-" + remark);
		} else {
			int english, hindi, cooking;
			System.out.println("Enter The english Marks");
			Scanner scan = new Scanner(System.in);
			english = scan.nextInt();

			System.out.println("Enter The hindi Marks");
			hindi = scan.nextInt();

			System.out.println("Enter The cooking Marks");
			cooking = scan.nextInt();

			sum = english + hindi + cooking;

			marks = (sum / 300) * 100;

			System.out.println("Percentage Obtained:-" + marks);
			remarks();
			System.out.println("Remark:-" + remark);
		}

	}

	public void remarks() {
		if (marks >= 90) {
			remark = "OutStanding";
		} else if (marks >= 80) {
			remark = "Excellent";
		} else if (marks >= 70) {
			remark = "Very Good";
		} else if (marks >= 60) {
			remark = "good";
		} else if (marks >= 50) {
			remark = "Not Up To Marks";
		} else if (marks >= 40) {
			remark = "poor";
		} else if (marks >= 30) {
			remark = "Verypoor";
		} else if (marks >= 20) {
			remark = "Need HardWork";
		} else {
			remark = "Fail";
		}

	}

	@SuppressWarnings("resource")
	public void attend() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Attendence out of 244 days:-");
		attendence = scan.nextInt();
	}

	@SuppressWarnings("resource")
	public void pay_fees() {
		System.out.println("Payment Details");
		System.out.println("\nTotal Fees:-" + tutionfees);
		System.out.println("How much Amount paid:-");
		Scanner scan = new Scanner(System.in);
		payment = scan.nextInt();
		remaningfees = tutionfees - payment;
		System.out.println("Thankyou for your payment of Rupees:-" + payment);
		view_balance();
	}

	public void view_balance() {
		if(remaningfees == 0) {
			System.out.println("No Dues Are There");
		}
		else {
			System.out.println("the remaning Dues:-" + remaningfees);
		}
		
	}

	@SuppressWarnings("resource")
	public void facult_name() {
		System.out.println("Fauculty Name");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Section");
		this.section = scan.nextLine();
		section = section.toLowerCase();
		System.out.println(section);
		switch (grade) {
		case 9: {
			if (section.equals("a")) {
				faculty = "Mr. Aishwary Malvi";
			} else {
				if (section.equals("b")) {
					faculty = "Mr. Akshat shah";
				} else {
					if (section.equals("c")) {
						faculty = "Mr. Adnan Shaikh";
					} else {
						System.out.println("Invalid class");
					}
				}
			}
			break;
		}
		case 10: {
			if (section.equals("a")) {
				faculty = "Mr. Agam Jain";
			} else if (section.equals("b")) {
				faculty = "Mr. Bhupendra Choudry";
			} else if (section.equals("c")) {
				faculty = "Mrs. Alisha syed";
			} else {
				System.out.println("Invalid class");
			}
			break;
		}
		case 11: {
			if (section.equals("a")) {
				faculty = "Mr. Akshat shingh Rajput";
			} else if (section.equals("b")) {
				faculty = "Mr. Bhart jain";
			} else if (section.equals("c")) {
				faculty = "Mrs. Tanvi deshmich";
			} else {
				System.out.println("Invalid class");
			}
			break;
		}
		case 12: {
			if (section.equals("a")) {
				faculty = "Mr. Anurag singh";
			} else if (section.equals("b")) {
				faculty = "Mrs. Anushka sahu";
			} else if (section.equals("c")) {
				faculty = "Mrs. Amisha nagia";
			} else {
				System.out.println("Invalid class");
			}
			break;
		}
		default:
			System.out.println("Invalid input");

		}
	}

	public String toString() {
		return "Name:-" + first_name + " " + last_name + "\nGrade:-" + grade + "\nStudentID:-" + stu_id
				+ "\nCourse Enrolled:-" + course + "\nTution fees:-" + tutionfees + "\nExternal fees:-" + externalfees
				+ "\nActivity fees:-" + activity_fees + "\nPayment:-" + payment + "\nRemaning Amount:-" + remaningfees
				+ "\nPercentage Obtained:-" + marks + "\nRemark:-" + remark + "\nAttendence:-" + attendence
				+ "\nFaculty Name:-" + faculty;
	}

}
