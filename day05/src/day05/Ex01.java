package day05;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("���� �� �Է�:");
			int line = Integer.parseInt(in.nextLine());
			int star = 1;
			int std = line/2;
			boolean flag = false;
			for(int i = 0; i < line; i++) {
				for(int j = 0; j < star; j++) {
					System.out.print("*");
				}
				System.out.println();
				if(i == std) {
					flag = !flag;
				}
				if(flag) {
					star--;
				}else {
					star++;
				}
			}
		}
	}
}
