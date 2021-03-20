import java.text.DecimalFormat;

/**
 * Spherocylinder class that stores the label, radius, and cylinder height. 
 * @author Christinaa Danks
 * @version 10/22/2020
 */

public class Spherocylinder implements Comparable<Spherocylinder> {

   // instance variables
   private String label = "";
   private double radius = 0.0;
   private double height = 0.0;
   private static int count = 0;
      
   // constructors
   /**
    * Constructors for Spherocylinder.
    * @param labelIn to set label name.
    * @param radiusIn to set radius value.
    * @param heightIn to set cylinder height value.
    */
   public Spherocylinder(String labelIn, double radiusIn, double heightIn)   {
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(heightIn);
      count++;
   }
   
   /**
    * Method to get label name.
    * @return spherocylinder label name.
    */
   public String getLabel() {
      return label;
   }
   
   /**
    * Method to set label.
    * @param labelIn is the new label.
    * @return new label if label is not null.
    */
   public boolean setLabel(String labelIn) {
      boolean isSetLabel = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isSetLabel = true;
      }
      return isSetLabel;
   }
   
   /**
    * Method to get radius.
    * @return radius.
    */
   public double getRadius()   {
      return radius;
   }
   
   /**
    * Method to set the radius.
    * @param radiusIn is the new radius.
    * @return new radius if radius is non-negative.
    */
   public boolean setRadius(double radiusIn) {
      boolean isSetRadius = false;
      if (radiusIn >= 0)   {
         radius = radiusIn;
         isSetRadius = true;
      }
      return isSetRadius;
   }
   
   /**
    * Method to get the cylinder height.
    * @return cylinder height.
    */
   public double getCylinderHeight()   {
      return height;
   }
   
   /**
    * Method to set the cylinder height.
    * @param heightIn is the new cylinder height.
    * @return new height if height is non-negative.
    */
   public boolean setCylinderHeight(double heightIn)  {
      boolean isSetCylinderHeight = false;
      if (heightIn >= 0)   {
         height = heightIn;
         isSetCylinderHeight = true;
      }
      return isSetCylinderHeight;
   }
   
   /**
    * Method to calculate the circumference.
    * @return circumference.
    */
   public double circumference() {
      double c = 2 * Math.PI * radius;
      return c;
   }
   
   /**
    * Method to calculate the surface area.
    * @return surface area.
    */
   public double surfaceArea()   {
      double cSA = 2 * Math.PI * radius * (2 * radius + height);
      return cSA;
   }
   
   /**
    * Method to calculate the volume.
    * @return volume.
    */
   public double volume()  {
      double volume1 = Math.PI * Math.pow(radius, 2);
      double volume2 = (4.0 / 3) * radius + height;
      double v = volume1 * volume2;
      return v;
   }
   
   /**
    * Method to return String representation of Spherocylinder.
    * @return String representing Spherocylinder objects.
    */
   public String toString()   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "Spherocylinder \"" + label + "\" with radius " 
         + radius + " and cylinder height " + height + " has:\n";
      output += "\tcircumference = " + df.format(circumference()) + " units\n";
      output += "\tsurface area = " + df.format(surfaceArea())
         + " square units\n";
      output += "\tvolume = " + df.format(volume()) + " cubic units";
      
      return output;
   }
   
   /**
    * Method to count the number of Spherocylinder objects.
    * @return amount of Spherocylinders.
    */
   public static int getCount()   {
      return count;
   }
   
   /**
    * Method to reset the amount of Spherocylinders.
    */
   public static void resetCount()  {
      count = 0;
   }
   
   /**
    * Method to check for object equality.
    * @param obj for Spherocylinder object.
    * @return false if the object is not a spherocylinder.
    */
   public boolean equals(Object obj) {
      if (!(obj instanceof Spherocylinder))  {
         return false;
      }
      else  {
         Spherocylinder d = (Spherocylinder) obj;
         return (label.equalsIgnoreCase(d.getLabel())
                  && Math.abs(radius - d.getRadius()) < .000001
                  && Math.abs(height - d.getCylinderHeight())
                        < .000001);         
      }
   
   }
   
   /**
    * Method required for equals method.
    * @return 0 if equals method is used.
    */
   public int hashCode()   {
      return 0;
   }
   
   /**
    * Method to compare two Spherocylinder objects.
    * @param obj for Spherocylinder object.
    * @return 0, 1 or -1 depending on volume comparison.
    */
   public int compareTo(Spherocylinder obj)  {
      if (Math.abs(this.volume() - obj.volume()) < 0.000001) {
         return 0; // consider them equal and return 0
      }
      
      else if (this.volume() < obj.volume()) {
         return -1;
      }
      
      else  {
         return 1; // if greater than
      }
   }

}