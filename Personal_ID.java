
package personal.information.pkgclass;

public class Personal_ID {
    private String name;
    private int age;
    private String address;
    private double phoneNum;
    //Constructor Method
    Personal_ID() {
        name = "";
        address = "";
        age = 0;
        phoneNum = 0;
    }
    //Constructor with arguments
    Personal_ID(String pName, String pAddress, int pAge, int pPhoneNum) {
        name = pName;
        address = pAddress;
        age = pAge;
        phoneNum = pPhoneNum;
    }
    //set Methods
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPhoneNum(double phoneNum) {
        this.phoneNum = phoneNum;
    }
    //get Methods
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getAge() {
        return age;
    }
    public double getPhoneNum() {
        return phoneNum;
    }
    public String pRecord() {
        return "Name: "+ this.name +
                "\nAddress: " + this.address +
                "\nAge: " + Integer.toString(this.age) +
                "\nPhone Number: " + Double.toString(this.phoneNum);
    }
}
