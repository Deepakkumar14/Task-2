package task2;
import java.util.Scanner;
import java.io.FileOutputStream; 
public class Task2Runner {
	public static void main(String[] args) {
		System.out.println("1.Find the second largest element");
		System.out.println("2.Segregate 0 to left and 1 to right ");
                System.out.println("3.Alternate max and min");
		System.out.println("4.Reverse letters in string");
		System.out.println("5.Reverse words in string");
		System.out.println("6.Array to arraylist conversion");
		System.out.println("7.Pojo classes");
		System.out.println("8.Constructor overloading");
		System.out.println("9.Enum for Rainbow");
		System.out.println("10.File creation");
		System.out.println("11.Exit");
		while(true) {
			Scanner input = new Scanner(System.in);
			int array[],length;
			String string;
			System.out.println("Enter Your Choice:");
			int choice=input.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter the length of array");
        				length=input.nextInt();
         				System.out.println("Enter the array elements");
         				array= new int[length];
        				for(int i=0;i<length;i++) {
          				  array[i]=input.nextInt();
        				}
					SecondLargestElement.secondMaximum(array,length);
					break;
				case 2:
					System.out.println("Enter the length of array");
      				        length=input.nextInt();
        			        System.out.println("Enter the array elements");
        				array = new int[length];
        				for(int i=0;i<length;i++) {
        				    array[i]=input.nextInt();
       					 }
					Segregate1And0.segregation(array);
					break;
				case 3:
 					System.out.println("Enter the length of array");
       					length=input.nextInt();
       				        System.out.println("Enter the array elements");
        			        array= new int[length];
               				for(int i=0;i<length;i++) {
          				  array[i]=input.nextInt();
        				}
					AlternateMaximumAndMinimum.alternateMaxAndMin(array,length);
					break;
				case 4:
					System.out.println("Enter the String");
					input.nextLine();
         				string =input.nextLine();
					ReversedLettersInString.reversedLetters(string);
					break;
				case 5:
					System.out.println("Enter the String");
					input.nextLine();
         				string =input.nextLine();
					ReverseWordsInString.reverseWords(string);
					break;
				case 6:
					System.out.println("Enter the length of array");
        				length=input.nextInt();
      	   				System.out.println("Enter the array elements");
       				        array = new int[length];
       					for(int i=0;i<length;i++) {
           				 array[i]=input.nextInt();
        				}
					ArrayToArraylistConversion.arrayToArraylist(array,length);
					break;
				case 7:
   					 PojoClass obj=new PojoClass();
                   			 obj.setName("Deepak");
                   			 obj.setEmployeeId(1714010);
                   			 obj.setAge(21);
                   			 obj.setPhoneNumber(8778631360l);
                   			 obj.setCity("Thiruvannamalai");
                  			  System.out.println(obj);
					break;
					
				case 8:
    					new OverloadedConstructors(); 
      					new OverloadedConstructors("Deep"); 
      					new OverloadedConstructors("Zoho", 12234); 
					break;
				case 9:
					 EnumForRainbow.enumRainbow();
					break;
				case 10:
					CreateFile.fileCreation();
					break;
				}
			if(choice==11) {
				break;
				
			}
		}
	}
}