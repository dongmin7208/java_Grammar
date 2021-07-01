package day03;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("╪Ж ют╥б:");
		int n = Integer.parseInt(in.nextLine());
		
		if( n%3 != 0 || n%5 == 0) {
			System.out.println(n);
		}
	}
}
