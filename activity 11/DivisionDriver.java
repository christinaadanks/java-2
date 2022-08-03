import javax.swing.JOptionPane;


/**
 * Driver class for Division class.
 * Program that asks for integers using a dialog box and divides
 * numerator by denominator. Apply try-catch blocks.
 *
 * @author Christina L
 * @version 11/16/2020
 */
 
public class DivisionDriver   {

   /**
    * Main method to get numerator and denominator from user.
    * Then print the integer and decimal division result using
    * a dialog box.
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args) {
   
      String numInput 
         = JOptionPane.showInputDialog("Enter the numerator: ");
      
      String denomInput
         = JOptionPane.showInputDialog("Enter the denominator: ");
      
      try   {
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
         
         String result = "Integer division: \n"
                     + Division.intDivide(num, denom)
                     + "\n\nFloating point division: \n"
                     + Division.decimalDivide(num, denom);
         
         JOptionPane.showMessageDialog(null, result, 
               "Result", JOptionPane.PLAIN_MESSAGE);
      }
      
      catch (NumberFormatException e)   {
         JOptionPane.showMessageDialog(null, 
               "Invalid input: enter numerical integer values only.",
               "Error", JOptionPane.ERROR_MESSAGE);
      }
      
      catch (IllegalArgumentException e)   {
         JOptionPane.showMessageDialog(null, e,
               "Error", JOptionPane.ERROR_MESSAGE);
      }
   
   }

}
