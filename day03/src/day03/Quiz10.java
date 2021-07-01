package day03;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = "";
		int kor = 0, eng = 0, mat = 0, tot = 0;
		float avg = 0.0f;
			System.out.println("1. 학생 등록");
			System.out.println("2. 국어,영어,수학 점수 입력");
			System.out.println("3. 학생 이름 출력");
			System.out.println("4. 총점 출력");
			System.out.println("5. 평균 출력");
			System.out.println("6. 종 료");
			System.out.print("입력:");
			int select = in.nextInt();
			in.nextLine();
			switch (select) {
			case 1:
				System.out.print("이름입력:");
				name = in.nextLine();
				System.out.println("등록완료.");
				break;
			case 2:
				System.out.print("국어점수:");
				kor = in.nextInt();
				System.out.print("영어점수:");
				eng = in.nextInt();
				System.out.print("수학점수:");
				mat = in.nextInt();
				tot = kor + eng + mat;
				avg = tot / 3.0f;
				in.nextLine();
				System.out.println("입력완료.");
				break;
			case 3:
				System.out.println("이름:" + name);
				break;
			case 4:
				System.out.println("총점:" + tot + "점");
				break;
			case 5:
				System.out.printf("평균:%.2f",avg);
				break;
			case 6:
				System.out.println("프로그램 종료.");
				System.exit(0);
			default:
				System.out.println("입력오류!");
			}
	}
}
