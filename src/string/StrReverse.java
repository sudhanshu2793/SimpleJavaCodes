package string;

import java.util.Scanner;

public class StrReverse {
	
	public static void main(String ar[]){
		
		Scanner scanInput = new Scanner(System.in);
		System.out.println("Enter the string to be reversed");
		String input = scanInput.next();
		System.out.println("Reverse of "+input+" using char array is "+StrReverse.reverseWithCharArray(input));
	}
	
	 static String reverseWithCharArray(String input){
		
		char inputStrArray[] = new char[input.length()];
		for(int i=input.length()-1, j=0; i>0 && j<input.length()-1; i--, j++)
			inputStrArray[j] = input.charAt(i);
		return String.valueOf(inputStrArray);
	}
	

}
