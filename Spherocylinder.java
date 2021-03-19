import java.text.DecimalFormat;

/**
 * Spherocylinder class that stores the label, radius, and cylinder height. 
 * @author Christinaa Danks
 * @version 10/16/2020
 */

public class Spherocylinder   {

   // instance variables
   private String label = "";
   private double radius = 0.0;
   private double height = 0.0;
   private static int count = 0;
      
   // constructors
   /**
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
    * @return spherocylinder label name.
    */
   public String getLabel() {
      return label;
   }
   
   /**
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
    * @return radius.
    */
   public double getRadius()   {
      return radius;
   }
   
   /**
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
    * @return cylinder height.
    */
   public double getCylinderHeight()   {
      return height;
   }
   
   /**
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
    * @return circumference.
    */
   public double circumference() {
      double c = 2 * Math.PI * radius;
      return c;
   }
   
   /**
    * @return surface area.
    */
   public double surfaceArea()   {
      double cSA = 2 * Math.PI * radius * (2 * radius + height);
      return cSA;
   }
   
   /**
    * @return volume.
    */
   public double volume()  {
      double volume1 = Math.PI * Math.pow(radius, 2);
      double volume2 = (4.0 / 3) * radius + height;
      double v = volume1 * volume2;
      return v;
   }
   
   /**
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
    * @return amount of Spherocylinders.
    */
   public static int getCount()   {
      return count;
   }
   
   /**
    * reset the amount of Spherocylinders.
    */
   public static void resetCount()  {
      count = 0;
   }
   
   /**
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
    * @return 0 if equals method is used.
    */
   public int hashCode()   {
      return 0;
   }
   

}