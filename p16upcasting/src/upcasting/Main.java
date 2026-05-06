package upcasting;

public class Main {

	public static void main(String[] args) {
		
		Developer dev;
		dev = new JavaDeveloper();
		dev.work();
		dev.project();
		
		dev = new PythonDeveloper();
		dev.work();
		dev.project();

	}

}
