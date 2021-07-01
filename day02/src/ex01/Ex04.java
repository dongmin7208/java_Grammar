package ex01;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("합격여부입력:");
		int n = Integer.parseInt(in.nextLine());
		System.out.println((n==1)?"합격":"불합격");
		
		System.out.print("연산자 입력:");
		char op = in.nextLine().charAt(0);
		System.out.print(op + "는"); 
		System.out.println(
				op == '+' ||
				op == '-' ||
				op == '*' ||
				op == '/' ||
				op == '%' 
				? "산술연산자 입니다."
				: "산술연산자가 아닙니다.");
	}
	
}
