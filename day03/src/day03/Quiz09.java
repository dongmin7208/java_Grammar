package day03;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("연산자 입력:");
		char op = in.nextLine().charAt(0);
		System.out.print("첫 번째 수 입력:");
		int n1 = in.nextInt();
		System.out.print("두 번째 수 입력:");
		int n2 = in.nextInt();
		int ret = 0;
		switch(op) {
		case '+': ret = n1 + n2; break;
		case '-': ret = n1 - n2; break;
		case '*': ret = n1 * n2; break;
		case '/': ret = n1 / n2; break;
		case '%': ret = n1 % n2; break;
		}
		System.out.println("결과:" + n1 + op + n2 + "=" + ret);
	}
}
