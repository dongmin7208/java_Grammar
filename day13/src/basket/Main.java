package basket;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BasketCounter bc = new BasketCounter();
		bc.setHandicap(30);
		while(true) {
			System.out.println("1. 2. 3.");
			System.out.print("����(0 ����):");
			int s = Integer.parseInt(in.nextLine());
			if(s == 0) break;
			bc.setGoal(s-1);
		}
		System.out.println("��� ����!");
		for(int i = 0; i < 3; i++) {
			System.out.println(i+1+"�� ��:" + bc.getGoalCount(i) + "(" + bc.getScoreCount(i) + ")");
		}
		System.out.println("�� ��:" + bc.getTotalGoalCount() + "(" + bc.getTotalScoreCount()+ ")");
	}
}
