package ex08;
/*
 * 상속을 사용하는 이유?
 * 	코드(클래스) 재사용
 * 상속 시 부모 클래스 참조로 자식객체 참조 가능
 * 오버라이딩을 이용하여 부모 메서드를 재정의 가능
 * 업캐스팅 시에도 실제 생성된 객체의 오버라이딩 된 메서드 호출 가능
 * 
 * 위 특징을 통해서 얻을 수 있는 것은 다형성!
 * 하나의 타입으로 다양한 하위 타입을 제어할 수 있음
 * 타입 == 클래스 == 자료형
 * 객체 == 인스턴스
 */
class 도형{
	void 도형의특징() {
		System.out.println("도형이다.");
	}
}
class 삼각형 extends 도형{
	void 삼각형특징() {
		System.out.println("꼭지점이 세 개다");
	}
	void 도형의특징() {
		System.out.println("삼각형이다.");
	}
}
class 사각형 extends 도형{
	void 사각형특징() {
		System.out.println("꼭지점이 네 개다");
	}
	void 도형의특징() {
		System.out.println("사각형이다.");
	}
}
class 오각형 extends 도형{
	void 오각형특징() {
		System.out.println("꼭지점이 다섯 개다");
	}
	void 도형의특징() {
		System.out.println("오각형이다.");
	}
}


public class Ex02 {
	public static void main(String[] args) {
		삼각형  t1 = new 삼각형();
		사각형  r1 = new 사각형();
		오각형  p1 = new 오각형();
		Object o = t1;
		
		t1.도형의특징();
		r1.도형의특징();
		p1.도형의특징();
		System.out.println("============");
		도형[] s1 = new 도형[] {
				t1, r1, p1
		};
		for(int i = 0; i < s1.length; i++) {
			s1[i].도형의특징();
			System.out.println(s1[i] instanceof 삼각형);
			System.out.println(s1[i] instanceof 사각형);
			System.out.println(s1[i] instanceof 오각형);
			if(s1[i] instanceof 삼각형) {
				((삼각형)s1[i]).삼각형특징();
			}else if(s1[i] instanceof 사각형) {
				((사각형)s1[i]).사각형특징();
			}else if(s1[i] instanceof 오각형) {
				((오각형)s1[i]).오각형특징();
			}
			System.out.println("-------------");
		}
		
	}
}
