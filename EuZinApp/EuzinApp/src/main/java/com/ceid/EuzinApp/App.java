package com.ceid.EuzinApp;

import java.util.concurrent.ExecutionException;

import services.CaloriesBurnedApi;
import services.FirebaseInit;
import services.NutritionApi;
import services.ReadPostData;

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
        //FirebaseService.savePostDetails("Sample Title", "John Doe",3,0);
        System.out.println();
        ReadPostData.readAllPostData();
    }
}
