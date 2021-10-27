package Restart_programs;

import java.util.Scanner;

public class factorial_re {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for fibonacci series :");
		int num = sc.nextInt();
		int fact =1 ;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			System.out.println("The factorial of the number :"+fact);
		}
	}

}
