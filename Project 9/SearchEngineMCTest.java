import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** SearchEngineMC Test.
 *
 * @author Jacob Knight
 * @version 3/31/21
 */
public class SearchEngineMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Test for getBaseCost. **/
   @Test public void getBaseCost() {
      SearchEngineMC test = new SearchEngineMC("Web Ads 2", 27500.00, 
         2.50, 5000);
      Assert.assertEquals(test.getBaseCost(), 2000.0, 1.0);
   }
}
