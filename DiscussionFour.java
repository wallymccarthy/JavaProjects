
package discussionfour;

public class DiscussionFour {

    public static void main(String[] args) {

        //Create first instance
        Retail_Item itemOne = new Retail_Item("Jacket", 12, 59.95);
        //Display first instance
        System.out.println(itemOne.itemRecord() + "\n");
        
        //Create second instance
        Retail_Item itemTwo = new Retail_Item("Designer Jeans", 40, 39.95);
        //Display second instance
        System.out.println(itemTwo.itemRecord() + "\n");
        
        //Create third instance
        Retail_Item itemThree = new Retail_Item("Shirt", 20, 24.95);
        //Display third instance
        System.out.println(itemThree.itemRecord());
    }
    
}
