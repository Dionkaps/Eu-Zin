package Order_Checkout;
import java.util.*; 


public abstract class GymInfoPage{
	
	public static String gym_name ; 
	public static int gym_price; 
	public static String gym_addr ; 
	public static String gym_progr ; 
	public static String ans ; 
	
	public static Scanner sc = new Scanner(System.in);  // Create a Scanner object
	
	
	
	
	public static void showGymInfo() {
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		
		System.out.printf("Gym info page \n\n");
		
		System.out.printf("Information about %s:", gym_name);
		System.out.printf("\nGym's address: %s" ,gym_addr);
		System.out.printf("\nGym's available programs: %s", gym_progr);
		System.out.printf("\nGym's monthly subscription cost: %d€ ", gym_price);
	System.out.printf("\n\nWould you like to subscribe to %s? (Yes or No): ", gym_name);
		
	InsertSelection();
		
		
	}

	

	
	
public static void InsertSelection() {
	
	ans = sc.next();
	
	
	
	if(ans.equals("Yes"))
		
	{
SubscriptionPage.showSelectSub();

	}

	
	
	
	
	
	
	
	
	
	if(ans.equals("No"))

{

		Gym.getPrograms();

}
}

}
