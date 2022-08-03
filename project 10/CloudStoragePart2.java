import java.io.FileNotFoundException;

/**
 * Main driver for CloudStorage project.
 *
 * @author Christina L
 * @version 11/11/2020
 */
public class CloudStoragePart2   {
   
   /**
    * Read in file and print out reports.
    * @param args Command line arguments - not used.
    * @throws FileNotFoundException for when file is not found.
    */
   public static void main(String[] args) throws FileNotFoundException  {
   
      if (args.length == 0)   {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
      
      else  {
         CloudStorageList list = new CloudStorageList();
         list.readFile(args[0]);
         
         System.out.println(list.generateReport());
         System.out.println(list.generateReportByName());
         System.out.println(list.generateReportByMonthlyCost());
      }
   
   }

}
