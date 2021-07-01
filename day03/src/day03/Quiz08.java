package day03;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int baseTime = 30;
		int basePrice = 3000;
		int perAddTime = 1;
		int perAddPrice = 50;
		int useTime = 0;
		int totalPrice = 0;
		
		useTime = Integer.parseInt(in.nextLine());
		if(useTime <= baseTime) {
			totalPrice = basePrice;
		}else {
			totalPrice = (useTime - baseTime) / perAddTime * perAddPrice;
			totalPrice += basePrice;
		}
		System.out.println(totalPrice);
	}
}
