package task2;
import java.util.*;
public class PojoClass{
   
        private String name,city;
        private int age,employeeId;
        private long phoneNo;
   /*public String getName() {
       return name;
   }

    public int getEmployeeId() {
        return employeeId;
    }
    
    public long getPhoneNumber() {
        return phoneNo;
    }

    public int getAge() {
        return age;
    }
    
     public String getCity() {
        return city;
    }*/
    
     public void setName(String name) {
        this.name = name;
    }
    
      public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setCity(String city ) {
        this.city = city;
    }
    
    @Override
    public String toString() {
	return "Name :"+name+"\nID : "+employeeId+"\nAge : "+age+"\nPhonenumber : "+phoneNo+"\nCity : "+city;
	}

}
