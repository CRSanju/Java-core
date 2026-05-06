package constructor;

public class Student1 {
	
	int age;
    String name;
    double per;
    
    Student1 (int age, String name, double per) {
    	this.age = age;
    	this.name = name;
    	this.per = per;
    }
    
    void display() {
    	System.out.println(age);
    	System.out.println(name);
    	System.out.println(per);
    }

}
