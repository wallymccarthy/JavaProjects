
package nameageincome;
/******************************************************************************************
* Homework 2, Programming with Java
* Author: Walter McCarthy
* Project Purpose: Program declares several variables, the displays them in a single
*   concatenated string
* Input: None
* Desired Output: Concatenated string that reads "My name is (name), my age is (age),
*   and I hope to earn (annualPay)"
* Variables and Classes:  There is one class, with the main method. It uses the System.out.println method
*   The main variables are name, age, and annualPay
* Formulas: 
* Testing: When the program is run, the desired message is displayed correctly in the console
* January 10, 2023
**********************************************************************************************/
public class NameAgeIncome {
    public static void main(String[] args) {
        String name = "Walter McCarthy";
        int age = 31;
        double annualPay = 300000;
        
        System.out.print("My name is ");
        System.out.print(name);
        System.out.print(", my age is ");
        System.out.print(age);
        System.out.print(" and I hope to earn $");
        System.out.print(annualPay);
        System.out.print(" per year.\n");
    }
    
}
