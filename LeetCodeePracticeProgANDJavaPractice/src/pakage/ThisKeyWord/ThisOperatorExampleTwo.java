package pakage.ThisKeyWord;

class Sample1 {

	String name;
	int id;
	double sal;

	public Sample1(String name, int id, double sal) {
		name = name;
		id = id;
		sal = sal;
		return;
	}

	public void display() {
		System.out.println(" name is " + this.name);

		System.out.println(" id is " + this.id);

		System.out.println(" sal is " + this.sal);
	}
}

public class ThisOperatorExampleTwo {

	public static void main(String[] args) {
		Sample1 s = new Sample1("Sharanu", 6679, 28000);
		s.display();
	}

}
