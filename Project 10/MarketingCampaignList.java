import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
/** MarketingCampaignList.
 *
 * @author Jacob Knight
 * @version 4/9/21
 */
public class MarketingCampaignList {
   // variables //
   private MarketingCampaign[] arrayMC;
   private String[] invalidRecords;

   // constructor //
   /** constructs a MarketingCampaign[] and String[]. **/
   public MarketingCampaignList() {
      arrayMC = new MarketingCampaign[0];
      invalidRecords = new String[0];
   }

   // methods //
   /**
   * Accessor method for marketingCampaignDB.
   * @return arrayMC for arrayMC.
   */
   public MarketingCampaign[] getMarketingCampaignArray()
   {
      return arrayMC;
   }

   /**
   * Accessor method for invalidRecords.
   * @return invalidRecords for invalidRecords.
   */
   public String[] getInvalidRecordsArray()
   {
      return invalidRecords;
   }

   /**
   * Adds a MarketingCampaign object to arrayDB.
   * @param objIn for MarketingCampaign being added
   */
   public void addMarketingCampaign(MarketingCampaign objIn)
   {
      if (objIn != null)
      {
         arrayMC = Arrays.copyOf(getMarketingCampaignArray(), 
            getMarketingCampaignArray().length + 1);
         arrayMC[getMarketingCampaignArray().length - 1] = objIn;
      }
   }

   /**
   * Adds a invalid record to invalidRecords.
   * @param recordIn for invalid record
   */
   public void addInvalidRecord(String recordIn)
   {
      if (recordIn != null)
      {
         invalidRecords = Arrays.copyOf(invalidRecords,
                              invalidRecords.length + 1);
         invalidRecords[invalidRecords.length - 1] = recordIn;
      }
   } 

   /**
      * Reads a data file as a String and creates MC objects, which is then adds
      * to arrayMC.
      * @param fileNameIn for the file name.
      * @throws FileNotFoundException because WebCat likes it. 
      */
   public void readFile(String fileNameIn) throws FileNotFoundException
   {  
      String rowIn = "";
   
      Scanner scan = new Scanner(new File(fileNameIn));
   
      while (scan.hasNext())
      {  
         String temp = "";
         String output = "";
         char type = 'z';
         String name = "";
         double revenue = 0.0;
         double cost = 0.0;
         int number = 0;
      
         rowIn = scan.nextLine();
         Scanner read = new Scanner(new String(rowIn));
         read.useDelimiter(",");
      
         temp = read.next();
         type = temp.charAt(0);
         name = read.next();
         revenue = read.nextDouble();
         cost = read.nextDouble();
         number = read.nextInt();
      
      
      
         switch(type)            
         {
            case 'D':
               DirectMC dmc = new DirectMC(name, revenue, 
                  cost, number);
            
               this.addMarketingCampaign(dmc);
            
               break;
         
            case 'I':
               IndirectMC imc = new IndirectMC(name, revenue, 
                  cost, number);
            
               this.addMarketingCampaign(imc);
            
               break;
         
            case 'S':
               SearchEngineMC semc = new SearchEngineMC(name, revenue, 
                  cost, number);
            
               this.addMarketingCampaign(semc);
            
               break;
         
            case 'M':
               SocialMediaMC smmc = new SocialMediaMC(name, revenue, 
                  cost, number);
            
               this.addMarketingCampaign(smmc);
            
               break;
         
         
            default:
               break;
         
         }
      }
   }

   /**
   * Processes arrayMarketinCampaign in original order from 
   * the file to produce the Marketing Campaign Report and
   * returns the report as String.
   * @return output for Marketing Campaign Report.
   */
   public String generateReport()
   {
      String output = "-------------------------------"
         + "\nMarketing Campaign Report"
         + "\n-------------------------------\n";
   
      int i = 0;
      while (i < arrayMC.length)
      {
         output += "\n" + arrayMC[i].toString() + "\n";
      
         i++;
      }
      return output;
   }

   /**
   * Sorts arrayMC in natural order, processes the 
   * arrayMC to produce the Marketing Camapign Report (by Name) 
   * and returns it as a String.
   * @return output for Marketing Campaign Report
   */
   public String generateReportByName()
   {
      String output = "-----------------------------------------\n"
         + "Marketing Campaign Report (by Name)\n"
         + "-----------------------------------------";
   
      String[] names = new String[arrayMC.length];
   
      for (int i = 0; i < arrayMC.length; i++)
      {
         names[i] = arrayMC[i].getName();
      }
   
      Arrays.sort(names);
   
      int i = 0;
   
      while (i < arrayMC.length)
      {
         for (MarketingCampaign mc: arrayMC)
         {
            if (mc.getName() == names[i])
            {
               output += "\n\n" + mc.toString();
            }
         }
      
         i++;
      }
      return output;
   }

   /**
   * Sorts arrayMC by Campaign Cost, processes the 
   * arrayMC to produce the Marketing Campaign Report 
   * (by Campaign Cost) and returns it as a String.
   * @return output for Marketing Campaign Report.
   */
   public String generateReportByCampaignCost()
   {
      String output = "-------------------------------------------------\n"
         + "Marketing Campaign Report (by Lowest Campaign Cost)\n"
         + "-------------------------------------------------";
   
      double[] costs = new double[arrayMC.length];
   
      for (int i = 0; i < arrayMC.length; i++)
      {
         costs[i] = arrayMC[i].campaignCost();
      }
   
      Arrays.sort(costs);
   
      int i = 0;
   
      while (i < arrayMC.length)
      {
         for (MarketingCampaign mc: arrayMC)
         {
            if (mc.campaignCost() == costs[i])
            {
               output += "\n\n" + mc.toString();
            }
         }
      
         i++;
      }
      return output;
   }

   /**
   * Sorts arrayMC by ROI, processes the 
   * arrayMC to produce the Marketing Campaign Report 
   * (by ROI) and returns it as a String.
   * @return output for Marketing Campaign Report.
   */
   public String generateReportByROI()
   {
      String output = "-------------------------------------------------\n"
         + "Marketing Campaign Report (by Highest ROI)\n"
         + "-------------------------------------------------";
   
      double[] roi = new double[arrayMC.length];
      for (int i = 0; i < arrayMC.length; i++)
      {
         roi[i] = arrayMC[i].calcROI();
      }
   
      Arrays.sort(roi);
   
      int i = arrayMC.length - 1;
   
      while (i > -1)
      {
         for (MarketingCampaign mc: arrayMC)
         {
            if (mc.calcROI() == roi[i])
            {
               output += "\n\n" + mc.toString();
            }
         }
      
         i--;
      }
      return output;
   }



}