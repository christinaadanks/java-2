import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Spherocylinder jUnit test.
 * @author Christinaa Danks
 * @version 10/21/2020
 */

public class SpherocylinderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Tests getLabel method.
    * Should return the label name.
    */
   @Test public void getLabelTest()  {
      Spherocylinder rick = new Spherocylinder("Rick", 0.5, 0.25);
      Assert.assertEquals("Rick", rick.getLabel());
   }
   
   /**
    * Tests setLabel method for a false value.
    * Should return true if String parameter is not null.
    */
   @Test public void setLabelTrueTest()  {
      Spherocylinder rick = new Spherocylinder("Rick", 0.5, 0.25);
      Assert.assertEquals(true, rick.setLabel("Rick"));

   }
   
   /**
    * Tests setLabel method for a true value. 
    * Should return false if String parameter is null.
    */
   @Test public void setLabelFalseTest()  {
      Spherocylinder rick = new Spherocylinder(null, 0.5, 0.25);
      Assert.assertEquals(false, rick.setLabel(null));
   }
   
   /**
    * Tests getRadius method.
    * Should return the radius value.
    */
   @Test public void getRadiusTest()   {
      Spherocylinder rick = new Spherocylinder("Rick", 0.5, 0.25);
      Assert.assertEquals(0.5, rick.getRadius(), .000001);
   } 
   
   /**
    * Tests setRadius method for a true value.
    * Should return true if radius is non-negative.
    */
   @Test public void setRadiusTrueTest()   {
      Spherocylinder rick = new Spherocylinder("Rick", 0.5, 0.25);
      Assert.assertEquals(true, rick.setRadius(0.5));
      Assert.assertEquals(true, rick.setRadius(0.0));
   } 
   
   /**
    * Tests setRadius method for a false value.
    * Should return false if radius is negative or 0.
    */
   @Test public void getRadiusFalseTest()   {
      Spherocylinder rick = new Spherocylinder("Rick", -2.0, 0.25);
      Assert.assertEquals(false, rick.setRadius(-2.0));
   } 
   
   /**
    * Tests getCylinderHeight method.
    * Should return cylinder height value.
    */
   @Test public void getCylinderHeightTest()   {
      Spherocylinder rick = new Spherocylinder("Rick", 0.5, 0.25);
      Assert.assertEquals(0.25, rick.getCylinderHeight(), .000001);
   } 
   
   /**
    * Tests setCylinderHeight method for a true value.
    * Should return true if cylinder height is non-negative.
    */
   @Test public void setCylinderHeightTrueTest()   {
      Spherocylinder rick = new Spherocylinder("Rick", 0.5, 0.25);
      Assert.assertEquals(true, rick.setCylinderHeight(0.25));
      Assert.assertEquals(true, rick.setCylinderHeight(0.0));

   } 
   
   /**
    * Tests setCylinderHeight method for a false value.
    * Should return false if cylinder height is negative or 0.
    */
   @Test public void setCylinderHeightFalseTest()   {
      Spherocylinder rick = new Spherocylinder("Rick", 0.5, -1.5);
      Assert.assertEquals(false, rick.setCylinderHeight(-1.5));
   } 
   
   /**
    * Tests circumference method.
    */
   @Test public void circumferenceTest()   {
      Spherocylinder morty = new Spherocylinder("Morty", 10.8, 10.1);
      Assert.assertEquals(67.858401, morty.circumference(), .000001);
   } 
   
   /**
    * Tests surfaceArea method.
    */
   @Test public void surfaceAreaTest()   {
      Spherocylinder morty = new Spherocylinder("Morty", 10.8, 10.1);
      Assert.assertEquals(2151.111322, morty.surfaceArea(), .000001);
   } 
   
   /**
    * Tests volume method.
    */
   @Test public void volumeTest()   {
      Spherocylinder morty = new Spherocylinder("Morty", 10.8, 10.1);
      Assert.assertEquals(8977.666494, morty.volume(), .000001);
   } 
   
   /**
    * Tests toString method.
    */
   @Test public void toStringTest()   {
      Spherocylinder morty = new Spherocylinder("Morty", 10.8, 10.1);
      String expected = "Spherocylinder \"Morty\" with radius 10.8 and "
         + "cylinder height 10.1 has:\n"
         + "\tcircumference = 67.858 units\n"
         + "\tsurface area = 2,151.111 square units\n"
         + "\tvolume = 8,977.666 cubic units";
      Assert.assertEquals(expected, morty.toString());
   } 
   
   /**
    * Tests getCount method.
    * Should return the number of Spherocylinder objects.
    */
   @Test public void getCountTest()   {
      Spherocylinder morty = new Spherocylinder("Morty", 10.8, 10.1);
      morty.resetCount();
      Assert.assertEquals(0, morty.getCount());
   } 
   
   /**
    * Tests resetCount method.
    * Should return 0.
    */
   @Test public void resetCountTest()   {
      Spherocylinder morty = new Spherocylinder("Morty", 10.8, 10.1);
      morty.resetCount();
      Assert.assertEquals(0, morty.getCount());
   } 
   
   /**
    * Tests equals method for a false value.
    * Should return false if the Spherocylinder objects do not match.
    */
   @Test public void equalsFalseTest()   {
      Spherocylinder morty = new Spherocylinder("Morty", 10.8, 10.1);
      Spherocylinder morty2 = new Spherocylinder("Morty", 10.8, 0.25);
      Assert.assertEquals(false, morty.equals(morty2));   
      
      Spherocylinder morty3 = new Spherocylinder("Morty", 0.5, 10.1);
      Assert.assertEquals(false, morty.equals(morty3));
      
      Spherocylinder beth = new Spherocylinder("Beth", 10.8, 10.1);
      Assert.assertEquals(false, morty.equals(beth));
      
      Assert.assertEquals(false, morty.equals("not an object"));
   } 
 
   
   /**
    * Tests equals method for a true value.
    * Should return true if the Spherocylinder objects match.
    */
   @Test public void equalsTrueTest()  {
      Spherocylinder rick = new Spherocylinder("Rick", 10.8, 10.1);
      Spherocylinder rick2 = new Spherocylinder("Rick", 10.8, 10.1);
      Assert.assertEquals(true, rick.equals(rick2));
   }
   
   /**
    * Tests hashCode method.
    * Should return 0 if equals method is used.
    */
   @Test public void hashCodeTest()   {
      Spherocylinder morty = new Spherocylinder("Morty", 10.8, 10.1);
      Assert.assertEquals(0, morty.hashCode());
   } 
   
   /**
    * Tests compareTo method.
    * Should return true if the volumes are equal.
    */
   @Test public void compareToTest1()  {
      Spherocylinder rick = new Spherocylinder("Rick", 10.8, 10.1);
      rick.volume();
      
      Spherocylinder morty = new Spherocylinder("Morty", 10.8, 10.1);
      morty.volume();
      
      Assert.assertTrue(rick.compareTo(morty) == 0);
   }
   
   /**
    * Tests compareTo method.
    * Should return true if it returns a negative value.
    */
   @Test public void compareToTest2()  {
      Spherocylinder rick = new Spherocylinder("Rick", 5.5, 10.1);
      rick.volume();
      
      Spherocylinder morty = new Spherocylinder("Morty", 10.8, 10.1);
      morty.volume();
      
      Assert.assertTrue(rick.compareTo(morty) < 0);
   }
   
   /**
    * Tests compareTo method.
    * Should return true if it returns a positive value.
    */
   @Test public void compareToTest3()  {
      Spherocylinder rick = new Spherocylinder("Rick", 10.8, 10.1);
      rick.volume();
      
      Spherocylinder morty = new Spherocylinder("Morty", 0.25, 10.1);
      morty.volume();
      
      Assert.assertTrue(rick.compareTo(morty) > 0);
   }
}
