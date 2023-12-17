package pakage.Static;

public class Program1 {

	// Static variable
	static int v1 = 100;

	// Static method
	public static void test() {
		System.out.println("this is test() of demo class");
	}

	public static void main(String ar[]) {
		System.out.println("V1 is = " + v1);
		test();
	}
}

//if static methods and variables in same class then it can be directly accessable 
