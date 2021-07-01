package ex07;
/*
 *	�θ� Ŭ����(�ڷ���)�� ���������� 
 *  �ڽ� ��ü�� ������ �� �ִ�. 
 *  
 *  Override
 *   - �θ� Ŭ������ �޼��带 �ڽ� Ŭ�������� ������ �� �� ����
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
	void print() {
		System.out.println("AŬ���� �޼���");
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
	
	/*
	 * �θ� Ŭ������ �޼���� ������ �������� ���ǵ� �޼���
	 * ���� �����ڰ� �۾��� �� ����
	 * �޼��� �̸� ����
	 * �Ű����� �ڷ��� ����
	 * ����!�Լ� ������ ��ɸ� �� ����
	 */
	@Override /*������̼�:�ڹ� ��� �ּ�*/
	void print() {
		System.out.println("BŬ���� �������̵� �޼���");
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
		
		obA.print();
		obB.print();
		
		A ob = obB;
		ob.print();	
		//������ �����̳� �߿��� ���� �ƴϰ�
		//� Ŭ������ ��ü(�ν��Ͻ�)�� ��������°�?
		//� �޼��尡 ������ ���� ��.(���� ���ε�)
	}
}






