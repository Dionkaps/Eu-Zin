package com.ceid.EuzinApp;

import java.util.ArrayList;
import java.util.Map;

public class MyAppointmentPage {

	public static void showMyAppointPage() {
		User user = EuZin.testUser;
		ArrayList<Map<String, String>> appointmentData = new ArrayList<>();
		
		appointmentData = user.appointmentData;
		
		System.out.println("\n~~My Appointments~~\n");
		
		for (Map<String, String> appointment : appointmentData) {
            for (Map.Entry<String, String> entry : appointment.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println(key + value);
            }
            System.out.println();
        }
		
	}
	
}
