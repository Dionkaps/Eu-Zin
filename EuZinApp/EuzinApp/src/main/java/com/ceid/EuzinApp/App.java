package com.ceid.EuzinApp;

import services.CaloriesBurnedApi;
import services.NutritionApi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CaloriesBurnedApi.fetch("ski");
        NutritionApi.fetch("100g potato");
    }
}
