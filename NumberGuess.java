//***********************************************************************************
//  File: NumberGuess.java       Name:Tiffany Lin
//
//    JOptionPane Project
//***********************************************************************************

import javax.swing.JOptionPane; // imports JOptionPane so it could be used
import java.util.*;

public class NumberGuess 
{
   public static void main(String args[])
   {
      int repeat = 0; // yes option is 0
      do
      {
         int t = 1; // tries 
         int g; // guess
         Random num = new Random(); // random class 
         int n = num.nextInt(100)+1; // generates a number between 1- 100
         JOptionPane.showMessageDialog(null, " Welcome to a number guessing game between 1- 100." + "\n" + " You have 7 tries in total!");
         do // do this loop 
         {
            t++; // increments
            g = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your guess."));// asking for user input as a guess
               if(g == n && t == 2) // if they guessed the number during their first try
                  JOptionPane.showMessageDialog(null,"Since you got it in the first try u get a happy face =)"); 
               else if(g == n && t <= 8) // if they get the answer tell user how many tries it took them 
                  JOptionPane.showMessageDialog(null, "You got it! " + "\n" + " It took you " + (t-1) + " tries!");

               else if(g != n){

                  if(g > n){ // if the number user guess is greater than the number show its too high
                     JOptionPane.showMessageDialog(null," Your number is too high."); 
                                                                                   
                  }   
                  else{ // when lower show number is too low
                     JOptionPane.showMessageDialog(null," Your number is too low."); 
                     
                  }
               if(t==8) // after 7 times they dont get the answer 
                  JOptionPane.showMessageDialog(null, "You used all your chances. Try again next time!");
              }
                                                   
         }while(t<= 7 && g!= n); // do it while the tries equal or less than 7 and if they dont guess it right
        
         repeat = JOptionPane.showConfirmDialog(null, "Would you like to play again?"); // asking if they would like to repeat
      } while (repeat == JOptionPane.YES_OPTION);  // If they press yes the things inside would happen
   
   }
 
}