package ex09;

public class Ex04 {
	public static void main(String[] args) {
		Info str1 = new Info("hello", 20);
		Info str2 = new Info("hello", 20);
		Info str3 = new Info("HELLO", 40);
		Info str4 = str1;
		
		System.out.println(str1.toString());
		System.out.println(str1);	//내부적으로 toString() 호출됨
		System.out.println(str2);
		
		System.out.println(str1.hashCode()); //JVM에서 객체 식별 값
		System.out.println(str2.hashCode()); 
		
		System.out.println(str1 == str2);	//toString()결과 비교(객체 동등성 확인)
		System.out.println(str1 == str4);
		
		System.out.println(str1.equals(str2));
		System.out.println(str4.equals(str1));
	}
}
