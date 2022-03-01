import java.text.DecimalFormat;
/** Creates tetrahedronlist.
   *
   * @author Jacob Knight
   * @version 3/25/21
   */
public class TetrahedronList {
   // instance variables
   private String name;
   private Tetrahedron[] list;
   private int number;
  /** constructor.
   *@param nameIn is used
   *@param listIn is used
   *@param numberIn is used
   */
   public TetrahedronList(String nameIn, Tetrahedron[] listIn, 
      int numberIn) {
      name = nameIn;
      list = listIn;
      number = numberIn;
   }
  /** Returns name of given list.
   *@return String name of list
   */
   public String getName() {
      return name;
   }
   /** Returns list.
    * @return list Array
    */
   public Tetrahedron[] getList() {
      return list;
   }
   /** Returns number of tetrahedrons in a given list.
    * @return int number of tetrahedrons
    */
   public int numberOfTetrahedrons() {
      return number;
   }
   /** Returns total surface area of the list.
    * @return double total surface area
    */
   public double totalSurfaceArea() {
      double totalSurfaceArea = 0.0;
      for (int i = 0; i < number; i++) {
         Tetrahedron temp = list[i];
         totalSurfaceArea += temp.surfaceArea();
      }
      return totalSurfaceArea;
   }
   /** Returns total volume of the list.
    * @return double total volume
    */
   public double totalVolume() {
      double totalVolume = 0.0;
      for (int i = 0; i < number; i++) {
         Tetrahedron temp = list[i];
         totalVolume += temp.volume();
      }
      return totalVolume;
   }
   /** Return average surface area of the list.
    * @return double average surface area
    */
   public double averageSurfaceArea() {
      double averageSurfaceArea = 0.0;
      if (number != 0) {
         averageSurfaceArea = totalSurfaceArea() / (double) number;
      }
      return averageSurfaceArea;
   }
   /** Return average volume of the list.
    * @return double average volume
    */
   public double averageVolume() {
      double averageVolume = 0.0;
      if (number != 0) {
         averageVolume = totalVolume() / (double) number;
      }
      return averageVolume;
   }
   /** Creates and returns the summary info of a list.
    * @return String summary info
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + getName() + " -----";
      output += "\nNumber of Tetrahedrons: " + number;
      output += "\nTotal Surface Area: " + df.format(totalSurfaceArea())  
         + " square units";
      output += "\nTotal Volume: " + df.format(totalVolume()) 
         + " cubic units";
      output += "\nAverage Surface Area: " + df.format(averageSurfaceArea()) 
         + " square units";
      output += "\nAverage Volume: " + df.format(averageVolume())   
         + " cubic units";
      return output;
   }
   /** Adds a new Tetrahedron object.
    * @param labelIn is used
       * @param edgeIn is used
    */
   public void addTetrahedron(String labelIn, double edgeIn) {
      list[number++] = new Tetrahedron(labelIn, edgeIn);
   }
   /** Finds Tetrahedron from list.
    * @param labelIn is used
    * @return Tetrahedron found tetrahedron
    */
   public Tetrahedron findTetrahedron(String labelIn) {
      for (int i = 0; i < number; i++) {
         if (list[i].getLabel().equalsIgnoreCase(labelIn)) {
            return list[i];
         }
      }
      return null;
   }
   /** Deletes Tetrahedron from list.
    * @param labelIn is used
    * @return Tetrahedron deleted tetrahedron
    */
   public Tetrahedron deleteTetrahedron(String labelIn) {
      Tetrahedron result = findTetrahedron(labelIn);
      for (int i = 0; i < number; i++) {
         if (list[i].getLabel().equalsIgnoreCase(labelIn)) {
            for (int j = i; j < number; j++) {
               list[j] = list[j + 1];
            }
            list[number--] = null;
         }
      }
      return result;
   }
   /** Edits Tetrahedron from list.
    * @param labelIn is used
    * @param edgeIn is used
    * @return boolean if edit was completed
    */
   public boolean editTetrahedron(String labelIn, double edgeIn) {
      boolean result = false;
      for (int i = 0; i < number; i++) {
         if (list[i].getLabel().equalsIgnoreCase(labelIn)) {
            list[i].setEdge(edgeIn);
            result = true;
         }
      }
      return result;
   }
  /** Finds the Tetrahedron with the largest volume.
   *@return max returns Tetrahedron with largest volume.
   */
   public Tetrahedron findTetrahedronWithLargestVolume()
   {
      if (numberOfTetrahedrons() > 0) {
         Tetrahedron max = list[0];
         for (int i = 1; i < numberOfTetrahedrons(); i++) {
            if (list[i].volume() > max.volume()) {
               max = list[i];
            } 
         }
         return max;
      }
      return null;
   }
}