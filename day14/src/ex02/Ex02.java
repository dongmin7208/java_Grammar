package ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 10;
		System.out.println(n1 == n2);
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1 == s2);
		
		String s3 = new Scanner(System.in).nextLine();
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
	}
}
