package hasAProject;

public class Mobile {
	OS o = new OS();
	
	Mobile() {
		System.out.println("Mobile created with OS installed");
	}
	
	void hasA(Charger c) {
		System.out.println("Charger acquired can be used for charging");
	}

}
