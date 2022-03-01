import java.util.Scanner;
import java.text.DecimalFormat;
    /** Solves the equation for the users given x value and 
     * characters to the left and right of the decimal point.
     *
     * @author Jacob Knight
     * @version 2/3/21
     */

public class SolveIt {
   /**
    * Solves the equation.
    *
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      //Prompt the user to enter an x value
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      //Equation
      double result = (6 * Math.pow(x, 3) + Math.sqrt(3 * Math.pow(x, 2)  
         + (2 * x) + 1)) / (Math.abs(2 * x) + 4);
      String resultString = Double.toString(result);
      int integerPlaces = resultString.indexOf('.');
      int digitsLeft = integerPlaces;
      int digitsRight = resultString.length() - integerPlaces - 1;
      //Formatted result
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String formatted = df.format(result);
      //Output
      System.out.println("Result: " + result);
      System.out.println("# of characters to left "
         + "of decimal point: " + digitsLeft);
      System.out.println("# of characters to right "
         + "of decimal point: " + digitsRight);
      System.out.println("Formatted Result: " + formatted);
   }
}

