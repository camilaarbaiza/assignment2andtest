/*
   Author: Camila Arbaiza

   Date: 09/03/2017

   Problem 2.5

   The purpose of this program is to calculate tips

 */

import java.util.Scanner;

public class Assignment2 {


    public static void main(String[] args) {


        double subtotal;   // subtotal entered by the user

        double rate;       // percentage rate of the gratuity

        double gratuity;   // gratuity calculate

        double total;      // total calculated by adding subtotal + gratuity

        Scanner input = new Scanner(System.in);

        //Get user input for subtotal
        System.out.println("Enter subtotal: ");
        subtotal = input.nextDouble();


        //if statement for invalid user input
        if(subtotal < 0.0){
            System.out.println("Invalid value for subtotal");
        }

        else {
            System.out.println("Enter gratuity rate: ");
            rate = input.nextDouble();

            if(rate < 0.0){
                System.out.println("Invalid value for gratuity rate");

            }
            else {
                gratuity = (rate / 100) * subtotal;

                // calculations
                total = subtotal + gratuity;

                //Print out output
                System.out.printf("The gratuity is: $%.2f", gratuity);
                System.out.printf(" and the total is: $%.2f",total);

            }
        }
    }

    /**
     * Method to test with Junit
     * The displayTipsAndTotal method calculates the gratuity and the total
     * @param x  subtotal entered
     * @param y  rate of gratuity
     * @return   String that displays the gratutity and total
     */
    public static String displayTipsAndTotal(double x, int y){

        double g = 0;
        double t = 0;

            g = ((double)y / 100) * x;

            // calculations
            t = x + g;

   return("The gratuity is: $"+g+" and the total is: $" +t); }

}
