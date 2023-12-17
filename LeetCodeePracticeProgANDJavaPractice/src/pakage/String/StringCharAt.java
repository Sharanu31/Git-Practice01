package pakage.String;

public class StringCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Learn Java";
		String str2 = "Learn\nJava";

		// first character
		System.out.println(str1.charAt(0)); // 'L'

		// seventh character
		System.out.println(str1.charAt(6)); // 'J'

		// sixth character
		System.out.println(str2.charAt(5)); // '\n'
		
		System.out.println(str2);
	}

}
