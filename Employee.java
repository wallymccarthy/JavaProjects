
package employeeclass;

public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;
    //Constructor method for Employee
    Employee() {
        idNumber = 0;
        department = "";
        name = "";
        position = "";
    }
    //Method to access and store idNumber
    public int getidNumber() {
        return idNumber;
    }
    
    public void setidNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    //Methods to access and store name
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    //Methods to access and store department
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    //Methods to access and store position
    public String getPosition() {
        return position;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
    
    public String employeeRecord() {
        return "ID Number: "+Integer.toString(this.idNumber) + "\n" + this.name 
                + "\nDepartment: " + this.department
                + "\nPosition: " + this.position;
    }
}
