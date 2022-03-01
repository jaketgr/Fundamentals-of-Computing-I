import java.text.DecimalFormat;
/** MarketingCampaign gives campaign data.
 *
 * @author Jacob Knight
 * @version 4/9/21
 */
public abstract class MarketingCampaign implements 
   Comparable<MarketingCampaign> {
   // instance variables
   protected String name;
   protected double revenue;
   protected static int count = 0;
   /** constructor.
   *@param nameIn is used
   *@param revenueIn is used
   */
   public MarketingCampaign(String nameIn, double revenueIn) {
      name = nameIn;
      revenue = revenueIn;
      count++;
   }
   /** method getName.
   * @return returns string
   */
   public String getName() {
      return name;
   }
   /** method setName.
   *@param nameIn is used
   */
   public void setName(String nameIn) {
      name = nameIn;
   }
   /** method getRevenue.
   *@return returns revenue
   */
   public double getRevenue() {
      return revenue;
   }
   /** method seetRevenue.
   *@param revenueIn is used
   */
   public void setRevenue(double revenueIn) {
      revenue = revenueIn;
   }
   /** method getCount.
   *@return returns count
   */
   public static int getCount() {
      return count;
   }
   /** method resetCount.
   *
   */
   public static void resetCount() {
      count = 0;
   }
   /** method calcROI.
   *@return returns ROI
   */
   public double calcROI() {
      double roi = (revenue - campaignCost()) / campaignCost();
      return roi;
   }
   /** method toString.
   *@return returns string
   */
   public String toString() {
      DecimalFormat mv = new DecimalFormat("$#,##0.00");
      DecimalFormat roi = new DecimalFormat("0.##%");
      return getName() + " (" + this.getClass() + ")" + "\nRevenue: "
         + mv.format(getRevenue()) + "   Campaign Cost: " 
         + mv.format(campaignCost()) + "   ROI: " 
         + roi.format(calcROI());      }
   /** method campaignCost.
   *@return returns cost
   */
   public abstract double campaignCost();
   /**
    * compare to.
    * @return - int representing order of list 
    */
   @Override public int compareTo(MarketingCampaign mc) {
      if (this.getName().compareToIgnoreCase(mc.getName()) > 0)
      {
         return 1;
      }
      else if (this.getName().compareToIgnoreCase(mc.getName()) < 0)
      {
         return -1;
      }
      else {
         return 0;
      }
   }
}
   
