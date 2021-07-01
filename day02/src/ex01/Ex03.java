package ex01;

public class Ex03 {
	public static void main(String[] args) {
		byte a1 = 20;
		byte a2 = 20;
		byte ret = (byte) (a1 + a2);//Ä³½ºÆÃ
		
		int data = 258;
		byte b = (byte)data;
		System.out.println(b);
		
		int kor = 100;
		int eng = (int)90l;
		int mat = (int)3L;
		int sum = kor + eng + mat;
		//float avg = (float) (sum / 3.0);
		float avg = sum / 3.0f/*F*/;
		
		
		byte b1 = 20;
		byte b2 = 20;
		b1 = (byte)(b1 + b2);
		b1 += b2;
		
		int a = 10;
		a = a + 10;
		a += 10;
		
	}
}
