import java.text.DecimalFormat;
/** DirectMC.
 *
 * @author Jacob Knight
 * @version 3/31/21
 */   
public class DirectMC extends MarketingCampaign {
   // instance variables
   private double costPerMailPiece;
   private int numberOfMailPieces;
/** sets base cost.
*
*/
   public static final double BASE_COST = 1000;
/** constructor.
*@param nameIn is used
*@param revenueIn is used
*@param costPerMailPieceIn is used
*@param numberOfMailPiecesIn is used
*/
   public DirectMC(String nameIn, double revenueIn,
      double costPerMailPieceIn, int numberOfMailPiecesIn) {
      super(nameIn, revenueIn);
      costPerMailPiece = costPerMailPieceIn;
      numberOfMailPieces = numberOfMailPiecesIn;
   }
/** method getCostPerMailPiece.
*@return returns costPerMailPiece
*/
   public double getCostPerMailPiece() {
      return costPerMailPiece;
   }
/** method setCostPerMailPiece.
*@param costPerMailPieceIn is used
*/
   public void setCostPerMailPiece(double costPerMailPieceIn) {
      costPerMailPiece = costPerMailPieceIn;
   }
/** method getNumberOfMailPieces.
*@return returns numberOfMailPieces
*/
   public int getNumberOfMailPieces() {
      return numberOfMailPieces;
   }
/** method setNumberOfMailPieces.
*@param numberOfMailPiecesIn is used  
*/
   public void setNumberOfMailPieces(int numberOfMailPiecesIn) {
      numberOfMailPieces = numberOfMailPiecesIn;
   }
/** method campaignCost.
*@return returns campaignCost
*/
   public double campaignCost() {
      return (BASE_COST + (costPerMailPiece * numberOfMailPieces));
   }
/** method toString.
*@return returns string
*/
   public String toString() {
      DecimalFormat mv = new DecimalFormat("$#,##0.00");
      return super.toString() 
         + "\n   Base Cost: " + mv.format(BASE_COST) 
         + "\n   Mail Cost: "
         + mv.format((costPerMailPiece * numberOfMailPieces))
         + " = " + mv.format(getCostPerMailPiece())
         + " per mail piece" + " * " + getNumberOfMailPieces() 
         + " mail pieces";
   }
}