//***********************************************************************
//    File: MatrixMethods.java      Author: Tiffany Lin
//   
//    Using 2dArrays as methods
//************************************************************************
import javax.swing.JOptionPane; // imports the JOPtionPane class
import java.util.*; // imports all the util class

public class MartixMethods
{
   public static void main(String[] args)
   {
      int repeat = 0;
      do{
         String arr;
         int choose = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose the number of the method you would like to select." 
                                                                   + "\n1. sumofRow\n2. averageofRows\n3. largestRow"));   
         
         if(choose == 1){
            int row = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of rows"));
            int col = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of columns"));
            int[][] array = new int[row][col];
            for(int r = 0; r < array.length; r++)
            {
               for(int c =0; c < col; c++)
                  array[r][c]= Integer.parseInt(JOptionPane.showInputDialog("Enter the element " + r + "," + c + ":")); 
            } 
            arr = "The 2D array you have enter is :\n";
            for (int i = 0; i < row; i++) {
               for (int j = 0; j < col; j++) {
                  arr += array[i][j] + " ";
               }
               arr += "\n";
            }
            JOptionPane.showMessageDialog(null, arr);
         
            int rows = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the row you would like to find the sum."));
            int sumOfRow = sumOfRow(array,rows);
            JOptionPane.showMessageDialog(null, "The sum of the row you choose is : " + sumOfRow);
            
          }
         
         else if(choose == 2){
            int row = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of rows"));
            int col = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of columns"));
            int[][] array = new int[row][col];
            for(int r = 0; r < array.length; r++)
            {
               for(int c =0; c < col; c++)
                  array[r][c]= Integer.parseInt(JOptionPane.showInputDialog("Enter the element " + r + "," + c + ":")); 
            } 
            arr = "The 2D array you have enter is :\n";
            for (int i = 0; i < row; i++) {
               for (int j = 0; j < col; j++) {
                  arr += array[i][j] + " ";
               }
               arr += "\n";
            }
            JOptionPane.showMessageDialog(null, arr);
            
            double averageOfRows = averageOfRows(array);
            JOptionPane.showMessageDialog(null,"The average of the rows in your array is: \n" + averageOfRows);
         }
         else if(choose == 3){
            int row = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of rows"));
            int col = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of columns"));
            int[][] array = new int[row][col];
            for(int r = 0; r < array.length; r++)
            {
               for(int c =0; c < col; c++)
                  array[r][c]= Integer.parseInt(JOptionPane.showInputDialog("Enter the element " + r + "," + c + ":")); 
            } 
            arr = "The 2D array you have enter is :\n";
            for (int i = 0; i < row; i++) {
               for (int j = 0; j < col; j++) {
                  arr += array[i][j] + " ";
               }
               arr += "\n";
            }
            JOptionPane.showMessageDialog(null, arr);
            int largestrow = largestRow(array);
            JOptionPane.showMessageDialog(null, "Your largest row in your array is:\n" + largestrow);
         }
         else
            JOptionPane.showMessageDialog(null, " The number you have picked is not a Method!");  
         repeat = JOptionPane.showConfirmDialog(null,"Would you like to try another method?");
      }while( repeat == JOptionPane.YES_OPTION);
   }
    public static int sumOfRow(int[][] arr, int row) {
        int sum = 0;
        for (int i = 0; i < arr[row].length; i++) {
            sum += arr[row][i];
        }
        return sum;
    }

    public static double averageOfRows(int[][] arr) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                count++;
            }
        }
        return sum / count;
    }
    public static int largestRow(int[][] arr)
    {
      int Sum = 0;
      int Index = -1;
    
    // loop through each row in the matrix
      for (int i = 0; i < arr.length; i++) {
         int row = 0;
        
        // loop through each element in the row and calculate the sum
        for (int j = 0; j < arr[i].length; j++) {
            row += arr[i][j];
        }
        
        // if the sum of this row is larger than the current largest sum, update the largest sum and index
        if (row > Sum) {
            Sum= row;
            Index = i;
        }
    }
    
    // return the index of the row with the largest sum
    return Index;
}
    
}