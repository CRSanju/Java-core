package worker;

public class main {
   public static void main(String[] args) {
	   Employee e1 = new Employee();
	   
	   e1.id = 12;
	   e1.name = "Raju";
	   System.out.println(e1.id);
	   System.out.println(e1.name);
	   e1.work();
	   
	   Employee e2 = new Employee();
	   
	   e2.id = 15;
	   e2.name = "Rani";
	   System.out.println(e2.id);
	   System.out.println(e2.name);
	   e2.work();
   }
   
}
