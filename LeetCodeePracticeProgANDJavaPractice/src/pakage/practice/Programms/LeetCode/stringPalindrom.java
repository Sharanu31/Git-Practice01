package pakage.practice.Programms.LeetCode;

public class stringPalindrom {

	public static void main(String[] args) {
		String a = "Radar";
		//String a = "SFDS"; //non palindrom
		String revStr = "";
		for (int i = (a.length() - 1); i >= 0; --i) {
			revStr = revStr + a.charAt(i);
		}
		if (revStr.equalsIgnoreCase(a)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
