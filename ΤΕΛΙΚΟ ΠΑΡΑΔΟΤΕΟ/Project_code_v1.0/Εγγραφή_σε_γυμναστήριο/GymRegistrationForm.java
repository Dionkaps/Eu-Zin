package Order_Checkout;
import java.util.*; 


public abstract class GymRegistrationForm{
	
	public static String name ;
	public static String surname;
	public static String age;
	public static String address;
	public static String gender;
	public static int i_age;
	public static int error_name = 0 , error_surname = 0 , error_addr = 0 , error_gender = 0 , error_age = 0 ; 
	public static String dur ;
	
	
	
	
	
	
	public static void checkData() {
		error_name = 0 ;
		error_surname = 0 ;
		error_addr = 0; 
		error_gender = 0 ; 
		error_age = 0 ;
		
		if(name.length() > 20)
		{
			error_name = 1 ;
		}
		
		if(surname.length()>20)
		{
			error_surname = 1; 
		}
		
		if(address.length()>25)
		{
			error_addr = 1; 
		}
		
		if(!gender.equals("Male")&&!gender.equals("Female") )
		{
			error_gender = 1; 
		}
		
		
		
		if (age.matches("[0-9]+"))
				
				{
			
		i_age = Integer.parseInt(age);
		
		
		if((i_age < 4) ||(i_age > 79) )
			
		{
			error_age = 1; 
		}
			
			
				}
		
		
		
		else if (!(age.matches("[0-9]+")))
		{
			error_age = 1; 
		}
	
		
		
		
	
	if ((error_age == 0) && (error_addr == 0) && (error_gender == 0) && (error_name == 0) && (error_surname == 0))
	{
		
		showCompletion();
		
	}
	
	else
	{
		
		showError();
	}
	
	
}
	
	
	
	public static void showCompletion() {
		
		if(SubscriptionPage.dur_choice == 1)
		{
			
			dur = "One week" ; 
		}
			
		if(SubscriptionPage.dur_choice == 2)
		{
			
			dur = "One month" ; 
		}
		if(SubscriptionPage.dur_choice == 3)
		{
			
			dur = "One year" ; 
		}
		
			
		System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.printf("You have successfully subscribed to %s with the following personal data: \n\n", GymInfoPage.gym_name);
		System.out.printf("\nName: %s ", name);
		System.out.printf("\nSurname: %s ", surname);
		System.out.printf("\nAge: %s" , age);
			System.out.printf("\nAddress: %s", address);
				System.out.printf("\nGender: %s" , gender);
				System.out.printf("\nSubscription's duration: %s ", dur);

		//epilogh gia menu 
	}
	
	
	
	
	public static void showError()
	
	{
		System.out.printf("The data given are not valid. Please insert the  requested personal information again.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GymUserInfo.showUserInfo();
		
	}
}
