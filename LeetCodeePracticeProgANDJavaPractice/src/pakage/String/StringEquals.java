package pakage.String;

public class StringEquals {

	public static void main(String[] args) {
		String str1 = "Sharanu";
		String str2 = "ShaRanu";
		String str3 = "Sharanu";

		if (str1.equals(str2)) {
			System.out.println("String str1 is equal to str1");
		} else {
			System.out.println("String str1 is not equal to str1");
		}

		if (str1.equals(str3)) {
			System.out.println("String str1 is equal str3");
		} else {
			System.out.println("String is not equal");
		}

	}

}
