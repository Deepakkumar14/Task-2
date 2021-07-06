package task2;
import java.util.*;
public class ReversedLettersInString{
    public static void reversedLetters(String string){
         String charString="";
        for(int i=string.length()-1;i>=0;i--)
            charString+=string.charAt(i);
        System.out.println("Reversed List of characters in the given string");
        System.out.print(charString);
	System.out.println("");
    }
}