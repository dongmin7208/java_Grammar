package ex09;
class A/* extends Object*/{
	A(){ System.out.println("A持失"); }
}
class B extends A{
	B(){ System.out.println("B持失"); }
}
class C extends B{
	C(){ System.out.println("C持失"); }
}
public class Ex02 {
	public static void main(String[] args) {
//		A oA = new A();
//		B oB = new B();
		C oC = new C();
	}
}
