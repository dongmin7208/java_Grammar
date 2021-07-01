package day03;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("점수 입력:");
		int score = in.nextInt();
		String grade = "";
		switch(score/10) {
		case 10:
		case 9: grade += "A"; break;
		case 8: grade += "B"; break;
		case 7: grade += "C"; break;
		case 6: grade += "D"; break;
		default: grade += "F"; break;
		}
		if(score > 60) {
			switch(score%10) {
			case 0: if(score != 100) break;
			case 9:
			case 8:
			case 7:
			case 6: 
			case 5: grade += "+";
			}
		}
		System.out.println(grade);
	}
}
