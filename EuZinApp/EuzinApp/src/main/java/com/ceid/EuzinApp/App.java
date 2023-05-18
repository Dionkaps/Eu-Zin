package com.ceid.EuzinApp;

import java.util.concurrent.ExecutionException;

import services.CaloriesBurnedApi;
import services.FirebaseInit;
import services.FirebaseService;
import services.NutritionApi;
import services.ReadUserData;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException, ExecutionException
    {
    	FirebaseInit.initialize();
        CaloriesBurnedApi.fetch("ski");
        NutritionApi.fetch("256g potato");
        FirebaseService.saveUserDetails("Dionkaps");
        System.out.println();
        ReadUserData.readAllUserData();
    }
}
