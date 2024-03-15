//***********************************************************************
//    File: ArrayMethods.java      Author: Tiffany Lin
//   
//    Using Arrays as methods
//************************************************************************
import javax.swing.JOptionPane;
import java.util.*;

public class ArrayMethods
{
   public static void main(String[] args)
   {
      String array;
      int repeat = 0;
      do{
         int choose = Integer.parseInt(JOptionPane.showInputDialog(null, "1. reverseArray \n2. largestValue" + "\n" 
                                                                   + "What Method would you like to Choose?"));
         if(choose == 1){
            int s = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter how many elements would you like to put in."));
            int[] e = new int[s];
            for(int i =0; i< s; i++){
               e[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter element # " + i + ": "));
            }
            int[] reversedArr = reverseArray(e);
            
            JOptionPane.showMessageDialog(null," Your reversed Array is : " );  
            printArray(reversedArr);
                   
             
         }
            
         else if(choose == 2){
         }
         
         else
             JOptionPane.showMessageDialog(null, "This number is not in the Array System!");   
         
      
         repeat = JOptionPane.showConfirmDialog(null, "Would you like to do another Method?");
      }while (repeat == JOptionPane.YES_OPTION);  
   }
   public static int[] reverseArray(int[] arr) 
   {
      int[] reversedArr = new int[arr.length];
      for (int i = 0; i < arr.length; i++) {
         reversedArr[i] = arr[arr.length - 1 - i];
       }
    return reversedArr;
  }
  public static void printArray(int[] array)
  {
     StringBuilder builder = new StringBuilder();
     for(int a =0; a < array.length; a++)
     {
      builder.append(array[a]).append(" ");
     }
     JOptionPane.showMessageDialog(null, builder.toString());
  }
   
}