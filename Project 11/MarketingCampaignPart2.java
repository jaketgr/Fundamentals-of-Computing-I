import java.io.FileNotFoundException;
/** MarketingCampaignPart2.
 *
 * @author Jacob Knight
 * @version 4/9/21
 */
public class MarketingCampaignPart2 {
/**
* Main method that runs all Marketing Campaign classes and uses a file name
* as a Command Line Argument to create the MarketingCampaignList.
* @param args Command line arguments are used
* @throws FileNotFoundException just for you, WebCat. 
*/
   public static void main(String[] args) throws FileNotFoundException {
      if (args.length == 0)
      {
         System.out.println("File name expected as command line argument."
                           + "\nProgram ending.");
      }
      else
      {
         MarketingCampaignList myList = new MarketingCampaignList();
         myList.readFile(args[0]);
         System.out.print(myList.generateReport());
         System.out.println();
         System.out.println(myList.generateReportByName());
         System.out.println();
         System.out.println(myList.generateReportByCampaignCost());
         System.out.println();
         System.out.println(myList.generateReportByROI());
         System.out.println();
      }
   }
}