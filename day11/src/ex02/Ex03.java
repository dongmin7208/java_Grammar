package ex02;

//class Info{
//	String name;
//	int age;
//}

public class Ex03 {
	public static void main(String[] args) {
		//�̸�, ���̸� �����ϴ� ���α׷�
		Info[] infos = new Info[3];	//�������� �迭 ��ü ����
		
		infos[0] = new Info();	//��ü ����
		infos[0].setInfo("ȫ�浿", 20);
		
		infos[1] = new Info();	//��ü ����
		infos[1].setInfo("�̼���", 21);

		infos[2] = new Info();	//��ü ����
		infos[2].setInfo("������", 22);
		
		for(int i = 0; i < infos.length; i++) {
			infos[i].printInfo();
		}
	}
}











