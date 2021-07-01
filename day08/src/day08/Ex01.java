package day08;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		Random ran = new Random();
		int lo1 = 0;
		int lo2 = 0;
		int lo3 = 0;
		int lo4 = 0;
		int lo5 = 0;
		int lo6 = 0;
		lo1 = ran.nextInt(45) + 1;
		do {
			lo2 = ran.nextInt(45) + 1;
		}while(lo1 == lo2);
		do {
			lo3 = ran.nextInt(45) + 1;
		}while(lo3 == lo1 || lo3 == lo2);
		do {
			lo4 = ran.nextInt(45) + 1;
		}while(lo4 == lo1 || lo4 == lo2 || lo4 == lo3);
		do {
			lo5 = ran.nextInt(45) + 1;
		}while(lo5 == lo1 || lo5 == lo2 || lo5 == lo3 || lo5 == lo4);
		do {
			lo6 = ran.nextInt(45) + 1;
		}while(lo6 == lo1 || lo6 == lo2 || lo6 == lo3 || lo6 == lo4 || lo6 == lo5);
		
		System.out.printf("%d,%d,%d,%d,%d,%d\n", lo1, lo2, lo3, lo4, lo5, lo6);
	}
}
