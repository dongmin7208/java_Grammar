package ex07;
/*
 * this: ��� �޼��带 ȣ���� ��ü�� �����ϴ� ����(�ʵ�)
 * ��� �޼����� 0��° �Ű������� ����
 * ���� this�Ű������� ������ �� ����(��ġ �ʴ� ��ü�� ���� ����� ���ɼ��� ����)
 * ���������� ��������� �̸��� �����ϱ� ���� ���
 * 
 */
public class Point {
	private int x;	//���� �ʱ�ȭ
	private int y;	//���� �ʱ�ȭ

	//����Ʈ ������
	public Point(/* Point this,*/){
		System.out.println("����Ʈ ������");
	}
	

	
	public Point(int x, int y) {
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
//	//setter : ��ü�� ���� �����ϴ� �޼���
//	public void setX(int x) {
//		this.x = x;
//	}
//	public void setY(int y) {
//		this.y = y;
//	}
//	
//	//getter : ��ü�� ���� ��ȯ�ϴ� �޼���
//	public int getX() {
//		return x;
//	}
//	public int getY() {
//		return y;
//	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
