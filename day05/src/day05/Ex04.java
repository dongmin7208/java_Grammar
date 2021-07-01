package day05;
//쓰지맙시다!
public class Ex04 {
	public static void main(String[] args) {
		AAA: for (int i = 0; i < 3; i++) {
			BBB: for (int j = 0; j < 3; j++) {
				System.out.print("*");
				//continue AAA;
				break AAA;
			}
			System.out.println();
		}
	}
}
