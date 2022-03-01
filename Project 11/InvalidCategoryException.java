/** InvalidCatgoryException.
 *
 * @author Jacob Knight
 * @version 4/15/21
 */
public class InvalidCategoryException extends Exception
{

/**
* This method is the constructor for the exception.
* @param categoryIn is the categoryIn of the entry.
*/
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   }
}