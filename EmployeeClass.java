
package employeeclass;

/******************************************************************************************
* Homework 8, Employee Class
* Author: Walter McCarthy
* Project Purpose: Program to create three objects of the Employee Class
* Input: This program doesn't accept inputs
* Desired Output: The objects with stored memory
* Variables and Classes: Employee Class and main class for the program
* Formulas: get/set methods for each created object of the Employee Class
* Testing: When the program is run, it displays the three objects with the data
*   stored within
* January 9, 2023
**********************************************************************************************/
public class EmployeeClass {

    
    public static void main(String[] args) {
       Employee empOne = new Employee();
       empOne.setidNumber(47899);
       empOne.setName("Susan Meyers");
       empOne.setDepartment("Accounting");
       empOne.setPosition("Vice President");
       
       Employee empTwo = new Employee();
       empTwo.setidNumber(39119);
       empTwo.setName("Mark Jones");
       empTwo.setDepartment("IT");
       empTwo.setPosition("Programmer");
       
       Employee empThree = new Employee();
       empThree.setidNumber(81774);
       empThree.setName("Joy Rogers");
       empThree.setDepartment("Manufacturing");
       empThree.setPosition("Engineering");

       System.out.println(empOne.employeeRecord() + "\n");
       System.out.println(empTwo.employeeRecord() + "\n");
       System.out.println(empThree.employeeRecord());
    }
    
}
