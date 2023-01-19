
package salesprediction;
/******************************************************************************************
* Homework 3, Sales Prediction
* Author: Walter McCarthy
* Project Purpose: To output Company Sales, and what percentage the East Coast Division contributed
* Input: None
* Desired Output: An output detailing Company Sales, the percentage the East Coast Division contributed,
*   and monetarily
* Variables and Classes: There is one class, with the main method. It uses the System.out.println method.
* Formulas: the primary variables are totalSales, eastCoastSales, and eastCoastPercent
* Testing: When the program is run, the console displays the correct totals
* January 10, 2023
**********************************************************************************************/
public class SalesPrediction {
    
    public static void main(String[] args) {
        double totalSales = 8300000;
        double eastCoastPercent = 0.65;
        double eastCoastSales = 0;
        
        eastCoastSales = totalSales * eastCoastPercent;
        
        System.out.println("Company Total Sales: $" + totalSales);
        System.out.println("East Coast Division Sales: $" + eastCoastSales);
    }
    
}
