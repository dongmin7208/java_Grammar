package ex01;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�հݿ����Է�:");
		int n = Integer.parseInt(in.nextLine());
		System.out.println((n==1)?"�հ�":"���հ�");
		
		System.out.print("������ �Է�:");
		char op = in.nextLine().charAt(0);
		System.out.print(op + "��"); 
		System.out.println(
				op == '+' ||
				op == '-' ||
				op == '*' ||
				op == '/' ||
				op == '%' 
				? "��������� �Դϴ�."
				: "��������ڰ� �ƴմϴ�.");
	}
	
}
