/* Write a static method called sameDashes that takes two strings as parameters and that returns whether or not they have 
dashes in the same places (returning true if they do and returning false otherwise) */
public class sameDashes{
    public static void main(String[] args){
        same("hello-world", "hello--kitty");
        same("same-string","same-string");
        same("this-string-is-funkyyy","this-is-a-regular-string");
        
    }
    public static boolean same(String string1, String string2){
        int string1Spot = 0;
        int string2Spot = 0;
        String characterTest = "";
        for(int i = 0; i < string1.length(); i++){
            if (string1.charAt(i)== '-'){
                string1Spot++;
            }
        }
        for(int i = 0; i < string2.length(); i++){
            if (string2.charAt(i)== '-'){
                string2Spot++;
            }
        }
        if (string2Spot == string1Spot){
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }

    }

}
    
