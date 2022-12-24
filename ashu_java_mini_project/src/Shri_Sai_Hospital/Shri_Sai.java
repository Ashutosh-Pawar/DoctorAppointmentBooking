package Shri_Sai_Hospital;
import java.util.Scanner;

public class Shri_Sai {
	
	//Main method of the project
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\t ______________________________");
		System.out.println("\t|                              |");
		System.out.println("\t| Welcome To Shri Sai Hospital |");
		System.out.println("\t|______________________________|");
		
		mainActivity();//Calling Main Activity to select user type.
	}
	static void mainActivity() {		//Here users will select their user type. 
		AppointmentBooking ap=new AppointmentBooking();
		Scanner sc=new Scanner(System.in);
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.println();
		System.out.println("1.Admin \t 2.Patient \t 3.Exit");
		System.out.println();
		System.out.print("Please Enter your user type:");
		int select=sc.nextInt();
		switch(select) {
		case 1:
			ap.Admin();//calling Admin method from AppointmentBooking class.
			break;
		
		case 2:
			ap.Patient();//calling Patient method from AppointmentBooking class.
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("You Entered wrong choice.");
			System.exit(0);
		}
	}
}

