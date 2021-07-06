package task2;
import java.util.*;
public class ArrayToArraylistConversion{
    public static void arrayToArraylist(int[] array,int length){
         List<Integer> arrayList= new ArrayList<Integer>();
        for (int value : array) {
            arrayList.add(value);
        }
        System.out.println("After conversion"+"\n"+arrayList);
    }
}

/*
Enter the length of array
5
Enter the array elements
1 2 3 4 5
After conversion
[1, 2, 3, 4, 5]
*/



