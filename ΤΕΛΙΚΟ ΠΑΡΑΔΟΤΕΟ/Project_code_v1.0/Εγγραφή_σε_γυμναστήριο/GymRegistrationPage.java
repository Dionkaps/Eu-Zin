package Order_Checkout;
import java.util.*; 


public abstract class GymRegistrationPage{
	
	public static String[] ProgramsFetched = new String[5];  	
	public static int choice ; 
	
	public static Scanner sc = new Scanner(System.in);  // Create a Scanner object
	
	
	
	
public static void main(String[] args) {
	//create gyms
	
	
	
	
	
	
	
		Gym.gym_array[0] = new Gym("Yava", "Weights" , "Korinthou 17", 25);
		Gym.gym_array[1] = new Gym("FitPlan", "Weights" , "Karaiskaki 32", 35);
		Gym.gym_array[2] = new Gym("TopForm", "Weights" , "Katerinis 16", 30);
		
		Gym.gym_array[3] = new Gym("Dolph", "Swimming" , "Miaouli 117", 40);
		Gym.gym_array[4]= new Gym("DiveNGo", "Swimming" , "Votsi 12", 45);
		
		Gym.gym_array[5] = new Gym("SofiasClub", "Group dancing" , "Korinthou 157", 20);
		Gym.gym_array[6] = new Gym("IntenseD", "Group dancing" , "Votsi 157", 23);
		Gym.gym_array[7] = new Gym("PowerUp", "Group dancing" , "Diakou 157", 35);
		
		
		
		Gym.gym_array[8] = new Gym("NatureFitness", "Group running" , "Korinthou 100", 35);
		Gym.gym_array[9] = new Gym("RunCity", "Group running" , "Mezonos 38", 45);
		
		Gym.gym_array[10] = new Gym("BeastCity ", "TRX" , "Korinthou 169", 35);
		Gym.gym_array[11] = new Gym("NonStop", "TRX" , "Papanikolaou 190", 25);
		Gym.gym_array[12] = new Gym("FitCity", "TRX" , "Ag.Nikolaou 6", 50);
		
		
		
		
		

Gym.getPrograms();


}
	
	
	
	
	




public static void showRegPage() {
	
	
	
	System.out.println("Gym registration page");
	System.out.printf("\n\n");
	System.out.println("Gym programs: ");
	
	
	
	//print the programs
	for(int i = 0 ; i <5 ; i++) {
					
		System.out.printf("\n%d)%s",i+1,ProgramsFetched[i]);
				
	}
	
	System.out.printf("\n\n\n");
	
	System.out.printf("Select a program: ");
	

	

	select_progr();
	

	
	
	
	
}







public static void select_progr() {
	
	//The user selects a program
	
	
	choice = sc.nextInt();	
	
	Gym.getSuitableGyms();
	
}


}




