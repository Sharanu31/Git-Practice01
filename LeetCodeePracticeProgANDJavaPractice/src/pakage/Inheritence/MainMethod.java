package pakage.Inheritence;

class SuperCLass {

	public final void methodOne() {
		System.out.println("This is the Method One form super class");

	}
}

class ChildClass extends SuperCLass {

	public void methodTwo() {
		System.out.println("This is the Method Two from ChildClass ");
	}
}

public class MainMethod {

	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		childClass.methodOne();
		childClass.methodTwo();

	}

}
