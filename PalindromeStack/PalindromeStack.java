package PalindromeStack;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeStack {
	public static void main (String[]args) {
		System.out.println("Lütfen bir string giriniz :");
		Scanner input =new Scanner (System.in);
		String inputString =input.nextLine();
		
		
		Stack stack = new Stack();
		
		for (int index =0;index<inputString.length();index++) {
			stack.push(inputString.charAt(index));
		}
		String reverseString="";
		while (!stack.isEmpty()) {
			reverseString=reverseString+stack.pop();
		}
		if (inputString.equals(reverseString)) {
			System.out.println("girilen kelime palindromdur");
		}
		else {
			System.out.println("girilen kelime palindrom degildir");
		}
	}
}