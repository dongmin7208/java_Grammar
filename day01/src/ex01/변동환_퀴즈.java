package ex01;


public class 변동환_퀴즈 {

	public static void main(String[] args) {
		String name = "홍길동", name2 = "이순신";
		int age = 20, age2 = 28;
		String addr = "산골짜기", addr2 = "바다";
		double height = 187.4, height2 = 176.7;
		char bloodType = 'B';
		String bloodType2 = "AB";
		
		System.out.println("=========================================");
		System.out.printf("이름\t나이\t주소\t키\t혈액형\n");
		System.out.println("=========================================");
		System.out.printf("%s\t%d\t%s\t%.1f\t%c\t\n",name,age,addr,height,bloodType);
		System.out.println(name2+"\t"+age2+"\t"+addr2+"\t"+height2+"\t"+bloodType2);
	}

}
