package pakage.Static;


public class Program2 {

	//non-static variable
	int a=79;
	
	//non-static method
	public void names() {
		System.out.println("Sharanu");
	}
	
	public static void main(String[] args) {
			System.out.println(a);
			names();
	}
}

//non static variable or methods cannot be accessed directly


