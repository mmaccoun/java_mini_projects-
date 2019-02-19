/*Write a method rollDoubles that takes a Random object as a 
parameter and that prints information about a dice simulation. 
The method uses the Random object to simulate the rolling of two 
dice until doubles comes up (i.e., until the two numbers that come 
 are the same). Assume we are using standard dice that have six 
 sides numbered 1 through 6. */


import java.util.*;
public class RollDoubles{
   public static void main(String[] args){
      Random r = new Random();
      rollDoubles(r);
   
   }
   public static void rollDoubles(Random r){
      int dice1 = r.nextInt(6) + 1;
      int dice2 = r.nextInt(6) + 1;
      int count = 1;
      System.out.println("Next roll " + dice1 + ", " + dice2);
      while (dice1 != dice2) {
         count++;
         dice1 = r.nextInt(6) + 1;
         dice2 = r.nextInt(6) + 1;
         System.out.println("Next roll " + dice1 + ", " + dice2);
      }
   System.out.println("doubles after " + count + " rolls ");
   }

}