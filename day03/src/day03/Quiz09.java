package day03;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������ �Է�:");
		char op = in.nextLine().charAt(0);
		System.out.print("ù ��° �� �Է�:");
		int n1 = in.nextInt();
		System.out.print("�� ��° �� �Է�:");
		int n2 = in.nextInt();
		int ret = 0;
		switch(op) {
		case '+': ret = n1 + n2; break;
		case '-': ret = n1 - n2; break;
		case '*': ret = n1 * n2; break;
		case '/': ret = n1 / n2; break;
		case '%': ret = n1 % n2; break;
		}
		System.out.println("���:" + n1 + op + n2 + "=" + ret);
	}
}
