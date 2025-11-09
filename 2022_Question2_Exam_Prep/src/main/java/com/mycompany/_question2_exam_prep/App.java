/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._question2_exam_prep;

/**
 *
 * @author kalis
 */
public class App {

    public static void main(String[] args) {
        //1D Array for province
        String[] province = {"Gauteng", "Natal", "Cape"};
        
        //1D Array for property
        String[] propertyType = {"FLAT", "TOWN HOUSE", "HOUSE"};
        
        //2D Array for prices of different properties in various provinces
        int[][] prices = {{800000, 1500000, 2000000},
                          {700000, 1200000, 1600000},
                          {750000, 1300000, 1800000}};
        
    display(province, propertyType, prices); //Calling display method   
    }
    
    public static void display(String[] province, String[] propertyType, int[][] prices){
        //Displaying property type headings from array
        System.out.print("\t\t");
        for (int i = 0; i < propertyType.length; i++) {
           System.out.print(propertyType[i] + "\t\t"); 
        }
        System.out.println("\n" + "-".repeat(72));
        
        //displaying the provinces from array
        for (int i = 0; i < province.length; i++) {
            System.out.print(province[i]);
            //Displaying the prices 
            for (int j = 0; j < prices.length; j++) {
                System.out.print("\t\t" + "R " + prices[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        
        //Calculating the average price of properties in each province
        for (int i = 0; i < province.length; i++) {
            double total = 0;
            for (int j = 0; j < propertyType.length; j++) {
                total += prices[i][j];
            }
            double average = (total / propertyType.length);
            //Displaying the average prices
            System.out.println("Average property prices in " + province[i] + 
                " = R " + average);
        }
    }
}
