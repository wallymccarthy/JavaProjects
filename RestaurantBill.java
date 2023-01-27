
package restaurantbill;

/******************************************************************************************
* Homework 4, Restaurant Bill
* Author: Walter McCarthy
* Project Purpose: Program to calculate the total bill from a meal
*       including the tax and tip
* Input: The program accepts input via scanner.next()
* Desired Output: The program displays the subtotal, calculated tax,
*       calculated tip, and total Bill
* Variables and Classes: There is one class, with the main method.
*       The primary value is charge, which holds user prompted input
* Formulas: The variable charge is multiplied with tax and tipPercent to 
*       calculate totalTax and tip respectively
*           totalBill is the sum of tip, totalTax, and charge
* Testing: When the program is run with inputs, the totals are
*       calculated correctly and displayed
* January 17, 2023
**********************************************************************************************/
import java.util.Scanner;

public class RestaurantBill {

    public static void main(String[] args) {
        //Setting up variables to calculate bill
        final double tax = 0.075;
        final double tipPercent = 0.18;
        double tip = 0;
        double totalTax = 0;
        double totalBill = 0;
        double charge;
        
        //Scanner class used for user input
        Scanner keyboard = new Scanner(System.in);
        //Prompt user for input, then accept it
        System.out.print("Enter the subtotal of the bill: ");
        charge = keyboard.nextDouble();
        
        //Calculate tip, tax, and total Bill
        tip = charge * tipPercent;
        totalTax = charge * tax;
        totalBill = charge + totalTax + tip;
        //Output the final calculated values
        System.out.println("Subtotal: $" + charge);
        System.out.println("Tax: $" + totalTax);
        System.out.println("Tip: $" + tip);
        System.out.println("Total: $" + totalBill);
        
    }
    
}
