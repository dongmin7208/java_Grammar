package ex05;
/*
 * this: ��� �޼��带 ȣ���� ��ü�� �����ϴ� ����(�ʵ�)
 * ��� �޼����� 0��° �Ű������� ����
 * ���� this�Ű������� ������ �� ����(��ġ �ʴ� ��ü�� ���� ����� ���ɼ��� ����)
 * ���������� ��������� �̸��� �����ϱ� ���� ���
 * 
 */
public class Point {
	int x;	//���� �ʱ�ȭ
	int y;	//���� �ʱ�ȭ

	//����Ʈ ������
	Point(/* Point this,*/){
		System.out.println("����Ʈ ������");
	}
	
	Point(/* Point this,*/int x, int y){
		System.out.println("int, int ������");
		this.x = x;
		this.y = y;
	}
	
	void setXY(/* Point this,*/ int x, int y) {
		System.out.println("setXY�� ȣ���� ��ü:" + this);
		this.x = x;
		this.y = y;
	}
	
	
	void printPoint(/* Point this,*/) {
		System.out.println("[" + this.x + "," + this.y + "]");
	}
}
