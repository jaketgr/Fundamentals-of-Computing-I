import java.util.Scanner;
/** Prints out solved expression.
     *
     * @author Jacob Knight
     * @version 1/28/21
     */

public class ExpressionSolver {
   /**
    * Prints expression solver to std output.
    *
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      double y = 0;
      double z = 0;
      double result = 0;
    //print out the equation
      System.out.println("result = (9x + 6.25) (6y - 4.5) (3z + 2.75) / xyz");
    //Prompt the user for x:
      System.out.print("\tx = ");
      x = userInput.nextDouble();
    //Prompt the user for y:
      System.out.print("\ty = ");
      y = userInput.nextDouble();
    //Prompt the user for z: 
      System.out.print("\tz = ");
      z = userInput.nextDouble();
    //display result 
      if (x * y * z == 0.0) { //result equals undefined
         System.out.println("result is \"undefined\"");
      }
      else { //calculate result
         result = ((9 * x) + 6.25) * ((6 * y) - 4.5) * ((3 * z) + 2.75) 
            / (x * y * z);
         System.out.print("result = " + result);
      }
   }
}
