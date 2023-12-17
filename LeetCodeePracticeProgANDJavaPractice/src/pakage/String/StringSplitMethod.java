package pakage.String;

import java.util.Arrays;

public class StringSplitMethod {

	public void withOutLimitParameter(String str) {
		System.out.println("This is With Out Limit Parameter");
		String[] result = str.split("::");
		System.out.println(Arrays.toString(result));

	}

	public void withLimitParameter(String str) {

		System.out.println("This is With Limit Parameter");

		String[] result = str.split("::", -2);
		System.out.println(Arrays.toString(result));

		result = str.split("::", 0);
		System.out.println(Arrays.toString(result));

		result = str.split("::", 2);
		System.out.println(Arrays.toString(result));

		result = str.split("::", 4);
		System.out.println(Arrays.toString(result));

		result = str.split("::", 10);
		System.out.println(Arrays.toString(result));

	}

	public void toSplitAtTheChar(String str) {
		String[] strValu;
		if(str.contains("+")){
			 strValu = str.split("\\+");
		}else {
			 strValu = str.split("\\-");
		}
		
		System.out.println(Arrays.toString(strValu));
	}

	public static void main(String[] args) {
		new StringSplitMethod().withOutLimitParameter("a::b::c::d::e");
		System.out.println("---------------------------");
		new StringSplitMethod().withLimitParameter("a::b::c::d::e");
		System.out.println("---------------------------");
		new StringSplitMethod().toSplitAtTheChar("ab+sd+ko+lp");
		new StringSplitMethod().toSplitAtTheChar("ab-sd-ko-lp");
		
	}

}
