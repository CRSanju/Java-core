package p53SerializationAndDeerialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String path = "C:\\Users\\sanju\\Pictures\\Adv\\student.txt";
		
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student student = (Student)ois.readObject();
		System.out.println(student);
		fis.close();
		ois.close();
	}

}
