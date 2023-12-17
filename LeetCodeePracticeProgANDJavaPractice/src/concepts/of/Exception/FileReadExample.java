package concepts.of.Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
	public static void main(String[] args) throws CustomException  {
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader("example.txt"));
			String line = reader.readLine();
			System.out.println(line);
		} catch (IOException e) {
			throw new CustomException("Message");
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
