package ex04;

public class Point {
	int x;	//���� �ʱ�ȭ
	int y;	//���� �ʱ�ȭ

	//����Ʈ ������
	Point(){
		System.out.println("����Ʈ ������");
	}
	
	Point(int x, int y){
		System.out.println("int, int ������");
		x = x;
		y = y;
	}
	
	void setXY(Point THIS, int x, int y) {
		System.out.println("setXY�� ȣ���� ��ü:" + THIS);
		THIS.x = x;
		THIS.y = y;
	}
	
	
	void printPoint() {
		System.out.println("[" + x + "," + y + "]");
	}
}
