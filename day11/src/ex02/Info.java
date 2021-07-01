package ex02;

public class Info {
	String name;
	int age;
	
	void printInfo() {
		System.out.println(name + "," + age);
	}
	
	void setInfo(String n, int a) {
		name = n;
		age = a;
	}
}
