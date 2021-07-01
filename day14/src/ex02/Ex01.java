package ex02;

public class Ex01 {
	public static void main(String[] args) {
		Point.n = 1;
		Point.printN();
		
		Point p1 = new Point();
		p1.x = 10;	p1.y = 20;
		p1.n = 100;
		Point.printN();
		
		Point p2 = new Point();
		p2.x = 11;	p2.y = 22;
		p2.n = 111;
		
		p1.printPoint();
		Point.printN();
		System.out.println("======");
		p2.printPoint();
		Point.printN();
	}
}
