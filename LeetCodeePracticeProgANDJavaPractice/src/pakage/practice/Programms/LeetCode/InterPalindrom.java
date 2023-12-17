package pakage.practice.Programms.LeetCode;

public class InterPalindrom {

	public static void main(String[] args) {
		
		int acVal = 121;
		int temp = acVal;
		int revdVal = 0 ;
		while(temp!=0) {
			int digitemp = temp%10;
			revdVal = revdVal*10+digitemp;
			temp/=10;
			
		}
		
		if(revdVal==acVal) {
			System.out.println("True");
		}else {
			System.out.println("Flase");
		}
		
	}

}
