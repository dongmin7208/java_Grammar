package ex01;
/*
 * 변수는 사용자(개발자)가 공간을 선언
 * 자료형 변수명;	//선언
 * 자료형 변수명 = 값; //선언과 동시에 초기화
 */
public class Ex03 {
	public static void main(String[] args) {
		int age = 0;	//변수 선언 초기화
		age = 20;	//대입
		System.out.println(age);
		
		double height = 0.0;
		height = 175.4;
		System.out.println(height);
		
		char bloodType = '\0';
		bloodType = 'B'; //'': 단일문자
		System.out.println(bloodType);
		bloodType = 68;
		System.out.println(bloodType);
		
		String name = null;
		name = "이규철"; //"~": 문자열(String)
		System.out.println(name);
	}
}
