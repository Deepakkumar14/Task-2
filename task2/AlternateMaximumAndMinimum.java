package task2;
import java.util.*;
public class AlternateMaximumAndMinimum{
    public static void alternateMaxAndMin(int[] array,int length){
        int[] newArray = new int[length];
        Arrays.sort(array);
         int maximum=length-1,minimum=0;
        for(int i=0;i<length;i++)
        {
            if(i%2==0){
                newArray[i]=array[maximum];
                maximum--;
            }
               
            else{
                newArray[i]=array[minimum];
                minimum++;
            }
        }
         System.out.println("Array after alternate sorting:"+Arrays.toString(newArray));
       
      
    }
}