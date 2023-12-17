package concepts.of.Exception;

import java.io.FileReader;

public class JavaException {

	static void name(String s) {
		try {
			if (s.length() > 6) {
				System.out.println("Came inside the method");
			} else {
				throw new Exception("Length is less then 6");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws Exception {

		/*
		 * name("Sharan"); name("SHaranappa");
		 */
		FileReader fileReader = new FileReader("example.txt");
	}

}
