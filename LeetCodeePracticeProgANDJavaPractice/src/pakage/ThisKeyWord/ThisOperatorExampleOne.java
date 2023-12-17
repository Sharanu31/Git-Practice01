package pakage.ThisKeyWord;

class Sample {
	String name;
	int id;
	double sal;

	public Sample(String name, int id, double sal) {
// System.out.println("This is sample const...");
		this.name = name;
		this.id = id;
		this.sal = sal;
		return;
	}

	public void display() {
		System.out.println(" name is = " + name);
		;
		System.out.println(" id is = " + id);
		;
		System.out.println(" salary is = " + sal);
		;
	}
}

public class ThisOperatorExampleOne {

	public static void main(String[] args) {
		Sample s = new Sample("Ajay", 101, 2000);
		s.display();
		Sample s2 = new Sample("Rohit", 102, 2500);
		s2.display();
	}

}
