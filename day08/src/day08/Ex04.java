package day08;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] lotto;
		lotto = new int[6];
		for(int i = 0; i < 6; i++) {
			lotto[i] = ran.nextInt(45) + 1; 
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + ", ");
		}	
	}
}
