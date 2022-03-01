import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** SocialMediaMC Test.
 *
 * @author Jacob Knight
 * @version 3/31/21
 */
public class SocialMediaMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Test for getBaseCost. **/
   @Test public void getBaseCost() {
      SocialMediaMC test = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      Assert.assertEquals(test.getBaseCost(), 3000.0, 1.0);
   }
}
