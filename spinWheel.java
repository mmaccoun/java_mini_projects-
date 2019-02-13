/* Write a static method called spinWheel that takes a Random object and an integer n as parameters and that simulates the spinning of a
 wheel until the number 20 comes up n times in a row. On the wheel are the numbers 20, 30, 40, 50, and 60 and each number should be equally
  likely to come up when the wheel is spun. Your method should report the individual spins as well as indicating how many times it takes to
   get n occurrences of 20 in a row. 
*/

import java.util.*;
public class spinWheel{
    public static void main (String[] args){
        Random r = new Random();
        spinWheel(r, 2);
    }
    public static void spinWheel(Random r, int n){
        int spinCount = 0;
        int inARow = 0;
        int range = r.nextInt(5);
        int spinner = (range + 2) * 10;
        System.out.print("spinner: ");
        System.out.print(spinner);
        boolean keepSpinning = true;
        while (keepSpinning){
            spinCount++;
            if (spinner == 20){
                inARow++;
                if (inARow == n){
                    keepSpinning = false;
                }
            } else {
                inARow = 0;
                range = r.nextInt(5);
                spinner = (range + 2) * 10;
                System.out.print(", "+ spinner);    
            }               
        }
    System.out.println(", "+ 20);
    System.out.print(n + " in a row after " + spinCount + " spins");
    } 
}
          

        
