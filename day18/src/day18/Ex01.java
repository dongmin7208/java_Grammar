package day18;

class A{
	void method() {
		method();
		System.out.println("A");
	}
}
class B extends A{
	void method() {
		System.out.println("B");
	}
	void test() {
		super.method();
		this.method();
		method();
		System.out.println(super.toString());
		System.out.println(this.toString());
	}
}

public class Ex01 {
	public static void main(String[] args) {
		A ob = new B();
		((B)ob).test();
	}
}












