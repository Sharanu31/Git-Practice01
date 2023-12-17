package DefaultMethodsInterface;

interface parentClass {

	default void sayHello() {
		System.out.println("Hello World from parent");
	}
}

interface childClass {

	default void sayHello() {
		System.out.println("Hello World from child");
	}
}

public class MainTwo implements parentClass, childClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainTwo main = new MainTwo();
		main.sayHello();
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		parentClass.super.sayHello();
	}

}
