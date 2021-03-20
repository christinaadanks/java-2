import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Test;

/**
 * SpherocylinderListTest jUnit Test.
 *
 * @author Christinaa Danks
 * @version 10/30/2020
 */

public class SpherocylinderListTest {

   
   /**
    * Tests getName() method.
    * Should return the list name.
    */
   @Test public void getNameTest()   {
      Spherocylinder[] sList = new Spherocylinder[10];
      SpherocylinderList rick = new SpherocylinderList("rick", 
               sList, sList.length);
      
      Assert.assertEquals("rick", rick.getName());
   }

   /**
    * Tests numberOfSpherocylinders() method with objects in list.
    * Should return the number of Spherocylinder objects in list.
    */
   @Test public void numberOfSpherocylindersTest1() {
      Spherocylinder morty = new Spherocylinder("morty", 10.1, 6.1);
      Spherocylinder rick = new Spherocylinder("rick", 0.5, 12.0);
      Spherocylinder jerry = new Spherocylinder("jerry", 1.1, 0.25);
      Spherocylinder[] sList = {morty, rick, jerry};
      
      SpherocylinderList s = new SpherocylinderList("list", 
               sList, sList.length);
               
      Assert.assertEquals(3, s.numberOfSpherocylinders());
   }

   /**
    * Tests numberOfSpherocylinders() method with no objects in list.
    * Should return 0.
    */
   @Test public void numberOfSpherocylindersTest2() {
      Spherocylinder[] sList = {};
      SpherocylinderList s = new SpherocylinderList("list", 
               sList, sList.length);
               
      Assert.assertEquals(0, s.numberOfSpherocylinders());
   }
   
   /**
    * Tests totalSurfaceAreaTest() method.
    * Should return the total surface area of all objects in list.
    */
   @Test public void totalSurfaceAreaTest1()  {
      Spherocylinder morty = new Spherocylinder("morty", 10.1, 6.1);
      Spherocylinder rick = new Spherocylinder("rick", 0.5, 12.0);
      Spherocylinder jerry = new Spherocylinder("jerry", 1.1, 0.25);
      Spherocylinder[] sList = {morty, rick, jerry};
      
      SpherocylinderList s = new SpherocylinderList("list", 
               sList, sList.length);
                              
      Assert.assertEquals(1726.776402, s.totalSurfaceArea(), .000001);
   }
   
   /**
    * Tests totalSurfaceAreaTest() method with no objects in list.
    * Should return 0.0.
    */
   @Test public void totalSurfaceAreaTest2() {
      Spherocylinder[] sList = {};
      
      SpherocylinderList s = new SpherocylinderList("list", 
               sList, sList.length);
               
      Assert.assertEquals(0.0, s.totalSurfaceArea(), .000001);
   }
   
   /**
    * Tests totalVolume() method.
    * Should return the total volume of all objects in list.
    */
   @Test public void totalVolumeTest1()  {
      Spherocylinder morty = new Spherocylinder("morty", 10.1, 6.1);
      Spherocylinder rick = new Spherocylinder("rick", 0.5, 12.0);
      Spherocylinder jerry = new Spherocylinder("jerry", 1.1, 0.25);
      Spherocylinder[] sList = {morty, rick, jerry};
      
      SpherocylinderList s = new SpherocylinderList("list", 
               sList, sList.length);
               
      Assert.assertEquals(6287.079311, s.totalVolume(), .000001);
   }
   
   /**
    * Tests totalVolume() method with no objects in list.
    * Should return 0.0.
    */
   @Test public void totalVolumeTest2() {
      Spherocylinder[] sList = {};
      
      SpherocylinderList s = new SpherocylinderList("list", 
               sList, sList.length);
               
      Assert.assertEquals(0.0, s.totalVolume(), .000001);
   }
   
   /**
    * Tests averageSurfaceArea() method.
    * Should return the average surface area of all objects in list.
    */
   @Test public void averageSurfaceAreaTest1()   {
      Spherocylinder morty = new Spherocylinder("morty", 10.1, 6.1);
      Spherocylinder rick = new Spherocylinder("rick", 0.5, 12.0);
      Spherocylinder jerry = new Spherocylinder("jerry", 1.1, 0.25);
      Spherocylinder[] sList = {morty, rick, jerry};
      
      SpherocylinderList s = new SpherocylinderList("list", 
               sList, sList.length);
               
      Assert.assertEquals(575.592134, s.averageSurfaceArea(), .000001);
   }
   
