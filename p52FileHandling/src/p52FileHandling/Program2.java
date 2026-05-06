package p52FileHandling;

import java.io.FileReader;
import java.io.FileWriter;

public class Program2 {

	public static void main(String[] args) {

		String path1 = "C:\\Users\\sanju\\Pictures\\Adv\\input.txt";
		String path2 = "C:\\Users\\sanju\\Pictures\\Adv\\output.txt";

		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader(path1);
			fw = new FileWriter(path2);

			int data;

			while ((data = fr.read()) != -1) {
				fw.write(data);
			}
			System.out.println("HI HI HI");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					fr.close();
				if (fw != null)
					fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

	}

}
