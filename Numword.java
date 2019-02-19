//program that takes a string as a parameter and returns the number of words
//in that string(words separated by white spaces )
public class Numword{
    public static void main(String[] args){
        numWords("Hello-there-my friends heh ");
        numWords("do you think google will ever hire me?      HmmmMMMMMmmmmm");
    }
    public static int numWords(String string){
        int characters = string.length();
        int words;
        if (string.equals("") || string.equals(" ")) {
         words = 0;
        } else {
         words = 1;
        }
        for(int i = 0; i < characters - 2; i++){

            if (string.charAt(i) != " ".charAt(0) && string.charAt(i+1) == " ".charAt(0) && i != characters - 3){
               words++;
            }       
        } 
      System.out.println(words);    
      return words;
    }
}