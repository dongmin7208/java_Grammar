package day06;
/*
 * Ű���� �Է�/�ܼ� ���
 * 
 * �޼��� �Է�(�Ű�����) �޼��� ���(��ȯ)
 * 
 */
public class Ex01 {
	
	public static int bigNum(int n1, int n2) {
		int ret = 0;
		if(n1 > n2) {
			ret = n1;
		}else {
			ret = n2;
		}
		return ret;
	}
	
	public static int nToNSum(int a, int b) {
		int ret = 0;
		if(a > b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		for(int i = a; i <= b; i++) {
			ret += i;
		}
		return ret;
	}
	
	
	public static void main(String[] args) {
		//�� ���� �Է¹޾� ū ���� ����ϴ� �޼���
		int n1 = 0;
		int n2 = 11;
		int ret = bigNum(n1, n2);
		System.out.println(ret);
		System.out.println(bigNum(n2, n1));
		ret = nToNSum(n1, n2);
		System.out.println(ret);

		ret = nToNSum(n2, n1);
		System.out.println(ret);
	}
}







