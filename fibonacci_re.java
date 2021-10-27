package Restart_programs;

import java.util.Scanner;

public class fibonacci_re {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for fibonacci series :");
		int n = sc.nextInt();
		int num = 0, num1 =1;
		for(int i=1;i<=n;i++) {
			int sum = num+num1;
			num=num1;
			num1=sum;
			System.out.println("the fibonacci series : "+sum);
		}
	}
}
