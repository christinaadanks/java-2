
/**
 * Main driver class for CloudStorage.
 *
 * @author Christinaa Danks
 * @version 11/5/2020
 */ 
public class CloudStoragePart1   {

   /**
    * Program to print out cloud storage data.
    * 
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args) {
   
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 44.0, 12.0);
      System.out.println(c1.toString() + "\n");
      
      SharedCloud c2 = new SharedCloud("Cloud Two", 20.0, 25.0, 18.0);
      System.out.println(c2.toString() + "\n");
      
      SharedCloud c3 = new SharedCloud("Cloud Three", 30.0, 25.0, 30.0);
      System.out.println(c3.toString() + "\n");
      
      PublicCloud c4 = new PublicCloud("Cloud Four", 50.0, 25.0, 30.0);
      System.out.println(c4.toString() + "\n");
      
      PersonalCloud c5 = new PersonalCloud("Cloud Five", 50.0, 25.0, 30.0);
      System.out.println(c5.toString());
      
   }
}