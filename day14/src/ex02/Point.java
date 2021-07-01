package ex02;

public class Point {
	static int n;
	int x;
	int y;
	
	void printPoint() {
		System.out.println("[" + x + "," + y + "]");
		System.out.println("n : " + n);
	}
	static void printN() {
		System.out.println("n : " + n);
	}
}
