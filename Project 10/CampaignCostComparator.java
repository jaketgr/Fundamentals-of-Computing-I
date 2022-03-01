import java.util.Comparator;
 /** CampaignCostComparator.
 *
 * @author Jacob Knight
 * @version 4/9/21
 */
public class CampaignCostComparator implements Comparator<MarketingCampaign> {
   /**
   * Compares based on Campaign Cost. 
   * @param c1 MC 1
   * @param c2 MC 2
   * @return Int indicating if c1 is greater than,
   * equal to, or less than c2.
   */
   public int compare(MarketingCampaign c1, MarketingCampaign c2) {
      if (c1.campaignCost() < c2.campaignCost()) {
         return -1; 
      }
      else if (c1.campaignCost() > c2.campaignCost()) {
         return 1; 
      }
      return 0; 
   }

}