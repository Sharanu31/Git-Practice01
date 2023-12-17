package lambdaExpression;

public class Main {

	public static void main(String[] args) {
		//int a = 0;
		InClass inerClass = () -> {
			int a = 2;
			return "100";
		};
		System.out.println(inerClass.getSalary());
	}

}
