package string;

import java.util.Scanner;

public class ExtractString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(5/2);
		System.out.println("Enter the String: ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Updated this file");
		
		String inputStr = scanner.nextLine();
		for (int i=0; i<inputStr.length();i++){
			if(((int)inputStr.charAt(i)>=65 && (int)inputStr.charAt(i)<=90) || ((int)inputStr.charAt(i)>=97 && (int)inputStr.charAt(i)<=122) || (int)inputStr.charAt(i) == 32)
				System.out.print(inputStr.charAt(i));
			else
				System.out.println("\n");
		}
		
		//this is an apple 10 this is an apple 20 this is an apple 30 this is an apple 40
		scanner.close();

	}

}
