package ex01;

public class HelloJava {
	public static void main(String[] args) {
		int age1 = 20;	int age2 =28;
		String name1 = "홍길동"; String name2 = "이순신";
		String adress1 = "산골짜기"; String adress2 = "바다";
		double height1 = 187.4; double height2 = 176.7;
		char bloodType1 = 'B'; String bloodType2 = "AB";
		
		System.out.println("===============================================================");
		System.out.println(" 이름\t나이\t\t주소\t\t키\t\t혈액형");
		System.out.println("===============================================================");
		System.out.println(" "+name1+"\t"+age1+"\t\t"+adress1+"\t\t"+height1+"\t\t"+bloodType1);
		System.out.println(" "+name2+"\t"+age2+"\t\t"+adress2+"\t\t"+height2+"\t\t"+bloodType2);
	}
}
