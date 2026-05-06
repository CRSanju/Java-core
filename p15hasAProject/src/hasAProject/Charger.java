package hasAProject;

public class Charger {
 
	String name;
	
	Charger(String s) {
		name = s;
		System.out.println("Charger created " + name);
	}
	
	void getCharger() {
		System.out.println("Charger used for charging.");
	}
}
