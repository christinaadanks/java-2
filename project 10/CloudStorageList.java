import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.io.File;

/**
 * Program to read in data file and generate reports.
 *
 * @author Christina L
 * @version 11/11/2020
 */
public class CloudStorageList {
      
      // fields
   private CloudStorage[] cloudArray;
   private String[] invalidArray;
      
   /**
    * Constructor for CloudStorageList.
    */
   public CloudStorageList()  {
      cloudArray = new CloudStorage[0];
      invalidArray = new String[0];
   }
      
   /**
    * Method to get array of cloud storage objects.
    * @return CloudStorage array.
    */
   public CloudStorage[] getCloudStorageArray() {
      return cloudArray;
   }
      
   /**
    * Method to get array of invalid records.
    * @return invalid records array.
    */
   public String[] getInvalidRecordsArray()  {
      return invalidArray;
   }
      
   /**
    * Method to add object to CloudStorage array.
    * @param obj for new CloudStorage object to add.
    */
   public void addCloudStorage(CloudStorage obj)   {
      cloudArray = Arrays.copyOf(cloudArray, cloudArray.length + 1);
      cloudArray[cloudArray.length - 1] = obj;
   }
      
   /**
    * Method to add record to invalid records array.
    * @param record for new record to add.
    */
   public void addInvalidRecord(String record)  {
      invalidArray = Arrays.copyOf(invalidArray, invalidArray.length + 1);
      invalidArray[invalidArray.length - 1] = record;
   }
      
   /**
    * Method to read in file.
    * @param fileName for file name.
    * @throws FileNotFoundException for when file doesn't exist.
    */
   public void readFile(String fileName) throws FileNotFoundException   {
      // Read file
      Scanner scan = new Scanner(new File(fileName));
         
      while (scan.hasNextLine()) {
         String line = scan.nextLine();
         Scanner scan2 = new Scanner(line);
           
         scan2.useDelimiter(",");
         
         String category = scan2.next();
         char code = category.charAt(0);
         CloudStorage object;
            
         switch (code) {
            case 'D':
               object = new DedicatedCloud(scan2.next(), 
                        Double.parseDouble(scan2.next()), 
                        Double.parseDouble(scan2.next()));
               addCloudStorage(object);
               break;
            case 'S':
               object = new SharedCloud(scan2.next(), 
                        Double.parseDouble(scan2.next()), 
                        Double.parseDouble(scan2.next()), 
                        Double.parseDouble(scan2.next()));
               addCloudStorage(object);
               break;
            case 'C':
               object = new PublicCloud(scan2.next(), 
                        Double.parseDouble(scan2.next()), 
                        Double.parseDouble(scan2.next()), 
                        Double.parseDouble(scan2.next()));
               addCloudStorage(object);
               break;
            case 'P':
               object = new PersonalCloud(scan2.next(), 
                        Double.parseDouble(scan2.next()), 
                        Double.parseDouble(scan2.next()), 
                        Double.parseDouble(scan2.next()));
               addCloudStorage(object);
               break;
            default:
               break;
         }
      }
      
   }
      
   /**
    * Method to produce original order report.
    * @return monthly cloud storage report.
    */
   public String generateReport()   {
      String report = "-------------------------------";
      report += "\nMonthly Cloud Storage Report";
      report += "\n-------------------------------";
      for (CloudStorage object : cloudArray) {
         report += "\n" + object;
      }
         
      return report;
   }
      
   /**
    * Method to sort report by natural order.
    * @return monthly cloud storage report by name.
    */
   public String generateReportByName()   {
      CloudStorage[] sortByName = Arrays.copyOf(cloudArray, cloudArray.length);
      Arrays.sort(sortByName);
         
      String report = "-----------------------------------------";
      report += "\nMonthly Cloud Storage Report (by Name)";
      report += "\n-----------------------------------------";
      for (CloudStorage object : sortByName) {
         report += "\n" + object;
      }
         
      return report;
   }
      
   /**
    * Method to sort report by monthly cost.
    * @return monthly cloud storage report by cost.
    */
   public String generateReportByMonthlyCost()  {
      CloudStorage[] sortByCost = Arrays.copyOf(cloudArray, cloudArray.length);
      Arrays.sort(sortByCost, new MonthlyCostComparator());
         
      String report = "-------------------------------------------------";
      report += "\nMonthly Cloud Storage Report (by Monthly Cost)";
      report += "\n-------------------------------------------------";
      for (CloudStorage object: sortByCost)  { 
         report += "\n" + object;
      }
      return report;
   }
}
