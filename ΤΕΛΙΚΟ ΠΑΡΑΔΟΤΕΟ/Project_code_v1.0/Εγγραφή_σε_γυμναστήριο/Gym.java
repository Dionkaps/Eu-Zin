package Order_Checkout;
import java.util.*; 



public  class Gym{
	
	
	//set the available programs
	public static String[] Programs = {"Swimming","Weights","Group dancing","TRX","Group running"} ;  	
  
  
  
	//gym info
	public String gymName; 
	public String gymProgram; 
	public String gymAddress; 
	public int gymPrice; 
	public static Gym gym_array[] = new Gym[13];
	public static String cho ; 

	
	
	
	//Gym constructor
	public Gym(String name, String progr, String addr, int price){
		
		
		this.gymName = name; 
		this.gymProgram = progr;
		this.gymAddress = addr;
		this.gymPrice = price ; 
		
		
	}
	
	
	
	

	
	
	
	
	
	
	






public static  void getPrograms() {
	
	
	
//GymRegistrationPage fetches the programs
	GymRegistrationPage.ProgramsFetched[0] = Programs[0];
	GymRegistrationPage.ProgramsFetched[1]= Programs[1];
	GymRegistrationPage.ProgramsFetched[2]=Programs[2];
	GymRegistrationPage.ProgramsFetched[3]=Programs[3];
	GymRegistrationPage.ProgramsFetched[4]=Programs[4];
	
	GymRegistrationPage.showRegPage() ; 
	
}





public static void getSuitableGyms() {
	
	
	SuitableGymsPage.suitable_gyms_counter = 0 ;
	
	
	
	//get suitable gyms
	
		if(GymRegistrationPage.choice == 1)
		{
			cho = "Swimming";
		}
		
		else if(GymRegistrationPage.choice == 2)
		{
			
			cho = "Weights";
		}
		
		
		else if(GymRegistrationPage.choice == 3)
		{
			
			cho = "Group dancing";
		}
		
		
		else if(GymRegistrationPage.choice == 4)
		{
			
			cho = "TRX";
		}
		
		
		
		
		else if(GymRegistrationPage.choice == 5)
		{
			
			cho = "Group running";
		}
		
		
		
	
	
	
	for(int j=0 ; j <13 ; j++)
		
	{
		
		if(cho.equals(gym_array[j].gymProgram))
		{
			
			SuitableGymsPage.SuitableGyms[SuitableGymsPage.suitable_gyms_counter] = gym_array[j];
			SuitableGymsPage.suitable_gyms_counter = SuitableGymsPage.suitable_gyms_counter + 1 ;
		 
			
		}
		
	}
	

	SuitableGymsPage.showSuitableGyms();

}	


public static void getGymInfo(Gym g) {

GymInfoPage.gym_addr = g.gymAddress;
GymInfoPage.gym_name = g.gymName;
GymInfoPage.gym_price = g.gymPrice;
GymInfoPage.gym_progr = g.gymProgram;


GymInfoPage.showGymInfo();
}

}


