package day06;
/*
 * 키보드 입력/콘솔 출력
 * 
 * 메서드 입력(매개변수) 메서드 출력(반환)
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
		//두 수를 입력받아 큰 수를 출력하는 메서드
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







