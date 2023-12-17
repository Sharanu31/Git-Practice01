package StaticMethodInterface;

interface A {

	static void aa() {
		System.out.println("Hello world aa");
	}

	default void bb() {
		System.out.println("Hello world from bb");
	}
}

public class Main implements A {

	public static void main(String[] args) {

		Main main = new Main();
		//main.aa(); // by creating a object we cant call the static method from intrface class
		main.bb();

		// Static method from the interface can only be called bv there class name
		A.aa();

	}

}
