package Restart_programs;

import java.util.Scanner;

public class palindrome_re {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str , rev ="";
			str = sc.nextLine();
			for(int i = str.length()-1;i>=0;i--) {
				rev=rev+str.charAt(i);
				
			}
			if(str.equals(rev)) {
				System.out.println("given string is palindrome :");
			}else {
				System.out.println("given string is not palindrome ;");
			}
		
		
		

	}

}
