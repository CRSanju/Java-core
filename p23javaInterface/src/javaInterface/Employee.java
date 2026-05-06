package javaInterface;

public class Employee implements Work,Project {
	
     public  void working() {
    	 System.out.println("The person is working");
     }
     
     public void doProject() {
    	 System.out.println("The person is doing his Project");
     }

}
