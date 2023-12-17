package DefaultMethodsInterface;

interface Parent {
	default void sayHello() {
		System.out.println("Hello");
	}

}

class Child implements Parent {

	
	
	/* if we want to ovveride the defalut method from interface we can also do that
	 * @Override public void sayHello() { // TODO Auto-generated method stub
	 * Parent.super.sayHello(); }
	 */
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.sayHello();
	}

}
