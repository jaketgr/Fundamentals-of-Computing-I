import java.util.Comparator;

 /** ROIComparator.
 *
 * @author Jacob Knight
 * @version 4/9/21
 */
public class ROIComparator implements Comparator<MarketingCampaign> {
/**
   * Compares based on ROI.
   * @param c1 MC 1
   * @param c2 MC 2
   * @return Int indicating if c1 is greater than,
   * equal to, or less than c2.
   */
   public int compare(MarketingCampaign c1, MarketingCampaign c2) {
      if (c1.calcROI() > c2.calcROI()) {
         return -1;  
      }
      else if (c1.calcROI() < c2.calcROI()) {
         return 1; 
      }
      return 0; 
   }

}