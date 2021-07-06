package task2;
import java.io.FileOutputStream;    
public class CreateFile{    
public static void fileCreation(){      
try(FileOutputStream fileOutputStream =new FileOutputStream("C:/Users/DEEPAK/Desktop/Task-2/sample.txt")){ 
String msg = "Programmatically created file.\nThese words were written programmatically.\nAll is Well. Be happy & enjoy the moment.";      
byte byteArray[] = msg.getBytes(); //converting string into byte array      
fileOutputStream.write(byteArray);  
System.out.println("Message written to file successfuly!");      
}
catch(Exception exception){  
       System.out.println(exception);  
}      
}      
}    