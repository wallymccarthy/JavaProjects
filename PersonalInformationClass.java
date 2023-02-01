
package personal.information.pkgclass;

import javax.swing.JOptionPane;
/******************************************************************************************
* Homework Nine, Personal Information Class
* Author: Walter McCarthy
* Project Purpose: Program creates three instances of class Personal_ID
* Input: The program gets input through JOptionPane
* Desired Output: A message window showing the three instances information
* Variables and Classes: One major class Personal_ID
* Formulas: Using get/set methods, and a record method to display information
* Testing: When user puts in appropriate inputs, the final message is displayed in a window
* January 31, 2023
**********************************************************************************************/
public class PersonalInformationClass {

    public static void main(String[] args) {
        String pName;
        String pAddress;
        int pAge;
        double pPhoneNum;
        //Create first instance of Personal_ID
        Personal_ID personOne = new Personal_ID();
        personOne.setName(pName = JOptionPane.showInputDialog("Enter this persons name"));
        personOne.setAddress(pAddress = JOptionPane.showInputDialog("What's their address?"));
        personOne.setAge(pAge = Integer.parseInt(JOptionPane.showInputDialog("What is their age?")));
        personOne.setPhoneNum(pPhoneNum = Double.parseDouble(JOptionPane.showInputDialog("What is their Phone Number?")));
        //Create second instance of Personal_ID
        Personal_ID personTwo = new Personal_ID();
        personTwo.setName(pName = JOptionPane.showInputDialog("Enter this persons name"));
        personTwo.setAddress(pAddress = JOptionPane.showInputDialog("What's their address?"));
        personTwo.setAge(pAge = Integer.parseInt(JOptionPane.showInputDialog("What is their age?")));
        personTwo.setPhoneNum(pPhoneNum = Double.parseDouble(JOptionPane.showInputDialog("What is their Phone Number?")));
        //Create third instance of Personal_ID
        Personal_ID personThree = new Personal_ID();
        personThree.setName(pName = JOptionPane.showInputDialog("Enter this persons name"));
        personThree.setAddress(pAddress = JOptionPane.showInputDialog("What's their address?"));
        personThree.setAge(pAge = Integer.parseInt(JOptionPane.showInputDialog("What is their age?")));
        personThree.setPhoneNum(pPhoneNum = Double.parseDouble(JOptionPane.showInputDialog("What is their Phone Number?")));
        
        //Display the results
        JOptionPane.showMessageDialog(null, personOne.pRecord() + "\n\n" + personTwo.pRecord() + "\n\n" +personThree.pRecord());

    }
    
}
