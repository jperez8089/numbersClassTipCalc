package com.example.java;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Usin the Scanner so we can get user input
        Scanner sc = new Scanner(System.in);
        //By declaring the sum of the user input to 0, we know it has no value so it aids in adding user input

        double sum  = 0;

        // The do while loop helps with having it repeat until the user input is 0, which will stop.
        do{
            System.out.println("Please enter the cost of item. Hit 0 to end: ");
            double userInputCosts = sc.nextDouble();//This makes sure that we have a user input variable taken as a double
            if (userInputCosts == 0){ // If the user input is equal to 0
                break; // stop the program if 0 is pressed
            } else {
                sum += userInputCosts; //otherwise keep adding the user input
            }
        } while(true);// repeat as long as it is true

        sum = Math.round(sum * 100.0) / 100.0; //Rounding the sum

        System.out.println("Your subtotal is: $" + sum); //printing result
        System.out.println(" ");

        double totalTax = sum * .025;
        totalTax = Math.round(totalTax * 100.0) / 100.0;

        System.out.println("Total tax for your total is: $" + totalTax);
        System.out.println(" ");


        double totalCostWithTax = sum + totalTax;
        totalCostWithTax = Math.round(totalCostWithTax * 100.0)/ 100.0;

        System.out.println("Your total with tax is : $" + totalCostWithTax);
        System.out.println(" ");

        //The option of recommending the tip and asking the user to enter a character if they desire to do so.

        System.out.println("Would you like add a tip?(Recommended 17.5%) Hit uppercase 'Y' for 'Yes' or uppercase 'N' for 'No' ");

        double totalTip = totalCostWithTax * 0.175;
        totalTip = Math.round(totalTip * 100.0)/100.0;

        double totalCostTip = totalCostWithTax + totalTip;
        totalCostTip = Math.round(totalCostTip * 100.0) / 100.0;





        String response = sc.next();

        if(response.equals("Y")){ // if the user presses "y"
            System.out.println("Your total is $" + totalCostTip); //print out total with tip
        } else if (response.equals("N")) { // otherwise
            System.out.println("Your total is $" + totalCostWithTax); //print total with tax and without the tip
        }




    }

}