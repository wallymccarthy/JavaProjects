
package discussionfour;

public class Retail_Item {
        private String description;
        private int unitsOnHand;
        private double price;
        //Constructor Method
        Retail_Item() {
            description = "";
            unitsOnHand = 0;
            price = 0;
        }
        //Constructor with arguments
        Retail_Item(String pDescription, int pUnitsOnHand, double pPrice) {
            description = pDescription;
            unitsOnHand = pUnitsOnHand;
            price = pPrice;
        }
        //set Methods
        public void setDescription(String description) {
            this.description = description;
        }
        public void setUnitsOH(int unitsOnHand) {
            this.unitsOnHand = unitsOnHand;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        //get Methods
        public String getDescription() {
            return description;
        }
        public int getUnitsOH() {
            return unitsOnHand;
        }
        public double getPrice() {
            return price;
        }
        //Display Record
         public String itemRecord() {
        return "Item Description: "+ this.description +
                "\nUnits on Hand: " + Integer.toString(unitsOnHand) +
                "\nPrice: $" + Double.toString(price);
                
    }

}
