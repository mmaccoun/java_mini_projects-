/* Write a static method called hasOddEven that takes three integers 
as parameters and that returns true if there is at least one odd
and at least one even among the three numbers and that returns 
false otherwise. */
public class HasOddEven{
   public static void main (String[] args) {
      hasOddEven(1,2,3);
      hasOddEven(2,2,2);
      hasOddEven(3,3,3);
   
   }
   public static boolean hasOddEven(int x, int y, int z){
      if (x % 2 == 1 && y % 2 == 0 || x % 2 == 1 && z % 2 == 0 || x % 2 == 0 && y % 2 == 1 || x % 2 == 0 && z % 2 == 1){
         System.out.println("true");
         return true;
     }
     System.out.println("false");
     return false;
  
   }
}