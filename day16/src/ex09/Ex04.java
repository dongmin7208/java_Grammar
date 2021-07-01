package ex09;

public class Ex04 {
	public static void main(String[] args) {
		Info str1 = new Info("hello", 20);
		Info str2 = new Info("hello", 20);
		Info str3 = new Info("HELLO", 40);
		Info str4 = str1;
		
		System.out.println(str1.toString());
		System.out.println(str1);	//���������� toString() ȣ���
		System.out.println(str2);
		
		System.out.println(str1.hashCode()); //JVM���� ��ü �ĺ� ��
		System.out.println(str2.hashCode()); 
		
		System.out.println(str1 == str2);	//toString()��� ��(��ü ��� Ȯ��)
		System.out.println(str1 == str4);
		
		System.out.println(str1.equals(str2));
		System.out.println(str4.equals(str1));
	}
}
