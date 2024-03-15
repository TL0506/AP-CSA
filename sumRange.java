public class sumRange
{ 
   public static void main(String[] args)
   {
      System.out.println(sumRange(2,5));
      System.out.println(sumRange(2.5f,4));
   }
   public static int sumRange(float a, float b) 
   {
      int sum = 0;
      for(float i =a;a<=b;i++){
          sum+=i;
      }
      return sum;
   }   
} 