package ex01;
//Ctrl+Shift+o
import java.util.Scanner;
/*
 * Wrapper class:�⺻ �ڷ����� ��ü���·� ����ϱ� ���� Ŭ����
 * 	boolean - Boolean
 * 	byte - Byte
 * 	short - Short
 * 	char - Character
 * 	int - Integer
 * 	long - Long
 * 	float - Float
 * 	double - Double
 */
public class Ex02 {
	public static void main(String[] args) {
		//Ű���� �Է��� �ʿ��ϸ� ����
		Scanner sc = new Scanner(System.in);
		
		//������ �Է¹޴� ���
		System.out.print("���� �Է�:");
		//int n1 = Integer.parseInt(sc.nextLine());
		long n1 = Long.parseLong(sc.nextLine());
		System.out.println(n1 + 1);
		
		//�Ǽ��� �Է¹޴� ���
		System.out.print("�Ǽ� �Է�:");
		//float f1 = Float.parseFloat(sc.nextLine());
		double f1 = Double.parseDouble(sc.nextLine());
		System.out.println(f1 + 1);
		
		//���� �ϳ��� �Է¹޴� ���
		System.out.print("���� �ϳ� �Է�:");
		char ch = sc.nextLine().charAt(0);
		System.out.println(ch);
		
		//���ڿ��� �Է¹޴� ���
		System.out.println("���ڿ� �Է�:");
		String str = sc.nextLine();
		System.out.println(str);
		
		
		
	}
}
