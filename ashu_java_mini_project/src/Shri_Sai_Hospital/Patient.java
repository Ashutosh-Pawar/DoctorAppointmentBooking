package Shri_Sai_Hospital;

import java.util.LinkedList;

public class Patient extends Admin{
	public void patientActivity() {
		
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.println("Enter Your Name:");
		PatientName.add(sc.next());
		System.out.println("Enter Your Age");
		PatientAge.add(sc.nextInt());
		System.out.println();
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.println();
		System.out.println("Available Doctors: ");
		System.out.println(" 1.Prajwal Patil \t Aurthopedic \n 2.Samiksha Chavan \t Cardiologist \n 3.Tushar Phalke \t Anesthesiologists ");
		System.out.println();
		System.out.print("Please Select the Doctor:");
		int select=sc.nextInt();
		int counter=0;
		switch(select) {
		case 1:
			SelectedDoctor.add("Dr.Prajwal Patil");
			counter=1;
			break;
		case 2:
			SelectedDoctor.add("Dr.Samiksha Chavan");
			counter=2;
			break;
		case 3:
			SelectedDoctor.add("Dr.Tushar Phalke");
			counter=3;
			break;
		default:
			System.out.println("You Entered Wrong Choice");
			ss.mainActivity();
		}
		System.out.println("Days Of Appointment: ");
		System.out.println(" 1.Monday \n 2.TuesDay \n 3.WednesDay \n 4.ThursDay \n 5.FriDay \n 6.SaturDay");
		System.out.print("Select the Day of Appointment:");
		int salect=sc.nextInt();
		switch(select) {
		case 1:
			AppointmentDay.add("Monday");
			break;
		case 2:
			AppointmentDay.add("TuesDay");
			break;
		case 3:
			AppointmentDay.add("Wednesday");
			break;
		case 4:
			AppointmentDay.add("Thursday");
			break;
		case 5:
			AppointmentDay.add("Friday");
			break;
		case 6:
			AppointmentDay.add("Saturday");
			break;
		default:
			System.out.println("You Entered Wrong Choice");
			ss.mainActivity();
		}
		System.out.println();
		System.out.println("Time slots available: ");
		if(counter==1) {
			System.out.println(" 1. 08:00AM-09:00AM \n 2. 09:00AM-10:00AM \n 3. 10:00AM-11:00AM \n 4. 11:00AM-12:00PM \n 5.Main Menu");
			System.out.print("Select Time for Appointment:");
			int select1=sc.nextInt();
			switch(select1) {
			case 1:
				SelectedSlot.add("08:00AM-09:00AM");
				break;
			case 2:
				SelectedSlot.add("09:00AM-10:00AM");
				break;
			case 3:
				SelectedSlot.add("10:00AM-11:00AM");
				break;
			case 4:
				SelectedSlot.add("11:00AM-12:00PM");
				break;
			default:
				System.out.println("You Entered Wrong Choice.");
				ss.mainActivity();
			}
		}
		else if(counter==2) {
			System.out.println(" 1. 12:00PM-01:00PM \n 2. 01:00PM-02:00PM \n 3. 02:00PM-03:00PM \n 4. 03:00PM-04:00PM");
			System.out.print("Select Time for Appointment:");
			int select1=sc.nextInt();
			switch(select1) {
			case 1:
				SelectedSlot.add("12:00PM-01:00PM");
				break;
			case 2:
				SelectedSlot.add("01:00PM-02:00PM");
				break;
			case 3:
				SelectedSlot.add("02:00PM-03:00PM");
				break;
			case 4:
				SelectedSlot.add("03:00PM-04:00PM");
				break;
			default:
				System.out.println("You Entered Wrong Choice.");
				ss.mainActivity();
			}
		}
		else{
			System.out.println(" 1. 04:00PM-05:00PM \n 2. 05:00PM-06:00PM \n 3. 06:00PM-07:00PM \n 4. 07:00PM-08:00PM");
			System.out.print("Select Time for Appointment:");
			int select1=sc.nextInt();
			switch(select1) {
			case 1:
				SelectedSlot.add("04:00PM-05:00PM");
				break;
			case 2:
				SelectedSlot.add("05:00PM-06:00PM");
				break;
			case 3:
				SelectedSlot.add("06:00PM-07:00PM");
				break;
			case 4:
				SelectedSlot.add("07:00PM-08:00PM");
				break;
			default:
				System.out.println("You Entered Wrong Choice.");
				ss.mainActivity();
			}
		}
		System.out.println();
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.println();
		System.out.println("Thank You.... Your Appointment Has Been Booked Successfully....!!!");
		System.out.println();
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.println();
		System.out.println(" 1.Main Menu \n 2.Exit");
		System.out.print("Select The Action To Be Performed:");
		int select2;
		select2=sc.nextInt();
		switch(select2) {
		case 1:
			ss.mainActivity();
			break;
		case 2:
			System.exit(0);
		}
	}
}
