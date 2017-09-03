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
                System.out.println("The gratuity is: $" + gratuity + " and the total is: $" + total);

            }
        }
    }
}
