package day08;
/*
 * ����: �ϳ��� �����͸� �����ϴ� ����
 * �迭: ������ �ڷ��� �����͸� �����ϴ� ���ӵ� ����
 * �迭�� ��ü(��/���)
 * String��ü
 */
public class Ex03 {
	public static void main(String[] args) {
		//�迭�� ����� ��� �� ����
		//1. �ʱ�ȭ �迭 ����
		int[] a = {1,2,3};
		System.out.println(a[0]);
		System.out.println(a[1]);
		a[2] = 30;
		System.out.println(a[2]);
		
		//2. �迭 ���� ���� �� ���߿� �迭 ����
		char[] c = null;
		c = new char[]{'h','e','l','l','o'};
		
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println(c[3]);
		System.out.println(c[4]);
		//System.out.println(c[5]);
		
		//3. �迭 ���� ���� �� ������ �̿��ؼ� ����
		double[] d = null;
		d = new double[3];
		d[1] = 3.14;
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);		
	}
}





