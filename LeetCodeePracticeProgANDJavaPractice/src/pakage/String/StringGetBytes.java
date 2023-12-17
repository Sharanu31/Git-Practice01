package pakage.String;

import java.util.Arrays;

public class StringGetBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java";
		byte[] byteArray;

		try {
			byteArray = str.getBytes("UTF-8");
			System.out.println(Arrays.toString(byteArray));

			byteArray = str.getBytes("UTF-16");
			System.out.println(Arrays.toString(byteArray));

			// wrong encoding
			// throws an exception
			byteArray = str.getBytes("UTF-34");
			System.out.println(Arrays.toString(byteArray));

		} catch (Exception e) {
			System.out.println(e + " encoding is wrong");
		}
	}

}
