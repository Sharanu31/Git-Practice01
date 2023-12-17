package pakage.Non_Static;

public class Program1 {
	int z1 = 123;

	public void view() {
		System.out.println("this is view() of Abc");
		System.out.println("value of a = " + z1);
	}

	public static void main(String[] args) {
		System.out.println("Z1 = " + new Program1().z1);
		new Program1().view();
	}
}

//if static methods and variables in same class then it can be directly accessable 
