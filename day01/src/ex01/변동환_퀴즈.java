package ex01;


public class ����ȯ_���� {

	public static void main(String[] args) {
		String name = "ȫ�浿", name2 = "�̼���";
		int age = 20, age2 = 28;
		String addr = "���¥��", addr2 = "�ٴ�";
		double height = 187.4, height2 = 176.7;
		char bloodType = 'B';
		String bloodType2 = "AB";
		
		System.out.println("=========================================");
		System.out.printf("�̸�\t����\t�ּ�\tŰ\t������\n");
		System.out.println("=========================================");
		System.out.printf("%s\t%d\t%s\t%.1f\t%c\t\n",name,age,addr,height,bloodType);
		System.out.println(name2+"\t"+age2+"\t"+addr2+"\t"+height2+"\t"+bloodType2);
	}

}
