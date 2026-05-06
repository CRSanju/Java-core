package constructor;

public class Student {
      int age;
      double height;
      String name;
      
       Student(int a, double b, String c) {
    	  age = a;
    	  height = b;
    	  name = c;
      }
       
       void display() {
    	   System.out.println(age);
    	   System.out.println(height);
    	   System.out.println(name);
       }
}
