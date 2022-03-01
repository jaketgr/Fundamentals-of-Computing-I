import java.text.DecimalFormat;
/** IndirectMC.
 *
 * @author Jacob Knight
 * @version 3/31/21
 */
public class IndirectMC extends MarketingCampaign {
   protected double costPerAd;
   protected int numberOfAds;
/** Sets the base cost.
*
*/
   public static final double BASE_COST = 1500.0;
/**Constructor.
*@param nameIn is used
*@param revenueIn is used
*@param costPerAdIn is used
*@param numberOfAdsIn is used
*/
   public IndirectMC(String nameIn, double revenueIn,
      double costPerAdIn, int numberOfAdsIn) {
      super(nameIn, revenueIn);
      costPerAd = costPerAdIn;
      numberOfAds = numberOfAdsIn;
   }
/** method setCostPerAd.
*@param costPerAdIn is used
*/
   public void setCostPerAd(double costPerAdIn) {
      costPerAd = costPerAdIn;
   }
/** method getCostPerAd.
*@return returns costPerAd
*/
   public double getCostPerAd() {
      return costPerAd;
   }
/** method getNumberOfAds.
*@return returns numberOfAds
*/
   public int getNumberOfAds() {
      return numberOfAds;
   }
/** method setNumberOfAds.
*@param numberOfAdsIn is used
*/
   public void setNumberOfAds(int numberOfAdsIn) {
      numberOfAds = numberOfAdsIn;
   }
/** method getBaseCost.
*@return returns BASE_COST
*/
   public double getBaseCost() {
      return BASE_COST;
   }
/** method campaignCost.
*@return returns campaignCost
*/
   public double campaignCost() {
      return (getBaseCost() + (costPerAd * numberOfAds));
   }
/** method toString.
*@return returns string
*/
   public String toString() {
      DecimalFormat mv = new DecimalFormat("$#,##0.00");
      double total = (costPerAd * numberOfAds);
      String string = super.toString()
         + "\n   Base Cost: "
         + mv.format(this.getBaseCost()) + "\n   Ad Cost: "
         + mv.format(total) + " = "
         + mv.format(getCostPerAd()) + " per ad"
         + " * " + getNumberOfAds() + " ads";
      return string;
   }
}