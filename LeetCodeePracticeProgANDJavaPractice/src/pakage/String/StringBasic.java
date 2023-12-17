package pakage.String;

public class StringBasic {
	public static void main(String[] args) {
		String s1 = "jspider";
		String s2 = "jspider";
		String s3 = "JSPIDER";
		int len = s1.length();
		System.out.println("Length of String = " + len);
		boolean res1 = s1.equals(s2);
		System.out.println("Equals or not = " + res1);
		boolean res2 = s1.equals(s3);
		System.out.println("Equals or not = " + res2);
		boolean res3 = s1.equalsIgnoreCase(s3);
		System.out.println("Equals or not = " + res3);
		char c1 = s1.charAt(4);
		System.out.println("Character at index = " + c1);
		char[] ar1 = s1.toCharArray();
		for (int index = 0; index < ar1.length; index++) {
			System.out.print(ar1[index]);
		}
	}
}
