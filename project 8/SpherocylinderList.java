import java.text.DecimalFormat;

/**
 * Program to store the list name and an array of Spherocylinder objects.
 *
 * @author Christinaa Danks
 * @version 10/30/2020
 */
public class SpherocylinderList  {
   
   // instance variables
   private String listName;
   private Spherocylinder[] sList;
   private int number;
   
   // constructor
   /**
    * Constructors for SpherocylinderList.
    * @param listNameIn to set the name of list.
    * @param sListIn to set an array of objects.
    * @param numberIn to set the number of objects in the array.
    */
   public SpherocylinderList(String listNameIn, Spherocylinder[] sListIn, 
                     int numberIn)  {
      listName = listNameIn;
      sList = sListIn;
      number = numberIn;                       
   }
   
   // methods
   /**
    * Method to get the name of the list.
    * @return name of the list.
    */
   public String getName() {
      return listName;
   }
   
   /**
    * Method to get the number of objects in the list.
    * @return number of Spherocylinder objects in the list.
    */
   public int numberOfSpherocylinders()   {
      if (number > 0)   {
         return number;
      }
      return 0;
   }
   
   /**
    * Method to get the total surface areas.
    * @return total surfaces areas for all objects in list.
    */
   public double totalSurfaceArea() {
      double total = 0;
      if (number > 0)   {
         for (int i = 0; i < number; i++) {
            total += sList[i].surfaceArea();
         }
         return total;      
      }
      return 0.0;
   }
   
   /**
    * Method to get the total volumes.
    * @return total volumes for all objects in list.
    */
   public double totalVolume()   {
      double total = 0;
      
      if (number > 0)   {
         for (int i = 0; i < number; i++) {
            total += sList[i].volume();
         }
         return total;
      }
      return 0.0;
   }
   
   /**
    * Method to calculate the average surface area.
    * @return average surface area for all objects in the list.
    */
   public double averageSurfaceArea()  {
      if (number > 0)   {
         double aveS = totalSurfaceArea() / number;
         return aveS;
      }
      return 0.0;
   }
   
   /**
    * Method to calculate the average volume.
    * @return average volume for all objects in the list.
    */
   public double averageVolume() {
      if (number > 0)   {
         double aveV = totalVolume() / number;
         return aveV;
      }
      return 0.0;
   }
   
   /**
    * Method for String representation of objects.
    * @return String representing name of list and summary items. 
    */
   public String toString()   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      
      String output  = "----- Summary for " + getName() + " -----";
      output += "\nNumber of Spherocylinders: " + numberOfSpherocylinders();
      output += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
      output += "\nTotal Volume: " + df.format(totalVolume());
      output += "\nAverage Surface Area: " + df.format(averageSurfaceArea());
      output += "\nAverage Volume: " + df.format(averageVolume());

      return output;
   }
   
   /**
    * Method to get the array of objects.
    * @return the array of Spherocylinder objects.
    */
   public Spherocylinder[] getList()   {
      return sList;
   }
   
   /**
    * Method to add a new Spherocylinder object.
    * @param label for Spherocylinder label.
    * @param radius for Spherocylinder radius.
    * @param height for Spherocylinder cylinder height.
    */
   public void addSpherocylinder(String label, double radius, 
                        double height)  {
                        
      Spherocylinder s = new Spherocylinder(label, radius, height);
      sList[number] = s;
      number++;
   }
   
   /**
    * Method to find a Spherocylinder in the list.
    * @return the found Spherocylinder object if it exists,
    * otherwise return null.
    * @param label for Spherocylinder label.
    */
   public Spherocylinder findSpherocylinder(String label)   {
      
      for (int i = 0; i < number; i++) {
         if (sList[i].getLabel().equalsIgnoreCase(label))   {
            Spherocylinder s = sList[i];
            return s;
         }
      }
      return null;
   }
   
   /**
    * Method to delete a Spherocylinder object.
    * @return the deleted Spherocylinder object, otherwise null.
    * @param label for Spherocylinder label.
    */
   public Spherocylinder deleteSpherocylinder(String label) {
      Spherocylinder result = null;
      
      for (int i = 0; i < number; i++) {
         if (sList[i].getLabel().equalsIgnoreCase(label))  {
         
            Spherocylinder s = sList[i];
            
            for (int j = i; j < number - 1; j++)   {
               sList[j] = sList[j + 1];
            }
            sList[number - 1] = null;
            number--;
            return s;
         }
      }
      return result;
   }
   
   /**
    * Method to edit an object.
    * @return true if object is found and edited,
    * otherwise return false.
    * @param label for Spherocylinder label.
    * @param radius for Spherocylinder radius.
    * @param height for Spherocylinder cylinder height.
    */
   public boolean editSpherocylinder(String label, double radius, 
                        double height) {
    
      for (int i = 0; i < number; i++) {
         if (sList[i].getLabel().equalsIgnoreCase(label))   {
            sList[i].setRadius(radius);
            sList[i].setCylinderHeight(height);
            return true;
         }
      }
      return false;
   }
   
   /**
    * Method to find object with the largest volume.
    * @return Spherocylinder with the largest volume.
    */
   public Spherocylinder findSpherocylinderWithLargestVolume() {
            
      if (number > 0)   {
         Spherocylinder largest = sList[0];
         for (int i = 0; i < number; i++) {
            if (largest.volume() <= sList[i].volume()) {
               largest = sList[i];
            }
         }
         return largest;
      }
      return null;
   }



}