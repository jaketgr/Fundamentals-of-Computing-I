import java.text.DecimalFormat;     
 /** Provides an example based on  
   * the information the user has input. 
   *
   * @author Jacob Knight
   * @version 2/11/21
   */

public class Cone {
   // instance variables
   private String label;
   private double height;
   private double radius;
   
   /** cone constructor.
     *@param labelIn user unput for label
     *@param heightIn user input for height
     *@param radiusIn user input for radius 
     */
    
   public Cone(String labelIn, double heightIn, double radiusIn) {
      setLabel(labelIn);
      setHeight(heightIn);
      setRadius(radiusIn);
   }
   
   // methods
   
   /** This method gets the label string.
     * @return returns the label of the cone.
     */
   public String getLabel() {
      return label; 
   }
    /** this method sets the label of the cone.
      * @param labelIn is the label entered by the user.
      * @return return true or false depending on user input.
      */
   public boolean setLabel(String labelIn) {
      if (labelIn == null) {
         return false; }
      else {
         label = labelIn.trim();
         return true; 
      }
   }
/**
* This method gets the height of the cone.
* @return returns height of the cone.
*/
   public double getHeight() {
      return height; 
   }
/**
* This method sets the height of the cone.
* @param heightIn is the height entered by the user.
* @return returns true or false depending on the user input.
*/
   public boolean setHeight(double heightIn) {
      if (heightIn > 0) {
         height = heightIn;
         return true; }
      else {
         return false; 
      }
   }
/**
* This method gets the radius of the cone.
* @return returns the radius of the cone.
*/
   public double getRadius() {
      return radius; }
/**
* This method sets the radius of the cone.
* @param radiusIn is the radius entered by the user.
* @return returns true or false depending on the user input.
*/
   public boolean setRadius(double radiusIn) {
      if (radiusIn > 0) {
         radius = radiusIn;
         return true; }
      else {
         return false; }
   }
/**
* This method finds the perimeter of the base of the cone.
* @return returns the perimeter of the base
*/
   public double basePerimeter() {
      double basePerimeter = (radius * 2) * Math.PI;
      return basePerimeter; }
/**
* This method finds the are of the base of the cone.
* @return returns the area of the base.
*/
   public double baseArea() {
      double baseArea = Math.pow(radius, 2) * Math.PI;
      return baseArea; }
/**
* This method finds the slant height of the cone.
* @return returns the slant height.
*/
   public double slantHeight() {
      double slantHeight = Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2));
      return slantHeight; }
/**
* This method finds the area of the side of the cone.
* @return returns the side area.
*/
   public double sideArea() {
      double sideArea = slantHeight() * radius * Math.PI;
      return sideArea; }
/**
* This method finds the surface area of the cone.
* @return returns the surface area.
*/
   public double surfaceArea() {
      double surfaceArea = baseArea() + sideArea();
      return surfaceArea; }
/**
* This method finds the volume of the cone.
* @return returns the volume.
*/
   public double volume() {
      double volume = Math.pow(radius, 2) * (height / 3) * Math.PI;
      return volume; }
/**
* This method prints the information of the cone.
* @return returns the information of the cone.
*/
   public String toString() {
      DecimalFormat dFmt = new DecimalFormat("#,##0.0##");
      return "\"" + label + "\" is a cone with height = "
         + dFmt.format(height) + " units and radius = "
         + dFmt.format(radius) + " units,"
         + "\nwhich has base perimeter = "
         + dFmt.format(basePerimeter()) + " units, base area = "
         + dFmt.format(baseArea()) + " square units,"
         + "\nslant height = " + dFmt.format(slantHeight())
         + " units, side area = " + dFmt.format(sideArea())
         + " square units," + "\nsurface area = "
         + dFmt.format(surfaceArea()) + " square units,"
         + " and volume = " + dFmt.format(volume())
         + " cubic units.";
   }
}