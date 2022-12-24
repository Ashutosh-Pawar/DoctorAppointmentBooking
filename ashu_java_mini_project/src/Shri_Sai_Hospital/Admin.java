package Shri_Sai_Hospital;
import java.util.LinkedList;
import java.util.Scanner;


public class Admin extends AppointmentBooking{
	static Scanner sc=new Scanner(System.in);
	static AppointmentBooking ab=new AppointmentBooking();
	static Shri_Sai ss=new Shri_Sai();
	private static int flag;


	static boolean validate(String username,String password){
		System.out.println();
		System.out.print("Enter user name:");
		String s=sc.nextLine();
		System.out.print("Enter Password:");
		String s1=sc.nextLine();
		if(s.equals(username) && s1.equals(password)) {
			System.out.println();
			System.out.println("Login Successful.");
			System.out.println();
			AllDetails();
			adminActivity();
			return true;
		}
		else {
			System.out.println("Invalid Login Credientials.");
			validate(username, password);
			return false;
			
		}
	}
	public static void AllDetails() {
		
		// Default Doctors Records.
		
		DoctorName.add("Dr.Prajwal Patil");
		DoctorSpecialization.add("Orthopedic      ");
		DoctorAge.add(30);
		DoctorAvailability.add("08:00AM-12:00PM");
		 
		DoctorName.add("Dr.Samiksha Chavan");
		DoctorSpecialization.add("Cardiologist    ");
		DoctorAge.add(28);
		DoctorAvailability.add("12:00PM-04:00PM");
		
		DoctorName.add("Dr.Tushar Phalke");
		DoctorSpecialization.add("Anesthesiologist");
		DoctorAge.add(32);
		DoctorAvailability.add("04:00PM-08:00PM");
		
		//Default Patient Records
		
		PatientName.add("Govind Shrimangale");
		SelectedDoctor.add("Dr.Prajwal Patil");
		PatientAge.add(24);
		AppointmentDay.add("Monday");
		SelectedSlot.add("09:00AM-10:00AM");
		
		PatientName.add("Deempal Kumari   ");
		SelectedDoctor.add("Dr.Samiksha Chavan");
		PatientAge.add(24);
		AppointmentDay.add("Friday");
		SelectedSlot.add("01:00PM-02:00PM");
		
		PatientName.add("Sai Gaikwad      ");
		SelectedDoctor.add("Dr.Tushar Phalke");
		PatientAge.add(24);
		AppointmentDay.add("Tuesday");
		SelectedSlot.add("07:00PM-08:00AM");
	
	}
	public static void adminActivity() {
		
		
		int select;
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.println();
		System.out.println(" 1.viewDoctors \n 2.viewPatients \n 3.viewAppointments \n 4.updateDoctor \n 5.updatePatients \n 6.Main Menu");
		System.out.println();
		System.out.print("Select the action to be performed: ");
		select=sc.nextInt();
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.println();
		
		switch(select) {
		case 1:
			viewDoctors();
			break;
		case 2:
			viewPatients();
			break;
		case 3:
			viewAppointments();
			break;
		case 4:
			updateDoctor();
			break;
		case 5:
			updatePatients();
			break;
		case 6:
			ss.mainActivity();		
			
		default:
			System.out.println("You Entered wrong choice.");
			System.exit(0);
		
		}
		
	}
	public static void viewDoctors() {

		
		System.out.println("    Doctor Name \t\t       Specialization \t\t       Age      \t Aailable Time");
		for(int i=0;i<DoctorName.size();i++) {
			System.out.println(i+1 + " " + DoctorName.get(i) +"\t\t\t" + DoctorSpecialization.get(i) + "\t\t" +    DoctorAge.get(i) + "\t\t" +DoctorAvailability.get(i));
		}
		
		int select;
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.println();
		System.out.print("Press 1 For Main Menu:");
		select=sc.nextInt();
		System.out.println();
		switch(select) {
			case 1:
				adminActivity();
		}
		
	}
	static void viewPatients() {
		
		System.out.println(" Patient Name \t\t\t Selected Doctor \t Patient Age \t\t AppointmentDay \t\t SelectedSlot");
		
		for(int i=0;i<PatientName.size();i++) {
			System.out.println(i+1 + " " + PatientName.get(i) + "\t\t" + SelectedDoctor.get(i) + "\t\t" +    PatientAge.get(i) + "\t\t\t" + AppointmentDay.get(i) + "\t\t\t" +SelectedSlot.get(i));
		}
		int select;
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.println();
		System.out.print("Press 1 For Main Menu:");
		select=sc.nextInt();
		System.out.println();
		switch(select) {
			case 1:
				adminActivity();
		}
		
	}
		
