package ex05;
/*
 * ��ü ���⿡�� ��� : Ŭ������ ����
 * ���ο� Ŭ������ ������ �� ���� Ŭ������ ����� �״�� ���
 * �߰����� ����� �����ϰ� ���� ��
 * 
 */
class A{
	int a;
	A(){
		System.out.println("A����");
	}
	A(int a){
		System.out.println("A����(int)");
		this.a = a;
	}
	void printA() {
		System.out.println(a);
	}
}

class B extends A{
	int b;
	B(){
		super(); //�θ� ������ ȣ��
		System.out.println("B����");
	}
	B(int b){
		//super(b);//�θ� ������ ����
		System.out.println("B����(int)");
		this.b = b;
	}
	B(int a, int b){
		super(a);
		System.out.println("B����(int, int)");
		this.b = b;
	}
	void printB() {
		System.out.println(b);
	}
	
	void printAB() {
		System.out.println(a + "," + b);
	}
}


public class Ex01 {
	public static void main(String[] args) {
		A obA = new A();
		obA.printA();
		System.out.println("=====");
		B obB = new B();
		obB.printAB();
		System.out.println("=====");
		A obA2 = new A(10);
		obA2.printA();
		System.out.println("=====");
		B obB2 = new B(20);
		obB2.printAB();
		System.out.println("=====");
		B obB3 = new B(10, 20);
		obB3.printAB();
	}
}
