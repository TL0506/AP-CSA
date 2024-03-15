import java.util.*;


public class MyFirstSort{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Choose your first value: ");
      int a = scan.nextInt();
      
      System.out.println("Choose your second value: ");
      int b = scan.nextInt();
      
      System.out.println("Choose your third value: ");
      int c = scan.nextInt();
      
      int max = 0;
      int med = 0;
      int min =0;
      
      if(a > b || a > c){
         if(b > c){
            max = a;
            med = b;
            min = c;
         }
         else if(c > b){
            max = a;
            med = c;
            min = b;
         }
      }
      if( b > a || b > c){
         if( a > c){
             max = b;
             med = a;
             min = c;
         }
         else if( c > a){
            max = b;
            med = a;
            min = c;
         }
      }
      if( c > b || c > a){
         if(b > a){
            max = c;
            med = b;
            min = a;
         }  
         else if(a > b){
            max = c;
            med = a;
            min = b;
         }
      
      }
      if( a == b && b == c){
         max = a;
         med = b;
         min = c;
      }
      System.out.println( " Your order sort is: " + min + " , " + med + " , " + max);
   } 
  
}