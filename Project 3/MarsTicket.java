import java.util.Scanner;
import java.text.DecimalFormat;
    /** Prints out information using the Mars ticket the 
     * user has given.
     *
     * @author Jacob Knight
     * @version 2/3/21
     */

public class MarsTicket {
   /**
    * Uses the parts of the ticket to print out info.
    *
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String ticketcode = "";
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      DecimalFormat dfp = new DecimalFormat("0%");
      DecimalFormat dfr = new DecimalFormat("000000");
      //Prompt the user to enter the ticket code
      System.out.print("Enter ticket code: ");
      ticketcode = userInput.nextLine();
      ticketcode = ticketcode.trim();
      //If less than 27 characters then invalid ticket code
      if (ticketcode.length() < 27) {
         System.out.println();
         System.out.println("*** Invalid Ticket Code ***");
         System.out.print("Ticket code must have at least 27 characters.");
      }
      else {
         System.out.println();
         //Ticket
         System.out.print("Ticket: " + ticketcode.substring(26));
         //Date
         System.out.print("   Date: " + ticketcode.substring(15, 17));
         System.out.print("/" + ticketcode.substring(17, 19));
         System.out.print("/" + ticketcode.substring(19, 23));
         //Time
         System.out.print("   Time: " + ticketcode.substring(11, 13));
         System.out.print(":" + ticketcode.substring(13, 15));
         //Seat
         System.out.print("\nSeat: " + ticketcode.substring(23, 26));
         //Price
         String price = ticketcode.substring(0, 8);
         double pricedouble = Double.parseDouble(price);
         double price2 = (pricedouble / 10);
         System.out.print("   Price: " + df.format(price2));
         //Discount
         String discount = ticketcode.substring(9, 11);
         double discountdouble = Double.parseDouble(discount);
         double discount2 = (discountdouble / 100);
         System.out.print("   Discount: " + dfp.format(discount2));
         //Cost
         double cost = (price2 - (discount2 * price2));
         System.out.print("   Cost: " + df.format(cost));
         //Random Prize
         int prize = (int) (Math.random() * 999999 + 1);
         System.out.println("\nPrize Number: " + dfr.format(prize));
      }
      
   }
}
