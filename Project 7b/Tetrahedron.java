import java.text.DecimalFormat;
/** .
   *
   * @author Jacob Knight
   * @version 3/9/21
   */
public class Tetrahedron implements Comparable<Tetrahedron> {
	// constant fields
   private static int count = 0;
   // instance variables
   private String label = "";
   private double edge = 0.0;
   /** constructor.
   *@param labelIn is used
   *@param edgeIn is used
   */
   public Tetrahedron(String labelIn, double edgeIn) {
      setLabel(labelIn);
      setEdge(edgeIn);
      count++;
   }
   // methods
   /** This method gets the label string.
   * @return returns the label of the tetrahedron.
   */
   public String getLabel() {
      return label; 
   }
   /** returns label trimmed if true.
   * @return true if not null and false otherwise.
   * @param labelIn is used. 
   */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true; }
      else {
         return false; 
      }
   }
   /** gets edge.
   * @return edge
   */
   public double getEdge() {
      return edge;
   }
   /** sets the edge.
   * @param edgeIn is used
   * @return true if edge is greater than 0
   * and return false otherwise.
   */
   public boolean setEdge(double edgeIn) {
      if (edgeIn >= 0) {
         edge = edgeIn;
         return true; }
      else {
         return false;
      }
   }
   /** returns height.
   * @return returns the height.
   */
   public double height() {
      return Math.sqrt(2.0 / 3.0) * edge;
   }
   /** returns surface area.
   * @return returns the surface area.
   */
   public double surfaceArea() {
      return Math.sqrt(3.0) * Math.pow(edge, 2);
   }
   /** returns volume.
   * @return returns the volume.
   */
   public double volume() {
      return Math.pow(edge, 3) / (6.0 * Math.sqrt(2.0));
   }
   /**
   * This method prints the information of the tetrahedron.
   * @return returns the information of the tetrahedron.
   */
   public String toString() {
      DecimalFormat dFmt = new DecimalFormat("#,##0.0##");
      String output = "Tetrahedron \"" + label + "\" ";
      output += "with six edges of length " + dFmt.format(edge) + " has:";
      output += "\n\theight = " + dFmt.format(height()) + " units";
      output += "\n\tsurface area = " + dFmt.format(surfaceArea()) 
            + " square units";
      output += "\n\tvolume = " + dFmt.format(volume()) + " cubic units";
      return output; 
   }
   /**
   * gets the count.
   *@return count
   */
   public static int getCount() {
      return count;
   }
   /**
   * resets count.
   */
   public static void resetCount() {
      count = 0;
   }
   /** tetrahedron equal to objective.
   * @return returns fals if it does not equal and true if it does.
   * @param obj is used
   */
   public boolean equals(Object obj) {
      if (!(obj instanceof Tetrahedron)) {
         return false;
      }
      else {
         Tetrahedron d = (Tetrahedron) obj;
         return (label.equalsIgnoreCase(d.getLabel())
            && Math.abs(edge - d.getEdge()) < .000001);
      }
   }
   /** hashcode.
   *@return 0
   */
   public int hashCode() {
      return 0;
   }
   /**Compareto method.
   *@return 0,1, or -1 based on comparison
   *@param obj is used 
   */
   public int compareTo(Tetrahedron obj) {
      if (Math.abs(this.volume() - obj.volume()) < 0.000001) {
         return 0; 
      }
      else if (this.volume() < obj.volume()) {
         return -1;
      }
      else {
         return 1;
      }
   }
}