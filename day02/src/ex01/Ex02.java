package ex01;
//Ctrl+Shift+o
import java.util.Scanner;
/*
 * Wrapper class:기본 자료형을 객체형태로 사용하기 위한 클래스
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
		//키보드 입력이 필요하면 선언
		Scanner sc = new Scanner(System.in);
		
		//정수를 입력받는 방법
		System.out.print("정수 입력:");
		//int n1 = Integer.parseInt(sc.nextLine());
		long n1 = Long.parseLong(sc.nextLine());
		System.out.println(n1 + 1);
		
		//실수를 입력받는 방법
		System.out.print("실수 입력:");
		//float f1 = Float.parseFloat(sc.nextLine());
		double f1 = Double.parseDouble(sc.nextLine());
		System.out.println(f1 + 1);
		
		//문자 하나를 입력받는 방법
		System.out.print("문자 하나 입력:");
		char ch = sc.nextLine().charAt(0);
		System.out.println(ch);
		
		//문자열을 입력받는 방법
		System.out.println("문자열 입력:");
		String str = sc.nextLine();
		System.out.println(str);
		
		
		
	}
}
