package p35String;

public class Main2Immutable {

	public static void main(String[] args) {
		
		String str= "KodNest Technologies";
		
		System.out.println(str);
		System.out.println(str.equalsIgnoreCase(str));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		// System.out.println(str[0]); -- error
		System.out.println(str.charAt(0));
		System.out.println(str.contains("Nest"));
		System.out.println(str.contains("Kod"));
		System.out.println(str.endsWith("ies"));
		System.out.println(str.endsWith("Kod"));
		System.out.println(str.startsWith("Kod"));
		System.out.println(str.startsWith("KodNest"));
		System.out.println(str.indexOf("k"));
		System.out.println(str.indexOf("e"));
		System.out.println(str.lastIndexOf("e"));
		System.out.println(str.indexOf("m"));
		System.out.println(str.isBlank());
		System.out.println(str.isEmpty());
		System.out.println(str.length());
		System.out.println(str.replace("e", "Z"));
		
		
        char[] arr =  str.toCharArray();
        System.out.println(arr[0]);
        
       System.out.println(str.substring(5)); // will leave all the spaces we mentioned
       System.out.println(str.substring(5, 14)); // - 1 at the end 
       System.out.println(str.trim());
	

	}

}
