package day09;

public class Ex01 {
	public static void main(String[] args) {
		//�迭�� �þ�� �ʴ´�.
		//�ڹٿ��� �迭�� ��ü�̸� �������� �����ȴ�.
		int[] arr = {1, 2, 3};	//3ĭ ¥�� �迭
		System.out.println("����:"+arr.length);
		int[] tmp = arr;
		arr = new int[6];	//6ĭ ¥�� �迭 ����
		for(int i = 0; i < tmp.length; i++) {
			arr[i] = tmp[i]; //���� �� ����
		}
		tmp = null;	//���� �迭 ���� ����
		System.out.println("����:"+arr.length);
		arr[3] = 4;	arr[4] = 5;	arr[5] = 6;
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
