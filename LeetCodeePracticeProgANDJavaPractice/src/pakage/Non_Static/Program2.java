package pakage.Non_Static;

public class Program2 {

	public static void main(String[] args) {
		System.out.println(new Demo().k1);
		new Demo().count();
	}
}

//non static variable or methods cannot be accessed directly
