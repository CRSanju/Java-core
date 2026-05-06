package myProject;

public class sample4 {
	public static void main(String[] args) {
		String fname = "Ajay";
		String lname = "Kumar";
		String fullName = sample4.printName(fname, lname);
		System.out.println(fullName);
	}
	public static String printName(String firstName, String lastName)
	{
		String fullName = firstName + lastName;
		return fullName;
	}
	
	

}
