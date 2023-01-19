
package stringmanipulator_discussiontwo;
import javax.swing.JOptionPane;
/******************************************************************************************
* Discussion Two, String Manipulator
* Author: Walter McCarthy
* Project Purpose: Program to manipulate an inputted string 
* Input: This program accepts input via JOptionPane.showInputDialog
* Desired Output: The city inputted by the user will be outputted having used
*       various methods to manipulate the original string city
* Variables and Classes: There is one class, with the main method.
*       The main variable is city, which holds the user input.
* Formulas: The length(), toUpper(), toLower(), and charAt() methods are used to
*       manipulate the original city String
* Testing: When the program is run, a window will prompt user for input.
*           A second window will open showcasing the different ways the
*           inputted string can be manipulated.
* January 17, 2023
**********************************************************************************************/
public class StringManipulator_DiscussionTwo {

    public static void main(String[] args) {
        //Create variables to hold various strings and integers
        String city = "";
        String littleCity;
        String bigCity;
        int cityLength;
        char letter;
        
        //Get user prompt using JOptionPane
        city = JOptionPane.showInputDialog
            (null, "Enter your favorite city", "City", JOptionPane.DEFAULT_OPTION);
        //Calculate number of characters, convert to lower and uppercase,
        cityLength = city.length();
        littleCity = city.toLowerCase();
        bigCity = city.toUpperCase();
        letter = city.charAt(0);
        
        String mess = String.format(" %s \nThere are %d characters in the name\n %s \n %s \n %s"
                , city, cityLength, bigCity, littleCity, letter);
        JOptionPane.showMessageDialog(null, mess);
        
        
        
        
    }
    
}
