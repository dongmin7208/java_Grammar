package day05;

public class Ex03 {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println(i+":1");
			if(i == 5) {
				//break;
				continue;
			}
			System.out.println(i+":2");
		}
	}
}
