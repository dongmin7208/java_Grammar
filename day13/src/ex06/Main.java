package ex06;
/*
 * this() : �ٸ� �����ڸ� ȣ���ϴ� ����
 *  �������� ���� ù ��° �ٿ����� ������ ����
 *  �����ڸ� �����ε��Ͽ� �����ϴ� ��� �ٸ� �����ڸ� Ȱ��
 */
class Test{
	int a;
	Test(){
//		System.out.println("test()������ ȣ��"); //this()���� �ڵ� ���� �Ұ�
		this(5);
		System.out.println("test()������ ����");
	}
	Test(int a){
		System.out.println("test(int a) ������ ȣ��");
		this.a = a;
		System.out.println( this.a +"����" );
		this.show();
		System.out.println("test(int a) ������ ����");
	}	
	int show(){
		System.out.println("show()�޼ҵ� ȣ��");
		this.show(10);
		System.out.println("show()�޼ҵ� ����");
		return 0;
	}
	int show(int a){
		this.a = a;
		System.out.println(this.a + "����");
		System.out.println("show(int a)�޼ҵ�");
		return 0;
	}	
}
public class Main{
	public static void main(String[] args){
		Test ob1 = new Test();
		System.out.println("================");
		Test ob2 = new Test(100);
	}
}



