package task2;
import java.util.*;
public class SecondLargestElement{
    public static void secondMaximum(int[] array,int length){
        Arrays.sort(array);
        System.out.println("The second largest element is:"+ (array[length-2]));
      
    }
}