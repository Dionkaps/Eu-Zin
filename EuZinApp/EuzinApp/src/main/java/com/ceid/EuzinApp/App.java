package com.ceid.EuzinApp;

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
