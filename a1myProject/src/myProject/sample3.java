package myProject;

public class sample3 {
	public static void main(String[] args) {
		String res = sample3.getDetails("Sanju", 22, "Male", 88);
		System.out.println(res);
	}
	
	public static String getDetails( String name, int age,String gender, int marks ) {
		String result = "name: " + name + " age: " + age + " gender: " + gender + " marks: " + marks;
		return result;	
	}

}
