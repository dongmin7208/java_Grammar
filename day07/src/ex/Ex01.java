package ex;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		Random random = new Random();	//랜덤객체 생성
		int lotto1 = 0;
		int lotto2 = 0;
		int lotto3 = 0;
		int lotto4 = 0;
		int lotto5 = 0;
		int lotto6 = 0;
		for(int i = 0; i < 5; i++) {
			lotto1 = random.nextInt(45) + 1;
			lotto2 = random.nextInt(45) + 1;
			lotto3 = random.nextInt(45) + 1;
			lotto4 = random.nextInt(45) + 1;
			lotto5 = random.nextInt(45) + 1;
			lotto6 = random.nextInt(45) + 1;
		}
		System.out.print(lotto1 + ",");
		System.out.print(lotto2 + ",");
		System.out.print(lotto3 + ",");
		System.out.print(lotto4 + ",");
		System.out.print(lotto5 + ",");
		System.out.println(lotto6);
		//중복 값이 없도록 만들어보세요
	}
}
