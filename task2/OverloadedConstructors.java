package task2;
public class OverloadedConstructors  
 { 
  public OverloadedConstructors() 
   { 
      System.out.println("Employee Details:"); 
   } 
 public OverloadedConstructors(String name) 
{ 
   System.out.println("Employee name: " +name); 
 } 
public OverloadedConstructors(String company, int id) 
{ 
   System.out.println("Company name: " +company); 
   System.out.println("Employee id: " +id); 
 } 
} 
