package day08;
/*
 * 변수: 하나의 데이터를 저장하는 공간
 * 배열: 동일한 자료의 데이터를 저장하는 연속된 공간
 * 배열은 객체(값/기능)
 * String객체
 */
public class Ex02 {
	public static void main(String[] args) {
		//배열을 만드는 방법 세 가지
		//1. 초기화 배열 생성
		int[] a = {1,2,3};
		for(int i = 0; i < 3; i++) {
			System.out.println(a[i]);
		}
		
		//2. 배열 참조 선언 후 나중에 배열 생성
		char[] c = null;
		c = new char[]{'h','e','l','l','o','w'};
		
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		//3. 배열 참조 선언 후 갯수만 이용해서 생성
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





