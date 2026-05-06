package opps;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 22;
		p1.name = "Sanju";
		p1.email = "Sanju123@gmail.com";
		
		System.out.println(p1.age);
		System.out.println(p1.name);
		System.out.println(p1.email);
		
		
		p1.work();
		p1.sleep();
		
		Person p2 =  new Person();
		p2.age = 23;
		p2.name = "Rohan";
		p2.email = "Rohan123@gmail.com";
		
		System.out.println(p2.age);
		System.out.println(p2.age);
		System.out.println(p2.age);

		p2.work();
		p2.sleep();
	}

}
