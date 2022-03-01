import java.util.Scanner;
/** Prints out unit conversions with given value.
     *
     * @author Jacob Knight
     * @version 1/28/21
     */

public class PetroleumUnits {
   /**
    * converts petoleum units to std output.
    *
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      int ounces = 0;
      int quarts = 0;
      int gallons = 0;
      int barrels = 0;
      int petroleum = 0;
      //prompt user to input petroleum in ounces
      System.out.print("Enter amount of petroleum in ounces: ");
      petroleum = userInput.nextInt();
      if (petroleum > 1000000000) { //amount can not be over 1,000,000,000
         System.out.println("Amount must not exceed 1,000,000,000. ");
         return;
      }
      else { //calculate conversions
         barrels = (petroleum / 5376);
         gallons = ((petroleum % 5376) / 128);
         quarts = ((petroleum % 5376 % 128) / 32);
         ounces = ((petroleum % 5376 % 128 % 32));
         
         System.out.println("Petroleum amount in units:");
         System.out.println("\tBarrels: " + barrels);
         System.out.println("\tGallons: " + gallons);
         System.out.println("\tQuarts: " + quarts);
         System.out.println("\tOunces: " + ounces);
         System.out.println(petroleum + " oz = (" + barrels + " bl * 5376 oz)"
            + " + (" + gallons + " gal * 128 oz) + (" + quarts + " qt * "
            + "32 oz) + (" + ounces + " oz)");
      }
   }
}
