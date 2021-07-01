package tv;

import java.util.Scanner;
public class Use{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		TV tv = new TV();
		Remote rc = new Remote();
		rc.tv = tv;
		//rc.setTV(tv); //리모컨에서 tv객체를 참조할 수 있도록 함
		
		while(true){
			tv.view();
			System.out.print("1.TV  2.리모컨");
			int cho = Integer.parseInt(in.nextLine());
			System.out.println("1.전원   2.채널+  3.채널-  4.볼륨+  5.볼륨-");
			int sel = Integer.parseInt(in.nextLine());
			
			switch(cho){
			case 1: System.out.println("TV");
					tv.intf(sel);break;
			case 2: System.out.println("리모컨");
					rc.intf(sel); break;
			}
			
			
		}
		
	}
}
