package pakage.String;

public class StringSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "java is fun";

		// extract substring from index 0 to 3
		System.out.println(str1.substring(0, 4));

		// ava substring() With Only Start Index

		String str2 = "program";

		// 1st character to the last character
		System.out.println(str2.substring(0)); // program

		// 4th character to the last character
		System.out.println(str2.substring(3)); // gram
		
		
		//Java substring() With Start and End Index
		
		System.out.println(str2.substring(0, 3));  //pro
		
		
		System.out.println(str2.substring(0, 5));
	}

}
