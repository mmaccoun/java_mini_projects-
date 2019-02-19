/* Write a static method called findValentines that takes a Random object and an integer n as 
parameters and thatrandomly generates and prints n responses to the question “Will you be my valentine?”,
 reporting the number andpercentage of “yes” answers. Each response should be chosen randomly
  between one of two choices: “yes” withprobability 20% (1/5 likelihood) and 
  “no” with probability 80% (4/5) likelihood */
import java.util.*;
public class Valentine{
   public static void main(String[] args){
      Random r = new Random();
      findValentines(r, 100);
   
   }
   public static void findValentines(Random r, int n){
      int yesCount = 0;
      int noCount = 0;
      int totalCount = 1;
      int response = r.nextInt(2);
      System.out.println("Will you be my valentine?");
      if (response == 0){
         System.out.print("yes");
      } else {
         System.out.print("no");
      }
      
      while (totalCount != n){
         if (response == 0){
            System.out.print(", yes");
            yesCount++;
         } else {
            noCount++;
            System.out.print (", no");
         }
         response = r.nextInt(2);
         totalCount++;
 
      }
      System.out.println();
      double yesResponse = (double)yesCount / (double) totalCount * 100;
      System.out.print(yesCount + " yeses, " + yesResponse + "%");

      
   
   }
}