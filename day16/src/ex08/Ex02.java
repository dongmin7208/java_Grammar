package ex08;
/*
 * ����� ����ϴ� ����?
 * 	�ڵ�(Ŭ����) ����
 * ��� �� �θ� Ŭ���� ������ �ڽİ�ü ���� ����
 * �������̵��� �̿��Ͽ� �θ� �޼��带 ������ ����
 * ��ĳ���� �ÿ��� ���� ������ ��ü�� �������̵� �� �޼��� ȣ�� ����
 * 
 * �� Ư¡�� ���ؼ� ���� �� �ִ� ���� ������!
 * �ϳ��� Ÿ������ �پ��� ���� Ÿ���� ������ �� ����
 * Ÿ�� == Ŭ���� == �ڷ���
 * ��ü == �ν��Ͻ�
 */
class ����{
	void ������Ư¡() {
		System.out.println("�����̴�.");
	}
}
class �ﰢ�� extends ����{
	void �ﰢ��Ư¡() {
		System.out.println("�������� �� ����");
	}
	void ������Ư¡() {
		System.out.println("�ﰢ���̴�.");
	}
}
class �簢�� extends ����{
	void �簢��Ư¡() {
		System.out.println("�������� �� ����");
	}
	void ������Ư¡() {
		System.out.println("�簢���̴�.");
	}
}
class ������ extends ����{
	void ������Ư¡() {
		System.out.println("�������� �ټ� ����");
	}
	void ������Ư¡() {
		System.out.println("�������̴�.");
	}
}


public class Ex02 {
	public static void main(String[] args) {
		�ﰢ��  t1 = new �ﰢ��();
		�簢��  r1 = new �簢��();
		������  p1 = new ������();
		Object o = t1;
		
		t1.������Ư¡();
		r1.������Ư¡();
		p1.������Ư¡();
		System.out.println("============");
		����[] s1 = new ����[] {
				t1, r1, p1
		};
		for(int i = 0; i < s1.length; i++) {
			s1[i].������Ư¡();
			System.out.println(s1[i] instanceof �ﰢ��);
			System.out.println(s1[i] instanceof �簢��);
			System.out.println(s1[i] instanceof ������);
			if(s1[i] instanceof �ﰢ��) {
				((�ﰢ��)s1[i]).�ﰢ��Ư¡();
			}else if(s1[i] instanceof �簢��) {
				((�簢��)s1[i]).�簢��Ư¡();
			}else if(s1[i] instanceof ������) {
				((������)s1[i]).������Ư¡();
			}
			System.out.println("-------------");
		}
		
	}
}
