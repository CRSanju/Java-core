package constructor;

public class Student2Main {

	public static void main(String[] args) {
		Student2 st = new Student2(3,"Rahul");
		st.disp();
		
		Student2 sc = new Student2(st);
		sc.disp();
		
		Student2 sr = new Student2(st);
		sr.disp();

	}

}
