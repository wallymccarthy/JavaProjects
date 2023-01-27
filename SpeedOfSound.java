
package speedofsound;

import java.util.Scanner;

/******************************************************************************************

* Homework Six, Speed of Sound
* Author: Walter McCarthy
* Project Purpose: Program to calculate time for sound to travel a designated distance
*   inputted by the user
* Input: This program accepts input via scanner.next()
* Desired Output: The program will output the appropriate time via the chosen medium / distance
* Variables and Classes: There is one class, with the main method. It uses the System.out.println method.
* Formulas: The primary variables are choice and distance.
* Testing: When the program is run with correct inputs, it calculates the distance based
*   on parameters chosen by the user.
*       Otherwise, it gives an error message.
* January 24, 2023
**********************************************************************************************/
public class SpeedOfSound {

    public static void main(String[] args) {
        // Declare Variables
        double seconds;
        double distance;
        int choice;
        // Static variables for the three mediums
        final double air = 1100;
        final double water = 4900;
        final double steel = 16400;
        
        //Create input object
        Scanner keyboard = new Scanner(System.in);
        
        //Acquire user input for medium
        System.out.println("Please choose a medium:\n 1:Air\n 2:Water\n 3:Steel");
        System.out.println("Enter the number of your choice: ");
        do {
            choice = keyboard.nextInt();
            //If statements to choose medium
            if (choice != 1 && choice != 2 && choice != 3)
                    {
                        System.out.println("Please make a valid choice!\n 1:Air\n 2:Water\n 3:Steel");
                    }
            } while (choice != 1 && choice != 2 && choice != 3);
                //Acquire user input for distance
                        System.out.println("Enter the distance in feet you want the sound" +
                                    " to travel: ");
                        distance = keyboard.nextDouble();

                        if (choice == 1)
                            {
                                seconds = distance / air;
                                System.out.println("In air, the sound will travel " + distance
                                    + " feet in " + seconds + " seconds.");
                            }
                        else if (choice == 2)
                            {
                                seconds = distance / water;
                                System.out.println("In water, the sound will travel " + distance
                                    + " feet in " + seconds + " seconds.");
                            }
                        else if (choice == 3)
                            {
                                seconds = distance / steel;
                                System.out.println("In steel, the sound will travel " + distance
                                    + " feet in " + seconds + " seconds.");
                            }
        }
}
