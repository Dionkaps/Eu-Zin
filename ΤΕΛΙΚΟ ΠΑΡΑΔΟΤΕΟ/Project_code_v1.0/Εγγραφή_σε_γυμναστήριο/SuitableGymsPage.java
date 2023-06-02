package Order_Checkout;
import java.util.*; 


public abstract class SuitableGymsPage{
	
	
	
	
	public static int suitable_gyms_counter = 0  ; 
	public static Gym SuitableGyms[] = new Gym[13];
	
	
	public static Scanner sc = new Scanner(System.in);  // Create a Scanner object
	public static int g_choice ; 
	public static String g_choice_s ; 
	public static int i = 0  ; 
	public static Gym selected_gym;
	public static void showSuitableGyms() {
		
		
		
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		
	System.out.printf("Suitable gyms page \n\n\n");
		System.out.println("Suitable gyms: ");
		
		for (i = 0 ; i < suitable_gyms_counter ; i++)
		{
			System.out.printf("\n%d)%s",i+1,SuitableGyms[i].gymName);
			
		}
		
		
		System.out.printf("\n\n\nSelect a gym: ");
		
	select_gym();
	
	}
	
	
	
	
	public static void select_gym() {
		
		g_choice = sc.nextInt();
		g_choice_s = SuitableGyms[g_choice - 1].gymName;
		
		
		for(int z = 0 ; z <suitable_gyms_counter ; z++)
		{
			if(g_choice_s.equals(SuitableGyms[z].gymName))
			{
				selected_gym = SuitableGyms[z];
			}
			
		}
		
		
		Gym.getGymInfo(selected_gym);
	}
	
	
	
	
}