	static void viewAppointments() {
		System.out.println(" Patient Name \t\t\t   Selected Doctor \t\t   SelectedSlot");
		for(int i=0;i<PatientName.size();i++) {
			System.out.println(i+1 + " " + PatientName.get(i) +"\t\t\t" + SelectedDoctor.get(i) + "\t\t"  +SelectedSlot.get(i));
		}
		int select;
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.println();
		System.out.print("Press 1 For Main Menu:");
		select=sc.nextInt();
		System.out.println();
		switch(select) {
			case 1:
				adminActivity();
		}
	}
	public static void updateDoctor() {
		
		System.out.println(" 1.Add Doctor \t 2.Remove Doctor \t 3.Main Menu");
		System.out.println();
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.println();
		System.out.print("Select the Action to be performed:");
		int select;
		select=sc.nextInt();
		switch(select) {
		case 1:
			System.out.print("Enter Doctor Name:");
			DoctorName.add(sc.next());

			System.out.print("Enter Doctor Specialization:");
			DoctorSpecialization.add(sc.next());
			
			System.out.print("Enter Doctor Age:");
			DoctorAge.add(sc.nextInt());
			
			System.out.print("Enter Doctor Available Time:");
			DoctorAvailability.add(sc.next());
			
			System.out.println();
			System.out.println("Doctor Added Successfully!");
			int select2;
			System.out.println();
			System.out.print("Press 1 For Main Menu:");
			select2=sc.nextInt();
			System.out.println();
			switch(select2) {
				case 1:
					adminActivity();
			}
			break;
		case 2:
			String s=new String();
			System.out.print("Enter the name of doctor which you want to remove:");
			sc.nextLine();
			s=sc.nextLine();
			for(int i=0;i<DoctorName.size();i++) {
				if(s==DoctorName.get(i)) {
					flag=i;
					DoctorName.remove(i);
				}
			}
			
			for(int i=0;i<DoctorSpecialization.size();i++) {
				if(i==flag) {
					DoctorSpecialization.remove(i);
				}
			}
			for(int i=0;i<DoctorAge.size();i++) {
				if(i==flag) {
					DoctorAge.remove(i);
					System.out.println("Doctor Removed Successfully.");
				}
			}
			int select3;
			System.out.println("_________________________________________________________________________________________________________________________________");
			System.out.println();
			System.out.print("Press 1 For Main Menu:");
			select3=sc.nextInt();
			System.out.println();
			switch(select3) {
				case 1:
					adminActivity();
			}
			break;
		case 3:
			adminActivity();
			break;
		default:
			System.out.println("You Entered Wrong Choice");
			System.exit(0);
		}
		
	}
	static void updatePatients() {
		int select;
		System.out.println("Which Action You Want To Perform:");
		System.out.println();
		System.out.println(" 1. Add Patient \n 2. Remove Patient\n 3.Main menu ");
		System.out.println();
		System.out.print("Select The Action To Be Performed:");
		select=sc.nextInt();
		System.out.println();
		switch(select){
			case 1:
				System.out.print("Enter Patient Name:");
				sc.nextLine();
				PatientName.add(sc.next());
				sc.nextLine();
				
				System.out.print("Enter Doctor Name:");
				String name=sc.nextLine();
				SelectedDoctor.add(name);
				
				System.out.print("Enter Patient Age:");
				PatientAge.add(sc.nextInt());
				
				System.out.print("Enter Time Slot:");
				sc.nextLine();
				SelectedSlot.add(sc.next());
				sc.nextLine();
				
				System.out.println();
				System.out.println("Patient Added Successfully....");
				System.out.println();
				int select4;
				System.out.println("_________________________________________________________________________________________________________________________________");
				System.out.println();
				System.out.print("Press 1 For Main Menu:");
				select4=sc.nextInt();
				System.out.println();
				switch(select4) {
					case 1:
						adminActivity();
				}
				break;
			case 2:
				System.out.print("Enter the name of patient which you want to remove:");
				sc.nextLine();
				String s=sc.nextLine();
				for(int i=0;i<PatientName.size();i++) {
					if(s==PatientName.get(i)) {
						flag=i;
						PatientName.remove(i);
					}
				}
				
				for(int i=0;i<SelectedDoctor.size();i++) {
					if(i==flag) {
						SelectedDoctor.remove(i);
					}
				}
				for(int i=0;i<PatientAge.size();i++) {
					if(i==flag) {
						PatientAge.remove(i);
					}
				}
				for(int i=0;i<SelectedSlot.size();i++) {
					if(i==flag) {
						SelectedSlot.remove(i);
						System.out.println("Patient Removed Successfully.");
					}
				}
				int select5;
				System.out.println("_________________________________________________________________________________________________________________________________");
				System.out.println();
				System.out.print("Press 1 For Main Menu:");
				select5=sc.nextInt();
				System.out.println();
				switch(select5) {
					case 1:
						adminActivity();
				}
			case 3:
				adminActivity();
				break;
		}
	}
	
}