   /**
    * Tests averageSurfaceArea() method with no objects in list.
    * Should return 0.0.
    */
   @Test public void averageSurfaceAreaTest2() {
      Spherocylinder[] sList = {};
      
      SpherocylinderList s = new SpherocylinderList("list", 
               sList, sList.length);
               
      Assert.assertEquals(0.0, s.averageSurfaceArea(), .000001);
   }
   
   /**
    * Tests averageVolume() method.
    * Should return the average volume of all objects in list.
    */
   @Test public void averageVolumeTest1()  {
      Spherocylinder morty = new Spherocylinder("morty", 10.1, 6.1);
      Spherocylinder rick = new Spherocylinder("rick", 0.5, 12.0);
      Spherocylinder jerry = new Spherocylinder("jerry", 1.1, 0.25);
      Spherocylinder[] sList = {morty, rick, jerry};
      
      SpherocylinderList s = new SpherocylinderList("list", 
               sList, sList.length);
               
      Assert.assertEquals(2095.693104, s.averageVolume(), .000001);
   }
   
   /**
    * Tests averageVolume() method with no objects in list.
    * Should return 0.0.
    */
   @Test public void averageVolumeTest2() {
      Spherocylinder[] sList = {};
      
      SpherocylinderList s = new SpherocylinderList("list", 
               sList, sList.length);
               
      Assert.assertEquals(0.0, s.averageVolume(), .000001);
   }
   
   /**
    * Tests toString() method.
    * Should return the String representation of objects.
    */
   @Test public void toStringTest()  {
      Spherocylinder morty = new Spherocylinder("morty", 10.1, 6.1);
      Spherocylinder rick = new Spherocylinder("rick", 0.5, 12.0);
      Spherocylinder jerry = new Spherocylinder("jerry", 1.1, 0.25);
      Spherocylinder[] sList = {morty, rick, jerry};
      
      SpherocylinderList s = new SpherocylinderList("list", 
               sList, sList.length);
               
      String expected = "----- Summary for list -----"
         + "\nNumber of Spherocylinders: 3"
         + "\nTotal Surface Area: 1,726.776"
         + "\nTotal Volume: 6,287.079"
         + "\nAverage Surface Area: 575.592"
         + "\nAverage Volume: 2,095.693";
         
      Assert.assertEquals(expected, s.toString());
   }
   
   /**
    * Tests getList() method.
    * Should return the array of objects.
    */
   @Test public void getListTest()  {
      Spherocylinder morty = new Spherocylinder("morty", 10.1, 6.1);
      Spherocylinder rick = new Spherocylinder("rick", 0.5, 12.0);
      Spherocylinder jerry = new Spherocylinder("jerry", 1.1, 0.25);
      Spherocylinder[] sList = {morty, rick, jerry};
      
      SpherocylinderList s = new SpherocylinderList("list", 
               sList, sList.length);
      
      Assert.assertEquals(sList, s.getList());
   }
   
   /**
    * Tests addSpherocylinder() method.
    * Does not return anything.
    */
   @Test public void addSpherocylinderTest() {
      Spherocylinder[] sList = new Spherocylinder[4];
      sList[0] = new Spherocylinder("morty", 10.1, 6.1);
      sList[1] = new Spherocylinder("rick", 0.5, 12.0);
      sList[2] = new Spherocylinder("jerry", 1.1, 0.25);

      
      SpherocylinderList s = new SpherocylinderList("list", sList, 3);
      
      // Tests original number of objects.
      Assert.assertEquals(3, s.numberOfSpherocylinders());
      
      Spherocylinder summer = new Spherocylinder("summer", 2.2, 3.0);
      s.addSpherocylinder("summer", 2.2, 3.0);
      Spherocylinder[] sList2 = s.getList();
      
      // Tests if item was added.
      Assert.assertEquals(summer, sList2[3]);
      // Tests new number of objects.
      Assert.assertEquals(4, s.numberOfSpherocylinders());
   }
   
