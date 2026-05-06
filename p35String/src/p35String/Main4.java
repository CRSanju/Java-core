package p35String;

public class Main4 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Java");
		System.out.println(sb);
		sb.append(" is a programming language");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append(" and also object language");
		System.out.println(sb.capacity());
		System.out.println(sb.reverse());

	}

}
