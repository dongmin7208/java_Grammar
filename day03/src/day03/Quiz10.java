package day03;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = "";
		int kor = 0, eng = 0, mat = 0, tot = 0;
		float avg = 0.0f;
			System.out.println("1. �л� ���");
			System.out.println("2. ����,����,���� ���� �Է�");
			System.out.println("3. �л� �̸� ���");
			System.out.println("4. ���� ���");
			System.out.println("5. ��� ���");
			System.out.println("6. �� ��");
			System.out.print("�Է�:");
			int select = in.nextInt();
			in.nextLine();
			switch (select) {
			case 1:
				System.out.print("�̸��Է�:");
				name = in.nextLine();
				System.out.println("��ϿϷ�.");
				break;
			case 2:
				System.out.print("��������:");
				kor = in.nextInt();
				System.out.print("��������:");
				eng = in.nextInt();
				System.out.print("��������:");
				mat = in.nextInt();
				tot = kor + eng + mat;
				avg = tot / 3.0f;
				in.nextLine();
				System.out.println("�Է¿Ϸ�.");
				break;
			case 3:
				System.out.println("�̸�:" + name);
				break;
			case 4:
				System.out.println("����:" + tot + "��");
				break;
			case 5:
				System.out.printf("���:%.2f",avg);
				break;
			case 6:
				System.out.println("���α׷� ����.");
				System.exit(0);
			default:
				System.out.println("�Է¿���!");
			}
	}
}
