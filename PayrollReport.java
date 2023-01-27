
package payrollreport;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/******************************************************************************************
* Homework 7, Payroll Report
* Author: Walter McCarthy
* Project Purpose: Program to input employee ID and payment info to calculate net pay
* Input: This program accepts input via JOptionPane, and records data to file EmployeeRecord.txt
* Desired Output: The program reads the file EmployeeRecord.txt and displays
*       Employee payroll
* Variables and Classes: There is one class, with the main method. It uses the System.out.println method.
*       The declared variables temporarily hold the current employees record as
*       its recorded into the file
* Formulas: the primary variable grossPay, which all others go off of
* Testing: When the program is run with inputs, the console correctly
*       displays employee records with no issues.
*       Any inputs that don't work bring up an error message
* January 26, 2023
**********************************************************************************************/
public class PayrollReport {

    public static void main(String[] args) throws IOException  {
        //Declare variables
        int employeeID;
        String eName;
        double grossPay, stateTx,fedTx, ficaWH, netPay;
        
        FileWriter fwriter = new FileWriter("EmployeeRecord.txt", true);
        var outputFile = new PrintWriter(fwriter);
        
        //Loop that creates file and records input
        do
        {
            //Gather Employee Name and ID Number
            employeeID = Integer.parseInt(JOptionPane.showInputDialog("Enter Employee Number (To quit, enter 0)"));
            if (employeeID != 0)
            {
                outputFile.println(employeeID);
                eName = JOptionPane.showInputDialog("Enter Employee's Name");
                outputFile.println(eName);
                //Loop to gather grossPay and validate input
                do
                {
                    grossPay = Double.parseDouble(JOptionPane.showInputDialog("Enter Employees Gross Pay" ));
                    if (grossPay > 0)
                        outputFile.println(grossPay);
                    else
                        JOptionPane.showMessageDialog(null, "Please enter a valid amount",
                                "Uh Oh!", JOptionPane.ERROR_MESSAGE);
                }while (grossPay <= 0);
                //Loop to gather stateTx and validate input
                do
                {
                    stateTx = Double.parseDouble(JOptionPane.showInputDialog("Enter Employees State Tax (Must not be more than gross Pay)"));
                    if (stateTx > 0 && stateTx < grossPay)
                        outputFile.println(stateTx);
                    else
                        JOptionPane.showMessageDialog(null, "Please enter a valid amount",
                                "Uh Oh!", JOptionPane.ERROR_MESSAGE);
                }while (stateTx <= 0 || stateTx > grossPay);
                //Loop to gather fedTx and validate input
                do
                {
                    fedTx = Double.parseDouble(JOptionPane.showInputDialog("Enter Employee Federal Tax (Must not be more than gross Pay)"));
                    if (fedTx > 0 && (stateTx + fedTx) < grossPay)
                        outputFile.println(fedTx);
                    else
                        JOptionPane.showMessageDialog(null, "Please enter a valid amount",
                                "Uh Oh!", JOptionPane.ERROR_MESSAGE);
                }while (fedTx <=0 || (stateTx + fedTx) > grossPay);
                //Loop to gather FICA Withholdings and validate input
                do
                {
                    ficaWH = Double.parseDouble(JOptionPane.showInputDialog("Enter Employee FICA Withholdings (Must not be more than gross Pay)"));
                    if (ficaWH > 0 && (stateTx + fedTx + ficaWH) < grossPay)
                        outputFile.println(ficaWH);
                    else
                        JOptionPane.showMessageDialog(null, "Please enter a valid amount",
                                "Uh Oh!", JOptionPane.ERROR_MESSAGE);
                }while (ficaWH <= 0 || (stateTx + fedTx + ficaWH) > grossPay);
                //Calculate netPay
                netPay = grossPay - stateTx - fedTx - ficaWH;
                outputFile.println(netPay);
            }
        }while (employeeID != 0);
        outputFile.close();
        
        //Read and display payroll report
        File file = new File("EmployeeRecord.txt");
		Scanner inputFile = new Scanner(file);
		while (inputFile.hasNext())
		{
			System.out.println("Employee Number: " + inputFile.nextLine());
			System.out.println("Employee Name: " + inputFile.nextLine());
                        System.out.println("Gross Pay: $" + inputFile.nextLine());
                        System.out.println("State Tax: $(" + inputFile.nextLine() + ")");
                        System.out.println("Federal Tax: $(" + inputFile.nextLine() + ")");
                        System.out.println("FICA Withholdings: $(" + inputFile.nextLine() + ")");
                        System.out.println("Net Pay: $" + inputFile.nextLine() + "\n");
		}
		inputFile.close();
    }
}
