package ex02;

//class Info{
//	String name;
//	int age;
//}

public class Ex01 {
	public static void main(String[] args) {
		//이름, 나이를 저장하는 프로그램
		Info[] infos = new Info[3];	//참조변수 배열 객체 생성
		infos[0] = new Info();	//객체 생성
		infos[0].name = "홍길동";
		infos[0].age = 20;
		infos[1] = new Info();	//객체 생성
		infos[1].name = "이순신";
		infos[1].age = 21;
		infos[2] = new Info();	//객체 생성
		infos[2].name = "강감찬";
		infos[2].age = 22;
		
		for(int i = 0; i < infos.length; i++) {
			System.out.println(
					infos[i].name + "," + infos[i].age);
		}
	}
}











