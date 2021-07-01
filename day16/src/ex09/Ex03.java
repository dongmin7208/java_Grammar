package ex09;

public class Ex03 {
	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");
		String str3 = new String("HELLO");
		String str4 = str1;
		
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
