
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will collect information in calling time for daytime, evening, and weekend
        // using the two plans given, 
        // the program will calculate the total cost and determine the cheaper plan
        
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // ask the number of daytime minutes and collect the information
        System.out.print("Number of daytime minutes? ");
        double callingDaytime = input.nextDouble();
        
        // ask the number of evening minutes and collect the information
        System.out.print("Number of evening minutes? ");
        double callingEvening = input.nextDouble();
        
        // ask the number of weekend minutes and collect the information
        System.out.print("Number of weekend minutes? ");
        double callingWeekend = input.nextDouble();
        
        // create a varaible for the cost of plan a daytime
        double planADaytime;
        // if the daytime calling is greater than 100 minutes than there will be a cost
        if (callingDaytime > 100.0){
            // free 100 minutes and then 25 cents after that
            planADaytime = (callingDaytime - 100.0) * 0.25;
        // if the daytime calling is less than 100 minutes than there will be no cost
        } else{
            planADaytime = 0; 
        }
        // create a variable for the cost of plan a evening
        double planAEvening = callingEvening * 0.15;
        // create a variable for plan a weekend
        double planAWeekend = callingWeekend * 0.20;
        // determine the total cost of plan a
        double planATotal = planADaytime + planAEvening + planAWeekend;
        // round the plan A total to two decimal places and display
        planATotal = Math.round(planATotal * 100) / 100.0;
        System.out.println("Plan A costs " + planATotal);
        
        // create a variable for the cost of plan b daytime
        double planBDaytime;
        // if the daytime calling is greater than 250 minutes than there will be a cost
        if (callingDaytime > 250.0){
            // free 250 minutes and then 45 cents after that
            planBDaytime = (callingDaytime - 250.0) * 0.45;
        // if the daytime calling is less than 250 minutes than there will be no cost 
        } else {
            planBDaytime = 0;
        }
        // create a variable for the cost of plan b evening
        double planBEvening = callingEvening * 0.35;
        // create a varibale for the cost of plan b weekend
        double planBWeekend = callingWeekend * 0.25;
        // determine the total cost of plan b
        double planBTotal = planBDaytime + planBEvening + planBWeekend;
        // round the plan B total to two decimal places and display
        planBTotal = Math.round(planBTotal * 100) / 100.0;
        System.out.println("Plan B costs " + planBTotal);
        
        // if plan a total is less than plan b total determine that plan a is cheapest and diplay
        if(planATotal < planBTotal){
            System.out.println("Plan A is cheapest.");
        // if plan b total is less than plan a total determine that plan b is cheapest and display
        } else if (planBTotal < planATotal){
            System.out.println("Plan B is cheapest.");
        // if plan a total is the same amount as plan b total determine than they are the smame and display
        } else {
            System.out.println("Plan A and B are the same price.");
        }
        // close input scanner
        input.close();
    }
    
}
