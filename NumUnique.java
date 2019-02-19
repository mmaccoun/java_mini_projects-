/* Write a method numUnique that takes three integers as parameters 
and that returns the number of unique integers among the three. */
public class NumUnique{
   public static void main(String[] args){
      numUnique(1,1,1);
      numUnique(2,1,3);
      numUnique(1,1,2);
   }
   public static int numUnique(int x, int y, int z){
      int unique = 0;
      if (x != y){
         unique++;
      }
      if(x != z){
         unique++;
      }
      if (y != z){
         unique++;
      }
      System.out.println(unique);
      return unique;
   }

}