package ex09;

public class Ex03 {
	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");
		String str3 = new String("HELLO");
		String str4 = str1;
		
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
