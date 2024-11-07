import java.util.Random;

public class Jar {
  // A private String field which stores the type of item contained in the jar.
  private String item;
  // A private int field which stores the maximum number of items that can fit in the jar.
  private int maxNumOfItems;
  // A private int field which stores the current number of items in the jar.
  private int currentNumOfItems;
  
  // Constructor to initialize the jar's item type and maximum item capacity based on user input.
  public Jar(String item, int maxNumOfItems) {
    this.item = item;
    this.maxNumOfItems = maxNumOfItems;
  }
  
  // Creates a method that andomly fills the jar with a number of items between 1 and maxNumOfItems.
  public void fill() {
    Random random = new Random();
    int randomNumber = random.nextInt(maxNumOfItems) + 1;
    currentNumOfItems = randomNumber;
  }
  
  // Getter method that returns the item type stored in the jar.
  public String getItem() {
    return item;
  }
  
  // Getter method that returns the maximum capacity of items for the jar.
  public int getMaxNumOfItems() {
    return maxNumOfItems;
  }
  
  // Getter method that returns the current number of items stored in the jar.
  public int getCurrentNumOfItems() {
    return currentNumOfItems;
  }
}