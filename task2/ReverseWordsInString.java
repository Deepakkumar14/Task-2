package task2;
import java.util.*;
public class ReverseWordsInString{
    public static void reverseWords(String string){
         String[] stringArray=string.split(" ");
         String reversedString="";
        for(int i=stringArray.length-1;i>=0;i--){
            reversedString+=stringArray[i]+" ";
        }
            System.out.println("Reversed words in the given string");
            System.out.print(reversedString);
	    System.out.println("");
    }
}