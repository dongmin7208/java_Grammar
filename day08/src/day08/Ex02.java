package day08;
/*
 * ����: �ϳ��� �����͸� �����ϴ� ����
 * �迭: ������ �ڷ��� �����͸� �����ϴ� ���ӵ� ����
 * �迭�� ��ü(��/���)
 * String��ü
 */
public class Ex02 {
	public static void main(String[] args) {
		//�迭�� ����� ��� �� ����
		//1. �ʱ�ȭ �迭 ����
		int[] a = {1,2,3};
		for(int i = 0; i < 3; i++) {
			System.out.println(a[i]);
		}
		
		//2. �迭 ���� ���� �� ���߿� �迭 ����
		char[] c = null;
		c = new char[]{'h','e','l','l','o','w'};
		
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		//3. �迭 ���� ���� �� ������ �̿��ؼ� ����
		double[] d = null;
		d = new double[3];
		d[0] = 3.141;
		d[1] = 3.142;
		d[2] = 3.143;
		
		for(double tmp : d) {
			System.out.println(tmp);
		}
	}
}





