package tv;

import java.util.Scanner;
public class Use{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		TV tv = new TV();
		Remote rc = new Remote();
		rc.tv = tv;
		//rc.setTV(tv); //���������� tv��ü�� ������ �� �ֵ��� ��
		
		while(true){
			tv.view();
			System.out.print("1.TV  2.������");
			int cho = Integer.parseInt(in.nextLine());
			System.out.println("1.����   2.ä��+  3.ä��-  4.����+  5.����-");
			int sel = Integer.parseInt(in.nextLine());
			
			switch(cho){
			case 1: System.out.println("TV");
					tv.intf(sel);break;
			case 2: System.out.println("������");
					rc.intf(sel); break;
			}
			
			
		}
		
	}
}
