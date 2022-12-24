package Shri_Sai_Hospital;
import java.util.LinkedList;
public class AppointmentBooking{
	
	static Shri_Sai ss=new Shri_Sai();//Object of Main class.
	static Admin a=new Admin();//Object of Admin class.
	static Patient p=new Patient();//Object of Patient class.
	static AppointmentBooking ab=new AppointmentBooking();
	
	//Declaration of LinkedLists for storing Doctors Details.
	
	public static LinkedList <String> DoctorName=new <String> LinkedList();
	public static LinkedList <String> DoctorSpecialization=new <String> LinkedList();
	public static LinkedList <Integer> DoctorAge=new LinkedList();
	public static LinkedList <String> DoctorAvailability=new <String> LinkedList();
	
	//Declaration of LinkedLists for storing Patients Details.
	
	public static LinkedList <String> PatientName=new <String> LinkedList();
	public static LinkedList <String> SelectedDoctor=new <String> LinkedList();
	public static LinkedList <Integer> PatientAge=new LinkedList();
	public static LinkedList <String> AppointmentDay=new <String> LinkedList();
	public static LinkedList <String> SelectedSlot=new <String> LinkedList();
	
	
	public static void Admin() {
		System.out.println("______________________________________________________");
		System.out.println("|           Welcome to Admin Panel                    |");
		System.out.println("|_____________________________________________________|");
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.println();
		String username="Ashu_Pawar";//Admin User Name.
		String password="ashu@183";//Admin Password.
		a.validate(username,password);//Calling validate() 
	}
	
	
	
	public void Patient() {
		System.out.println("______________________________________________________");
		System.out.println("|           Welcome to Patient Panel                  |");
		System.out.println("|_____________________________________________________|");
		System.out.println();
		p.patientActivity();
	}
	
}
