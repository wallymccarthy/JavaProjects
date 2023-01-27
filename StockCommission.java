package stockcommission;
/******************************************************************************************
* Homework 5, Stock Commission
* Author: Walter McCarthy
* Project Purpose: Program to calculate the total amount paid to a 
*       stock broker upon buying shares of a stock including commission
* Input: None
* Desired Output: Show calculated totals from the purchase including commission
*       paid to broker
* Variables and Classes: There is one class, with the main method. 
*       It uses the System.out.println method.
* Formulas: primary variable is purchaseTotal, which is used to calculate the
*       variables comis and total.
* Testing: When the program is run, the totals will display correctly calculated
* January 17, 2023
**********************************************************************************************/
public class StockCommission {

    
    public static void main(String[] args) {
        //Declare variables, calculating each desired output variable
        final double stockprice = 25.5;
        double purchaseTotal = stockprice * 1000;
        double comis = purchaseTotal * 0.02;
        double total = purchaseTotal * 1.02;
        //Display totals
        System.out.println("Stock Purchase Total * (1000): $" + purchaseTotal);
        System.out.println("Commission total: $" + comis);
        System.out.println("Total Owed: $" + total);
        
    }
    
}
