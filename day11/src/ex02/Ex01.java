package ex02;

//class Info{
//	String name;
//	int age;
//}

public class Ex01 {
	public static void main(String[] args) {
		//�̸�, ���̸� �����ϴ� ���α׷�
		Info[] infos = new Info[3];	//�������� �迭 ��ü ����
		infos[0] = new Info();	//��ü ����
		infos[0].name = "ȫ�浿";
		infos[0].age = 20;
		infos[1] = new Info();	//��ü ����
		infos[1].name = "�̼���";
		infos[1].age = 21;
		infos[2] = new Info();	//��ü ����
		infos[2].name = "������";
		infos[2].age = 22;
		
		for(int i = 0; i < infos.length; i++) {
			System.out.println(
					infos[i].name + "," + infos[i].age);
		}
	}
}











