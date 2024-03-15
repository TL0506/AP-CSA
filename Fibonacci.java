//********************************************************************************
//   File: Fibonacci.java             NAme: Tiffanylin
//
//   JOptionPane Project 
//********************************************************************************
import javax.swing.JOptionPane;

public class Fibonacci
{
   public static void main(String args[])
   {
      int repeat = 0;
      
      do
      {
         int i = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter an integer."));
         
         JOptionPane.showMessageDialog(null,fibonacci(i));
         repeat = JOptionPane.showConfirmDialog(null, "Would you like to do it again?");
         
      } while(repeat == JOptionPane.YES_OPTION);
      
   }
   public static String fibonacci(int n)
   {
     String result = "";
     int a = 0, b = 1, c;
     result += a + " " + b;
     
     int count = 2; 
      // keep track of how many numbers have been printed on the current line
     while (b < n) {
      c = a + b;
      result += " " + c;
      a = b;
      b = c;
      count++;  // increment the count
      
      // If we have printed 10 numbers on the current line, start a new line
      if (count % 10 == 0) {
        result += "\n";
      }
    }

    return result;
     
          
     
      
   }
   
}