   /**
    * Tests findSpherocylinder() method.
    * Should return the object if found, otherwise null.
    */
   @Test public void findSpherocylinderTest()   {
      Spherocylinder morty = new Spherocylinder("morty", 10.1, 6.1);
      Spherocylinder rick = new Spherocylinder("rick", 0.5, 12.0);
      Spherocylinder jerry = new Spherocylinder("jerry", 1.1, 0.25);
      Spherocylinder[] sList = {morty, rick, jerry};
      
      SpherocylinderList s = new SpherocylinderList("list", 
               sList, sList.length);
      
      // Result if object is found.
      Assert.assertEquals(morty, s.findSpherocylinder("MoRtY"));
      
      // Result if no object is found.
      Assert.assertEquals(null, s.findSpherocylinder("none"));
   }
   
   /**
    * Tests deleteSpherocylinder() method.
    * Should return the object that was deleted, otherwise null.
    */
   @Test public void deleteSpherocylinderTest() {
      Spherocylinder morty = new Spherocylinder("morty", 10.1, 6.1);
      Spherocylinder rick = new Spherocylinder("rick", 0.5, 12.0);
      Spherocylinder jerry = new Spherocylinder("jerry", 1.1, 0.25);
      Spherocylinder[] sList = {morty, rick, jerry};
      
      SpherocylinderList s = new SpherocylinderList("list", 
               sList, sList.length);
      
      // Result of object that was deleted.
      Assert.assertEquals(morty, s.deleteSpherocylinder("MoRtY"));
      Assert.assertEquals(null, s.deleteSpherocylinder("none"));
      
      // Result for number of remaining objects after deletion (should be 2).
      s.deleteSpherocylinder("morty");
      Assert.assertEquals(2, s.numberOfSpherocylinders());
   }
   
   /**
    * Tests editSpherocylinder() method.
    * Should return true if object is found and can be edited, otherwise false.
    */
   @Test public void editSpherocylinderTest()   {
      Spherocylinder morty = new Spherocylinder("morty", 10.1, 6.1);
      Spherocylinder rick = new Spherocylinder("rick", 0.5, 12.0);
      Spherocylinder jerry = new Spherocylinder("jerry", 1.1, 0.25);
      Spherocylinder[] sList = {morty, rick, jerry};
      
      SpherocylinderList s = new SpherocylinderList("list", 
               sList, sList.length);
               
      Spherocylinder find = s.findSpherocylinder("MoRtY");
      
      // True test.
      Assert.assertEquals(true, s.editSpherocylinder("MoRtY", 10.1, 6.1));
      
      // False test.
      Assert.assertEquals(false, s.editSpherocylinder("none", 0.0, 3.0));
   }
   
   /**
    * Tests findSpherocylinderWithLargestVolume() method.
    * Should return the object with the largest volume, otherwise null.
    */
   @Test public void findSpherocylinderWithLargestVolumeTest1() {
      Spherocylinder morty = new Spherocylinder("morty", 10.1, 6.1);
      Spherocylinder rick = new Spherocylinder("rick", 0.5, 12.0);
      Spherocylinder jerry = new Spherocylinder("jerry", 1.1, 0.25);
      Spherocylinder[] sList = {morty, rick, jerry};
      
      SpherocylinderList s = new SpherocylinderList("list", 
               sList, sList.length);
           
      Assert.assertEquals(morty, s.findSpherocylinderWithLargestVolume());
   }
   
   /**
    * Tests findSpherocylinderWithLargestVolume() method with no objects.
    * Should return null.
    */
   @Test public void findSpherocylinderWithLargestVolumeTest2() {
      Spherocylinder[] sList = {};
      
      SpherocylinderList s = new SpherocylinderList("list", 
               sList, sList.length);
           
      Assert.assertEquals(null, s.findSpherocylinderWithLargestVolume());
   }
   
   /**
    * Tests findSpherocylinderWithLargestVolume() method with equal objects.
    * Should return second array.
    */
   @Test public void findSpherocylinderWithLargestVolumeTest3()   {
      Spherocylinder summer = new Spherocylinder("summer", 4.1, 3.6);
      Spherocylinder beth = new Spherocylinder("beth", 4.1, 3.6);
      
      Spherocylinder[] sList = {summer, beth};
      
      SpherocylinderList s = new SpherocylinderList("list", 
               sList, sList.length);
      
      Assert.assertEquals(beth, s.findSpherocylinderWithLargestVolume());
   }
}