package Order_Checkout;
import java.util.*; 


public abstract class GymUserInfo{
	
	
	
	public static Scanner sc = new Scanner(System.in);  // Create a Scanner object
	
	
	
	
	
	
	
	public static void showUserInfo() {
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		
		System.out.printf("Gym user info page \n\n");
		
	
		System.out.printf("Please insert the following requested personal information: ");
		
			InsertUserData();
		
	}


	
	
	
	

public static void InsertUserData() {
	
	
	System.out.printf("\nName: ");
	GymRegistrationForm.name = sc.nextLine();
	System.out.printf("Surname: ");
	GymRegistrationForm.surname = sc.nextLine();
	System.out.printf("Age (4-79): ");
	GymRegistrationForm.age = sc.nextLine();
	System.out.printf("Address: ");
	GymRegistrationForm.address = sc.nextLine();
	System.out.printf("Gender (Male or Female): ");
	GymRegistrationForm.gender = sc.nextLine();

	
	GymRegistrationForm.checkData();
	
	
	
	
	
}

	
}