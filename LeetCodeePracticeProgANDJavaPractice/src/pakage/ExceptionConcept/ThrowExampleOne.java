package pakage.ExceptionConcept;

public class ThrowExampleOne {

	private int actno = 1234;;
	private double bal = 520.5;

	public double getBal(int actno) {
		if (this.actno == actno) {
			return bal;
		} else {
			String msg = "invalid actno";
			// IllegalArgumentException ie = new IllegalArgumentException(msg);
			throw new ArithmeticException(msg);
		}
	}

	public static void main(String[] args) {
		int[] myNum = {10, 20, 30, 40};
		int num[] = new int[5];
		
		/*
		 * ThrowExampleOne a = new ThrowExampleOne(); double b = a.getBal(12334);
		 * System.out.println("balance =" + b);
		 */

		String msg = "Sharanu";
		for (int i = 0; i <= 6; i++) {
			System.out.println(msg);
			 throw new CustomeException("Exited");
		}

		System.out.println("Exited out of for loop");
		throw new IllegalArgumentException("Exited");
		
		
	}

}
