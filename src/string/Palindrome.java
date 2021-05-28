package string;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check whether it is Palindrome or Not");
		System.out.println("Show updates");
		String inputStr = sc.nextLine();
		int len = inputStr.length();
		int num=0;
		if(len==0)
			System.out.println("Empty String.");
		else{
			for(int i=0, j= len - 1; i <= j; i++,j-- ){
				if (Character.toString(inputStr.charAt(i)).equalsIgnoreCase(Character.toString(inputStr.charAt(j)))){
					num+=1;
					continue;
				}
				else
					break;
			}
			if(num==((len/2)+(len%2))){
				System.out.println(inputStr+" is a Palindrome String");
				System.out.println("Success");
			}
			else
				System.out.println(inputStr+" is NOT a Palindrome String");
		}
		sc.close();
	}

}
