package hasAProject;

public class Main {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		
		Charger c = new Charger("HP");
		m.hasA(c);
		m.o.checkOS();
		c.getCharger();

		// m = null;
		
		// m.o.checkOS();
	}

}
