import java.io.FileNotFoundException;

/**
 * Main driver class for CloudStorageList.
 * Program to read in file and generate a report for items in list.
 *
 * @author Christina L
 * @version 11/20/2020
 */
public class CloudStoragePart3   {

   /**
    * Main method.
    * Prints and sorts file that is read in.
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args) {
      CloudStorageList list = null;
         
      if (args.length == 0)   {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
      else {
         list = new CloudStorageList();
         try   {
            list.readFile(args[0]);
            System.out.println(list.generateReport());
            System.out.println(list.generateReportByName());
            System.out.println(list.generateReportByMonthlyCost());
            System.out.println(list.generateInvalidRecordsReport());            
         }
   
         catch (FileNotFoundException e)  {
            System.out.println("*** Attempted to read file: " 
                  + e.getMessage());
         }
                       
      }         
         
   }
      
}   
