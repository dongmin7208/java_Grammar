package ex06;
/*
 *	�θ� Ŭ����(�ڷ���)�� ���������� 
 *  �ڽ� ��ü�� ������ �� �ִ�. 
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
	@Override
	void printA() {
		System.out.println(a + "," + b);
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
		B obB = new B();
		
		obA.printA();	//A
		obB.printA();	//B
		
		A ob = obB; //�θ� ���������� �ڽ� ��ü ����(��ĳ����)
		ob.printA(); //�������̵��� B�� �޼��� ȣ��
		
		System.out.println("obA�� �����ϴ� ��ü:" + obA);
		System.out.println("obB�� �����ϴ� ��ü:" + obB);
		System.out.println("ob�� �����ϴ� ��ü:" + ob);
		//obB. A, B�� ��� ��� ����
		//ob. A�� ����� ���� ����
		
		B ob2 = (B)ob; //�ٿ�ĳ����
		System.out.println("ob2�� �����ϴ� ��ü:" + ob2);
		
		B ob3 = (B)obA; //ĳ���� ����!
		//obA�� BŬ������ �ν��Ͻ��� �������� ����
	}
}






