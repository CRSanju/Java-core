package programs;

public class StudentEnMain {

	public static void main(String[] args) {
		StudentEn st = new StudentEn();
		st.setData(22, 5.6,"Sanju");
		System.out.println(st.getAge());
		System.out.println(st.getHeight());
		System.out.println(st.getName());

	}

}
