package ex01;
/*
 * ������ �����(������)�� ������ ����
 * �ڷ��� ������;	//����
 * �ڷ��� ������ = ��; //����� ���ÿ� �ʱ�ȭ
 */
public class Ex03 {
	public static void main(String[] args) {
		int age = 0;	//���� ���� �ʱ�ȭ
		age = 20;	//����
		System.out.println(age);
		
		double height = 0.0;
		height = 175.4;
		System.out.println(height);
		
		char bloodType = '\0';
		bloodType = 'B'; //'': ���Ϲ���
		System.out.println(bloodType);
		bloodType = 68;
		System.out.println(bloodType);
		
		String name = null;
		name = "�̱�ö"; //"~": ���ڿ�(String)
		System.out.println(name);
	}
}
