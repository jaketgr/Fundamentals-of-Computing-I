   /** SocialMediaMC.
 *
 * @author Jacob Knight
 * @version 3/31/21
 */
public class SocialMediaMC extends IndirectMC {
 /** sets the base cost.
 *
 */
   public static final double BASE_COST = 3000.0;
 /**Constructor.
 *@param nameIn is used
 *@param revenueIn is used
 *@param costPerAdIn is used  
 *@param numberOfAdsIn is used
 */
   public SocialMediaMC(String nameIn, double revenueIn,
      double costPerAdIn, int numberOfAdsIn) {
      super(nameIn, revenueIn, costPerAdIn, numberOfAdsIn);
   }
 /** method getBaseCost.
 *@return returns BASE_COST
 */
   public double getBaseCost() {
      return BASE_COST;
   }
}
