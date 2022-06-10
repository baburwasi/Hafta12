package IsPalindrome;
import java.util.*;
public class IsPalindrome {
	public static void main (String[]args) {
		System.out.println("lütfen bir string giriniz :");
		Scanner in = new Scanner (System.in);
		String inputString=in.nextLine();
		
		System.out.println(isPalindrome(inputString));
	}
public  static boolean isPalindrome(String text) {
	if (text==null) {
		return false ;
	}
	int left=0;
	int right =text.length()-1;
	while (left==right) {
		if (text.charAt(left++)!=text.charAt(right--)) {
			return false ;
		}
	}
	return true ;
}

}
