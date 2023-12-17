package pakage.Static;

public class Program3 {

	public static void main(String[] args) {
		{
			// Static methods and variables from different class starts
			System.out.println("V1 is = " + v1);
			test();
			// We cannot access Static methods and variables from different class directly
			// ends

			// Need to called using the class name of the static methods and variables
			System.out.println("V1 is = " + Demo.v1);
			Demo.test();
		}

	}

}
