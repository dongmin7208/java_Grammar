package day03;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("ù ��° ��:");
		int n1 = Integer.parseInt(in.nextLine());
		System.out.print("�� ��° ��:");
		int n2 = Integer.parseInt(in.nextLine());
		System.out.print("�� ��° ��:");
		int n3 = Integer.parseInt(in.nextLine());
		
		if( n2 >= n1 && n2 >= n3 ) {
			int tmp = n1;
			n1 = n2;
			n2 = tmp;
		}else if( n3 >= n1 && n3 >= n2 ) {
			int tmp = n1;
			n1 = n3;
			n3 = tmp;
		}
		if( n3 > n2 ) {
			int tmp = n2;
			n2 = n3;
			n3 = tmp;
		}
		
		System.out.println(n1+">"+n2+">"+n3);
		
	}
}




